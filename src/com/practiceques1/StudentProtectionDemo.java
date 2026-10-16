package com.practiceques1;

public class StudentProtectionDemo {

	public static void main(String[] args) {
		Student s = new Student();
		s.setName("Neha");
		s.setMarks(88);

		System.out.println(s.getName());

		System.out.println(s.getMarks());
	}
}
