package com.practiceques1;

public class CustomerAddressDemo {

	public static void main(String[] args) {
		
		Address a = new Address("Pune", "Maharashtra");
		Customer c = new Customer("Rahul", a);

		c.display();
	}
}
