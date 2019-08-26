package com.rado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.rado.models.Person;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputCount = Integer.parseInt(scanner.nextLine());
		
		List<Person> people = new ArrayList<Person>();
		
		for (int i = 0; i < inputCount; i++) {
			String[] inputData = scanner.nextLine().split(" ");
			String name = inputData[0];
			int age = Integer.parseInt(inputData[1]);
			
			Person newPerson = new Person(name, age);
			people.add(newPerson);
		}
		
		people
			.stream()
			.filter(p->p.getAge()>30)
			.sorted()
			.forEach(x->System.out.printf("%s - %d%n", x.getName(), x.getAge()));
	}

}
