package com.practiceques;

public class Patient {

	int patientId;
	String name;
	int age;
	double consultationFee;

	void display() {
		System.out.println("Patient ID: " + patientId);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Consultation Fee: " + consultationFee);
	}
}
