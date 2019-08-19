package com.rado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputLine = scanner.nextLine();
		scanner.close();

		List<Integer> result = new ArrayList<Integer>();

		String[] arrays = inputLine.split("\\|");
		for (String arrayLine : arrays) {
			List<Integer> array = Stream.of(arrayLine.split(" "))
					.filter(str -> !str.isEmpty())
					.mapToInt(Integer::valueOf)
					.boxed()
					.collect(Collectors.toList());

			for (int i = array.size() - 1; i >= 0; i--) {
				result.add(array.get(i));
			}
		}

		for (int index = result.size() - 1; index >= 0; index--) {
			System.out.print(result.get(index) + " ");
		}
	}

}
