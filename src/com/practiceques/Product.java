package com.practiceques;

public class Product {

	int productId = 501;
	String productName = "Laptop";
	double price = 55000;
	int quantity = 5;

	void displayDetails() {
		System.out.println("Product ID: " + productId);
		System.out.println("Product: " + productName);
		System.out.println("Price: " + price);
		System.out.println("Quantity: " + quantity);
	}
}
