package store;

public class BikesDiscount implements DiscountCalculator{
	public float calculateDiscount(float itemAmount, OrderItem orderItem) {
		float discount=0;
        discount = itemAmount * 20 / 100;
        return discount;
	}
}
