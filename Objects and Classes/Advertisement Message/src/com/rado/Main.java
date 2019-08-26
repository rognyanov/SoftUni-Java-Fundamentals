package com.rado;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.rado.contracts.AdvertisementMessageGenerator;
import com.rado.core.AdvertisementMessageGeneratorImpl;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int messageCount = Integer.parseInt(scanner.nextLine());
		scanner.close();
		
		List<String> phrases = Arrays.asList(
				"Excellent product.", 
				"Such a great product.", 
				"I always use that product.", 
				"Best product of its category.", 
				"Exceptional product.", 
				"I can’t live without this product.");
		
		List<String> events = Arrays.asList(
				"Now I feel good.", 
				"I have succeeded with this product.", 
				"Makes miracles. I am happy of the results!", 
				"I cannot believe but now I feel awesome.", 
				"Try it yourself, I am very satisfied.", 
				"I feel great!");
		
		List<String> authors = Arrays.asList(
				"Diana", 
				"Petya", 
				"Stella", 
				"Elena", 
				"Katya", 
				"Iva", 
				"Annie", 
				"Eva");
		
		List<String> cities = Arrays.asList(
				"Burgas", 
				"Sofia", 
				"Plovdiv", 
				"Varna", 
				"Ruse"
				);
		
		AdvertisementMessageGenerator messageGenerator = new AdvertisementMessageGeneratorImpl(phrases, events, authors, cities);
		
		for (int i = 0; i < messageCount; i++) {
			String message = messageGenerator.generateMessage();
			System.out.println(message);
		}
	}

}
