package com.rado;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> numbers = Stream.of(scanner.nextLine().split(" "))
				.mapToInt(Integer::valueOf)
				.boxed()
				.collect(Collectors.toList());
		
		int specialNumber = scanner.nextInt();
		int power = scanner.nextInt();
		
		scanner.close();
		detonate(numbers, specialNumber, power);
		
		int sum = numbers.stream().mapToInt(x->x).sum();
		System.out.println(sum);
	}

	private static void detonate(List<Integer> numbers, int specialNumber, int power) {
		int upperBoundary = numbers.size();
		for(Integer index = 0; index<upperBoundary; index++) {
			if(numbers.get(index).equals(specialNumber)) {
				removeIndexRange(numbers, index, power);
				numbers.set(index, 0);
			}
		}		
	}

	private static void removeIndexRange(List<Integer> numbers, int index, int power) {
		for(int i=1; i<=power; i++) {
			int rightIndexToRemove = index+i;
			if(rightIndexToRemove>=0 && rightIndexToRemove<=numbers.size()-1) {
				numbers.set(rightIndexToRemove, 0);
			}
			
			int leftIndexToRemove = index-i;
			if(leftIndexToRemove>=0 && leftIndexToRemove<=numbers.size()-1) {
				numbers.set(leftIndexToRemove, 0);
			}
		}
		
	}

}
