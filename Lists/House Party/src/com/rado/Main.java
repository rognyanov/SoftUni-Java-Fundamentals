package com.rado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputCount = Integer.parseInt(scanner.nextLine());
		
		List<String> people = new ArrayList<String>();
		
		String inputLine = "";
		
		while(inputCount>0) {
			inputLine = scanner.nextLine();
			String[] inputData = inputLine.split(" ");
			
			if(inputData.length == 3) {
				addPerson(people, inputData[0]);
			}else if(inputData.length == 4) {
				removePerson(people, inputData[0]);
			}
			
			inputCount--;
		}
		
		scanner.close();
		
		people.forEach(x->System.out.println(x));
	}

	private static void removePerson(List<String> people, String name) {
		if(!people.contains(name)) {
			System.out.printf("%s is not in the list!%n", name);
			return;
		}
	
		people.removeIf(name::equals);
	}

	private static void addPerson(List<String> people, String name) {
		if(people.contains(name)) {
			System.out.printf("%s is already in the list!%n", name);
			return;
		}
		
		people.add(name);
	}

}
