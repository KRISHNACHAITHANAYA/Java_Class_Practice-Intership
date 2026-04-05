package com.food.java;


class Customers extends User {

	public Customers(String name, String phone) {
		super(name, phone);
	}
	
	@Override
	public void displayDetails() {
		System.out.print("Customer:" + name + "PhoneNumber:" + phone );
	}
	
	//special method
	public Order placeOrder(String item ,Restaurant restaurant) {
		System.out.println(name +" palced order for " + item);
		return new Order(this, restaurant, item);

		
	}	
		
	}

