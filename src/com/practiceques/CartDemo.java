package com.practiceques;

public class CartDemo {

	public static void main(String[] args) {
		CartItem a = new CartItem("Keyboard", 800, 2);
		CartItem b = new CartItem("Mouse", 400, 1);

		System.out.println(a.productName + ": " + a.getTotal());
		System.out.println(b.productName + ": " + b.getTotal());
	}
}
