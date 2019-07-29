

import java.util.Scanner;

public final class Main {

	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		Integer age = scanner.nextInt();
		Double grade = scanner.nextDouble();
		
		scanner.close();
		
		System.out.println(String.format("Name: %s, Age: %d, Grade: %.2f", name, age, grade));
	}

}