import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer inputNumber = scanner.nextInt();
				
		while(inputNumber%2!=0) {
			System.out.println("Please write an even number.");
			inputNumber = scanner.nextInt();
		}
		
		scanner.close();
		
		System.out.println(String.format("The number is: %d", Math.abs(inputNumber)));
		
	}

}
