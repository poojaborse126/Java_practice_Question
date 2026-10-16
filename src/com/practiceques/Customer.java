package com.practiceques;

public class Customer {

	int customerId;
	String name;
	String city;

	Customer(int customerId, String name, String city) {
		this.customerId = customerId;
		this.name = name;
		this.city = city;
	}

	void display() {
		System.out.println(customerId + " " + name + " " + city);
	}
}
