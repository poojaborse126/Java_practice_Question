package app;

public class Employee {
	String name;
	double salary;

	Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	void displayDetails() {
		System.out.println(name);
		System.out.println(salary);
	}
}
