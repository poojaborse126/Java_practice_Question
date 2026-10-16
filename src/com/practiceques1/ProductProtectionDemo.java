package com.practiceques1;

public class ProductProtectionDemo {

	public static void main(String[] args) {
		Product p = new Product("Laptop", 55000);
		p.setPrice(52000);

		System.out.println(p.getName());
		System.out.println(p.getPrice());
	}
}
