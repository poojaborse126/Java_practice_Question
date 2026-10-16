package bank;

public class HRManager extends Employee {

	HRManager(String name, double salary) {
		super(name, salary);
	}

	void displayRecord() {
		System.out.println(name);
		System.out.println(salary);
	}
}
