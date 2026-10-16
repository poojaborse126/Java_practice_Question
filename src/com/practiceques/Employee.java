package com.practiceques;

public class Employee {

	String name;
	double basicSalary;

	Employee(String name, double basicSalary) {
		this.name = name;
		this.basicSalary = basicSalary;
	}

	double calculateHRA() {
		return basicSalary * 0.20;
	}

	double calculateGrossSalary() {
		return basicSalary + calculateHRA();
	}

	void display() {
		System.out.println("Name: " + name);
		System.out.println("HRA: " + calculateHRA());
		System.out.println("Gross Salary: " + calculateGrossSalary());
	}
}
