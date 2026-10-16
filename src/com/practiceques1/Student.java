package com.practiceques1;

public class Student {

	private String name;
	private double marks;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setMarks(double marks) {
		if (marks >= 0 && marks <= 100) {
			this.marks = marks;
		}
	}

	public double getMarks() {
		return marks;
	}
}
