package com.practiceques1;

public class Employee {

	static String companyName = "Kiran Academy";
	int employeeId;
	String name;

	Employee(int employeeId, String name) {
		this.employeeId = employeeId;
		this.name = name;
	}

	void display() {
		System.out.println(companyName);
		System.out.println(employeeId + " " + name);
	}
}
