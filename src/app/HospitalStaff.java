package app;

public class HospitalStaff {
	String name;
	String department;

	HospitalStaff(String name, String department) {
		this.name = name;
		this.department = department;
	}

	void display() {
		System.out.println(name + " - " + department);
	}
}
