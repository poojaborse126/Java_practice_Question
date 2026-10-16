package app;

public class GraduateStudent extends Student {
	String specialization;

	GraduateStudent(String name, int rollNo, String specialization) {
		super(name, rollNo);
		this.specialization = specialization;
	}

	void display() {
		System.out.println(name);
		System.out.println(rollNo);
		System.out.println(specialization);
	}
}
