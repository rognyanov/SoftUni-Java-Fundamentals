package com.rado.models;

public class Student implements Comparable<Student>{
	private String _firstName;
	private String _lastName;
	private double _grade;
	
	public Student(String firstName, String lastName, double grade) {
		super();
		_firstName = firstName;
		_lastName = lastName;
		_grade = grade;
	}

	public String getFirstName() {
		return _firstName;
	}

	public String getLastName() {
		return _lastName;
	}

	public double getGrade() {
		return _grade;
	}

	@Override
	public int compareTo(Student other) {
		return Double.compare(other.getGrade(), getGrade());
	}
	
}
