package com.rado;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Queue<Integer> firstDeck = Stream.of(scanner.nextLine().split(" "))
				.mapToInt(Integer::valueOf)
				.boxed()
				.collect(Collectors.toCollection(LinkedList::new));
		
		Queue<Integer> secondDeck = Stream.of(scanner.nextLine().split(" "))
				.mapToInt(Integer::valueOf)
				.boxed()
				.collect(Collectors.toCollection(LinkedList::new));
		
		scanner.close();
		
		while(firstDeck.size()!=0 && secondDeck.size()!=0) {
			int firstPlayerCard = firstDeck.poll();
			int secondPlayerCard = secondDeck.poll();
			
			if(firstPlayerCard>secondPlayerCard) {
				firstDeck.add(firstPlayerCard);
				firstDeck.add(secondPlayerCard);
			}else if(firstPlayerCard<secondPlayerCard) {
				secondDeck.add(secondPlayerCard);
				secondDeck.add(firstPlayerCard);
			}
		}
		
		if(firstDeck.size()>0) {
			int sum = firstDeck.stream().mapToInt(x->x).sum();
			System.out.printf("First player wins! Sum: %d", sum);
		}else {
			int sum = secondDeck.stream().mapToInt(x->x).sum();
			System.out.printf("Second player wins! Sum: %d", sum);
		}
	}

}
