package store;

public class BikesDiscount implements DiscountCalculator{
	public float calculateDiscount(OrderItem orderItem) {
		float itemAmount = orderItem.calculateTotalAmount();
		float discount=0;
        discount = itemAmount * 20 / 100;
        return discount;
	}
}
