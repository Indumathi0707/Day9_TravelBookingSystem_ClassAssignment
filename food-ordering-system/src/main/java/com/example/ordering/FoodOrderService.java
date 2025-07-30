package com.example.ordering;

public class FoodOrderService {
	private Customer customer;
	private Restaurent restaurent;
	
	public FoodOrderService(Customer customer, Restaurent restaurent) {
		this.customer = customer;
		this.restaurent = restaurent;
	}
	
	public void placeOrder() {
		if(restaurent.getAvailableCuisine().contains(customer.getCuisine())) {
			System.out.println("Order successfull!");
			System.out.println("Customer: " + customer.getName());
			System.out.println("Restuarent: " + restaurent.getName());
			System.out.println("Preferred cuisine: " + customer.getCuisine());
		}
	}
	
}
