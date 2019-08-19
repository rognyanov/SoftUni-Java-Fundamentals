package com.rado;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<Integer> numbers = Stream.of(scanner.nextLine().split(" ")).mapToInt(Integer::valueOf).boxed()
				.collect(Collectors.toList());

		String inputLine = scanner.nextLine();
		
		while (!inputLine.equalsIgnoreCase("end")) {
			processCommand(numbers, inputLine);
			inputLine = scanner.nextLine();
		}
		
		scanner.close();
		numbers.forEach(x->System.out.printf("%d ", x));
	}

	private static void processCommand(List<Integer> numbers, String inputLine) {
		String[] inputData = inputLine.replaceAll("  ", " ").split(" ");

		if (inputLine.startsWith("Add")) {
			int numToAdd = Integer.parseInt(inputData[1]);
			add(numbers, numToAdd);
			return;
		}

		if (inputLine.startsWith("Insert")) {
			int numToInsert = Integer.parseInt(inputData[1]);
			int index = Integer.parseInt(inputData[2]);
			insert(numbers, numToInsert, index);
			return;
		}

		if (inputLine.startsWith("Remove")) {
			int index = Integer.parseInt(inputData[1]);
			remove(numbers, index);
			return;
		}

		if (inputLine.startsWith("Shift left")) {
			int count = Integer.parseInt(inputData[2]);
			shiftLeft(numbers, count);
			return;
		}

		if (inputLine.startsWith("Shift right")) {
			int count = Integer.parseInt(inputData[2]);
			shiftRight(numbers, count);
			return;
		}
		
	}

	private static void shiftRight(List<Integer> numbers, int count) {
		while (count-- > 0) {
			int lastIndex = numbers.size() - 1;
			int lastNumber = numbers.get(lastIndex);
			numbers.remove(lastIndex);
			numbers.add(0, lastNumber);
		}

	}

	private static void shiftLeft(List<Integer> numbers, int count) {
		while (count-- > 0) {
			int firstNumber = numbers.get(0);
			numbers.remove(0);
			numbers.add(firstNumber);
		}
	}

	private static void remove(List<Integer> numbers, int index) {
		if(index<0 || index>=numbers.size()) {
			System.out.println("Invalid index");
			return;
		}
		
		numbers.remove(index);
	}

	private static void insert(List<Integer> numbers, int numToInsert, int index) {
		if(index==numbers.size()) {
			add(numbers, numToInsert);
			return;
		}
		if(index<0 || index>numbers.size()-1) {
			System.out.println("Invalid index");
			return;
		}
		
		numbers.add(index, numToInsert);
	}

	private static void add(List<Integer> numbers, int numToAdd) {
		numbers.add(numToAdd);
	}

}
