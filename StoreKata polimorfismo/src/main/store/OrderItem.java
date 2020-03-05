package store;

public class OrderItem {
	
	private Product product;
	private int quantity;

	/*
	 * Order Item Constructor
	 */
	public OrderItem(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	
	public Product getProduct() {
		return product;
	}

	public int getQuantity() {
		return quantity;
	}
	float calculateTotalForItem() {
		float itemAmount = calculateTotalAmount();
        float discount=0;
        DiscountCalculator discountCalculator = createDiscountCalculator();
        discount = discountCalculator.calculateDiscount(itemAmount, this);
        return itemAmount - discount;
	}
	float calculateTotalAmount() {
		return getProduct().getUnitPrice() * getQuantity();
	}
	private DiscountCalculator createDiscountCalculator() {
		DiscountCalculator discountCalculator = null;
		if (getProduct().getCategory() == ProductCategory.Accessories) {
			discountCalculator = new AccesoriesDiscount();
		}
		if (getProduct().getCategory() == ProductCategory.Bikes) {
			discountCalculator = new BikesDiscount();
		}
		if (getProduct().getCategory() == ProductCategory.Clothing) {
			discountCalculator = new ClothingDiscount();
		}
		return discountCalculator;
	}
}
