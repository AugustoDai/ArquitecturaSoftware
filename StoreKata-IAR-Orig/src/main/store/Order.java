package store;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Order {

	private Customer customer;
	private Salesman salesman;
	private Date orderedOn;
	private String deliveryStreet;
	private String deliveryCity;
	private String deliveryCountry;
	private Set<OrderItem> items;

	public Order(Customer customer, Salesman salesman, String deliveryStreet, String deliveryCity, String deliveryCountry, Date orderedOn) {
		this.customer = customer;
		this.salesman = salesman;
		this.deliveryStreet = deliveryStreet;
		this.deliveryCity = deliveryCity;
		this.deliveryCountry = deliveryCountry;
		this.orderedOn = orderedOn;
		this.items = new HashSet<OrderItem>();
	}

	public Customer getCustomer() {
		return customer;
	}

	public Salesman getSalesman() {
		return salesman;
	}

	public Date getOrderedOn() {
		return orderedOn;
	}

	public String getDeliveryStreet() {
		return deliveryStreet;
	}

	public String getDeliveryCity() {
		return deliveryCity;
	}

	public String getDeliveryCountry() {
		return deliveryCountry;
	}

	public Set<OrderItem> getItems() {
		return items;
	}

	public float getOrderTotal() {
		float totalItems = 0;
		int shipping = 15;
		for (OrderItem item : items) {
			float totalItem = 0;
			float itemAmount = item.getProduct().getUnitPrice() * item.getQuantity();
			if (isAccesorie(item)) {
				if (itemAmount >= 100) {
					totalItem = itemAmount - getDiscount(itemAmount,10);
				}
			}
			if (isABike(item)) {
				// 20% discount for Bikes
				totalItem = itemAmount - getDiscount(itemAmount,20);
			}
			if (isAClothing(item)) {
				if (item.getQuantity() > 2) {
					totalItem = itemAmount - item.getProduct().getUnitPrice();
				}
			}
			totalItems += totalItem;
		}
		
		totalItems = totalItems + getDiscount(totalItems,5);
		if (this.deliveryCountry == "USA"){
			// total=totalItems + tax + 0 shipping
			shipping = 0;
		}

		// total=totalItemst + tax + 15 shipping
		return totalItems + shipping;
	}
	private float getDiscount(float amount, int percentage) {
		return amount * percentage / 100;
	}
	private boolean isAClothing(OrderItem item) {
		return item.getProduct().getCategory() == ProductCategory.Clothing;
	}

	private boolean isABike(OrderItem item) {
		return item.getProduct().getCategory() == ProductCategory.Bikes;
	}

	private boolean isAccesorie(OrderItem item) {
		return item.getProduct().getCategory() == ProductCategory.Accessories;
	}
}
