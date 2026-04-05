package com.food.java;

 abstract class User{
	protected String name;
	protected String phone;
	
	//constructors
	public User(String name, String phone) {
//		super();
		this.name = name;
		this.phone = phone;
	}
	//getters
	public String getName() {
		return name;
	}
	public String getPhoneNumber() {
		return phone;
	}
	
	public abstract void displayDetails();
	
}

