package store;

public class AccesoriesDiscount implements DiscountCalculator{
	public float calculateDiscount(float itemAmount,OrderItem orderItem) {
		float totalItem = 0;
		if (itemAmount >= 100) {
			totalItem = itemAmount - applyPercentage(itemAmount,10);
		}
		return totalItem;
	}
	private float applyPercentage(float amount, int percentage) {
		return amount * percentage / 100;
	}
}
