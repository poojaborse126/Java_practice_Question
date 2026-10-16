package college;

public class Employee {

	public String name = "Priya";
	protected double salary = 50000;
	int departmentId = 20;
	private String password = "private";

	public void display() {
		System.out.println(name);
		System.out.println(salary);
		System.out.println(departmentId);
		System.out.println(password);
	}
}
