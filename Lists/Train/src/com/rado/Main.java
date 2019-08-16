package com.rado;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<Integer> wagons = Stream.of(scanner.nextLine().split(" ")).mapToInt(Integer::valueOf).boxed()
				.collect(Collectors.toList());

		Integer maxCapacity = Integer.parseInt(scanner.nextLine());

		String inputLine = scanner.nextLine();
		while (inputLine.toLowerCase().equals("end") == false) {
			String[] lineData = inputLine.split(" ");

			if (lineData.length == 1) {
				findWagon(wagons, Integer.parseInt(lineData[0]), maxCapacity);
			} else if (lineData.length == 2) {
				addPassengers(wagons, Integer.parseInt(lineData[1]));
			}

			inputLine = scanner.nextLine();
		}

		scanner.close();

		wagons.forEach(x -> System.out.printf("%d ", x));
	}

	private static void findWagon(List<Integer> wagons, int passengers, int maxCapacity) {
		for (Integer wagon : wagons) {
			Integer newCapacity = wagon + passengers;		
			
			if (newCapacity <= maxCapacity) {
				wagons.set(wagons.indexOf(wagon), newCapacity);
				return;
			}
		}

	}

	private static void addPassengers(List<Integer> numbers, int passengers) {
		numbers.add(passengers);
	}
}
