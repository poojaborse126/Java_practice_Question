package app;

public class Doctor extends HospitalStaff {
	String specialization;

	Doctor(String name, String specialization) {
		super(name, "Medical");
		this.specialization = specialization;
	}

	void displayDoctor() {
		display();
		System.out.println("Specialization: " + specialization);
	}
}
