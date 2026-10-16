package com.practiceques;

public class CartItem {

	String productName;
	double price;
	int quantity;

	CartItem(String productName, double price, int quantity) {
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	double getTotal() {
		return price * quantity;
	}
}
