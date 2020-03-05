package store;

public class AccesoriesDiscount implements DiscountCalculator{
	public float calculateDiscount(OrderItem orderItem) {
		float itemAmount = orderItem.calculateTotalAmount();
		float discount=0;
        if (itemAmount >= 100) 
            discount = itemAmount * 10 / 100;
        return discount;
	}
}
