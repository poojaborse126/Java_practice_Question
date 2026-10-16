package company;

public class ITDepartment extends Department{
	String technology;

	ITDepartment(String name, int count, String technology) {
		super(name, count);
		this.technology = technology;
	}

	void display() {
		System.out.println(departmentName);
		System.out.println(employeeCount);
		System.out.println(technology);
	}
}
