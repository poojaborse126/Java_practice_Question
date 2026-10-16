package company;

public class Teacher extends SchoolPerson {
	String subject;

	Teacher(String name, String subject) {
		super(name);
		this.subject = subject;
	}

	void displayTeacher() {
		displayName();
		System.out.println(subject);
	}
}
