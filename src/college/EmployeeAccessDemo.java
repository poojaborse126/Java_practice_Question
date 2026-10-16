package college;

public class EmployeeAccessDemo {

	public static void main(String[] args) {
		
		Employee e = new Employee();

		System.out.println(e.name);
		System.out.println(e.salary);
		System.out.println(e.departmentId);

		e.display();
		
	}
}
