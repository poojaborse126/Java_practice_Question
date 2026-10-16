package com.practiceques;

public class SalaryDemo {

	public static void main(String[] args) {
		
		SalaryCalculator s = new SalaryCalculator();

		double salary = s.calculateSalary(30000, 5000);

		System.out.println("Total Salary: Rs. " + salary);
	}
}
