package com.food.java;

import java.util.Scanner;

public class Main {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        // Customer Input
		        System.out.print("Enter Customer Name: ");
		        String cname = sc.nextLine();

		        System.out.print("Enter Customer Phone: ");
		        String cphone = sc.nextLine();

		        Customers customer = new Customers(cname, cphone);

		        // Restaurant Input
		        System.out.print("Enter Restaurant Name: ");
		        String rname = sc.nextLine();
		        Restaurant restaurant = new Restaurant(rname);

		        // Delivery Partner Input
		        System.out.print("Enter Delivery Partner Name: ");
		        String dpname = sc.nextLine();

		        System.out.print("Enter Delivery Partner Phone: ");
		        String dpphone = sc.nextLine();
		        DeliveryPartners dp = new DeliveryPartners(dpname, dpphone);

		        // Order Input
		        System.out.print("Enter Food Item: ");
		        String item = sc.nextLine();

		        // Flow Execution
		        customer.displayDetails();
		        Order order = customer.placeOrder(item, restaurant);
		        restaurant.prepareOrder(order);
		        dp.deliveryOrder(order);
		        order.displayOrder();

		        sc.close();
		    }
		}


