package store;

public class AccesoriesDiscount implements DiscountCalculator{
	public float calculateDiscount(float itemAmount, OrderItem orderItem) {
		float discount=0;
        if (itemAmount >= 100) 
            discount = itemAmount * 10 / 100;
        return discount;
	}
}
