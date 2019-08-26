package com.rado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<String> data = Stream.of(scanner.nextLine().split(" ")).collect(Collectors.toList());

		String inputLine = scanner.nextLine();

		while (!inputLine.equalsIgnoreCase("3:1")) {
			String[] inputData = inputLine.split(" ");

			switch (inputData[0]) {
			case "merge":
				merge(data, Integer.parseInt(inputData[1]), Integer.parseInt(inputData[2]));
				break;

			case "divide":
				divide(data, Integer.parseInt(inputData[1]), Integer.parseInt(inputData[2]));
				break;

			default:
				break;
			}
			
			inputLine = scanner.nextLine();
		}
		
		scanner.close();

		System.out.println(String.join(" ", data));
	}

	private static void divide(List<String> data, int index, int partitions) {
		if (index >= 0 && index < data.size() && partitions >= 0 && partitions <= 100) {
            String element = data.get(index);
            List<String> newList = new ArrayList<>();

            if (element.length() % partitions == 0) {
                int portionLength = element.length() / partitions;
                int count = 0;
                for (int i = 0; i < partitions; i++) {
                    String concat = "";
                    for (int j = 0; j < portionLength; j++) {
                        char symbol = element.charAt(count);
                        concat += symbol;
                        count++;
                    }
                    newList.add(concat);
                }
            } else {
                int portionLength = element.length() / partitions;
                int count = 0;
                for (int i = 0; i < partitions; i++) {
                    String concat = "";

                    if (i == partitions - 1) {
                        for (int j = count; j < element.length(); j++) {
                            char symbol = element.charAt(count);
                            concat += symbol;
                            count++;
                        }
                    } else {
                        for (int j = 0; j < portionLength; j++) {
                            char symbol = element.charAt(count);
                            concat += symbol;
                            count++;
                        }
                    }
                    newList.add(concat);
                }
            }
            data.remove(index);
            data.addAll(index, newList);
		}
		
	}

	private static void merge(List<String> data, int startIndex, int endIndex) {
		if (startIndex < 0) {
			startIndex = 0;
		}
		if (endIndex > data.size() - 1) {
			endIndex = data.size() - 1;
		}
		int counter = startIndex;

		for (int i = startIndex; i < endIndex; i++) {
			String concat = data.get(counter) + data.get(counter + 1);
			data.set(counter, concat);
			data.remove(counter + 1);
		}

	}

}
