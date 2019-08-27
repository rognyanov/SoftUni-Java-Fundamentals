package com.rado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.rado.models.Student;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputCount = Integer.parseInt(scanner.nextLine());
		
		List<Student> students = new ArrayList<Student>();
		
		for(int i = 0; i < inputCount; i++) {
			String[] inputData = scanner.nextLine().split(" ");
			
			processAddStudentCommand(students, inputData);
			}
		
		scanner.close();
		
		students
			.stream()
			.sorted()
			.forEach(
					x->System.out.printf("%s %s %.2f%n", 
										x.getFirstName(), 
										x.getLastName(), 
										x.getGrade())
					);
	}

	private static void processAddStudentCommand(List<Student> students, String[] inputData) {
		String firstName = inputData[0];
		String lastName = inputData[1];
		double grade = Double.parseDouble(inputData[2]);
		
		Student newStudent = new Student(firstName, lastName, grade);
		students.add(newStudent);
	}

}
