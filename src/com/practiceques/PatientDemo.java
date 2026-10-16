package com.practiceques;

public class PatientDemo {

	public static void main(String[] args) {
		
		Patient p = new Patient();
		p.patientId = 101;
		p.name = "Sneha";
		p.age = 28;
		p.consultationFee = 500;

		p.display();
	}
}
