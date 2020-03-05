package store;

public class ClothingDiscount implements DiscountCalculator {
	public float calculateDiscount(OrderItem orderItem) {
		float discount=0;
        if (orderItem.getQuantity() > 2) 
        	discount = orderItem.getProduct().getUnitPrice();
		return discount;
	}
}
