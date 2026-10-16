package com.practiceques1;

public class CustomerAccountDemo {

	public static void main(String[] args) {
		CustomerAccount c = new CustomerAccount("Amit", 5000);
		c.deposit(1000);

		System.out.println(c.getCustomerName());
		System.out.println(c.getBalance());
	}
}
