package com.food.java;

public class Restaurant {
	private String name;
	
	public Restaurant(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void prepareOrder(Order order) {
		System.out.println( name+"is preparing the order");
		
	}

	
}
