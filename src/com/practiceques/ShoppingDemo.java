package com.practiceques;

public class ShoppingDemo {

	public static void main(String[] args) {
		
		ShoppingBill bill = new ShoppingBill();

		System.out.println("Total: Rs. " + bill.calculateBill(500, 3));
	}
}
	