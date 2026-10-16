package com.practiceques1;

public class Customer {

	String name;
	Address address;

	Customer(String name, Address address) {
		this.name = name;
		this.address = address;
	}

	void display() {
		System.out.println(name);
		System.out.println(address.city);

		System.out.println(address.state);
	}
}
