package com.food.java;

class DeliveryPartners extends User {

	//constructors
	public DeliveryPartners(String name, String phone) {
		super(name, phone);
	}
	
	@Override
	public void displayDetails() {
		System.out.println("Delivery Parteners:" + name );
	}
	
	public void deliveryOrder(Order order) {
//		order.updateStatus("Delivered");
		System.out.println(name +"Order deliverd");
	}
}
 