package hr;

import company.Employee1;

public class Manager extends Employee1{
	public Manager(String name, double salary) {
		super(name, salary);
	}

	public void display() {
		System.out.println(name);
		System.out.println(salary);
	}
}
