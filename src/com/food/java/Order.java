package com.food.java;

public class Order {
	private Customers customers;
	private Restaurant restaurant;
	private String item;
	private String status;
	
    public Order(Customers customer, Restaurant restaurant, String item) {
        this.customers = customer;
        this.restaurant = restaurant;
        this.item = item;
        this.status = "Placed";
    }

	public Order(String status) {
		super();
		this.status = status;
		System.out.println("Order status: " + status);
	}
	
	public void displayOrder() {
		System.out.println("---------Order Details----------");
		System.out.println("Customer Name:" + customers.name);
		System.out.println("Customer Phone Number:" + customers.phone);
		System.out.println("Restarant Name:" + restaurant.getName());
		System.out.println("Item" + item);
		System.out.println("Status" + status);
	}
    
}
 