package com.practiceques;

public class MobileDemo {

	public static void main(String[] args) {
		
		Mobile m1 = new Mobile();
		m1.brand = "Samsung";
		m1.price = 25000;

		Mobile m2 = new Mobile();
		m2.brand = "Apple";
		m2.price = 70000;

		m1.display();
		m2.display();
	}
}
