package store;

public class ClothingDiscount implements DiscountCalculator {
	public float calculateDiscount(float itemAmount,OrderItem orderItem) {
		float totalItem = 0;
		if (orderItem.getQuantity() > 2) {
			totalItem = itemAmount - orderItem.getProduct().getUnitPrice();
		}
		return totalItem;
	}
}
