package com.rado;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<Integer> numbers = Stream.of(scanner.nextLine().split(" "))
				.mapToInt(Integer::valueOf).boxed()
				.collect(Collectors.toList());

		String inputLine = scanner.nextLine();
		
		while (!inputLine.equalsIgnoreCase("end")) {
			String[] inputData = inputLine.split(" ");

			if (inputData.length == 2) {
				Integer element = Integer.parseInt(inputData[1]);
				deleteElement(numbers, element);
			} else if (inputData.length == 3) {
				Integer element = Integer.parseInt(inputData[1]);
				Integer atIndex = Integer.parseInt(inputData[2]);

				insertElement(numbers, element, atIndex);
			}

			inputLine = scanner.nextLine();
		}
		
		scanner.close();

		numbers.forEach(x -> System.out.printf("%d ", x));
	}

	private static void insertElement(List<Integer> numbers, Integer element, Integer atIndex) {
		numbers.add(atIndex, element);
	}

	private static void deleteElement(List<Integer> numbers, Integer element) {
		numbers.removeAll(Collections.singletonList(element));
	}

}
