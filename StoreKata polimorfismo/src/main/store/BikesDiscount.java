package store;

public class BikesDiscount implements DiscountCalculator{
	public float calculateDiscount(float itemAmount,OrderItem orderItem) {
		return itemAmount - applyPercentage(itemAmount,20);
	}
	private float applyPercentage(float amount, int percentage) {
		return amount * percentage / 100;
	}
}
