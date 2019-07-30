import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer number = sc.nextInt();
		sc.close();

		Integer biggestDivider = 0;

		if (number % 10 == 0) {
			biggestDivider = 10;
		} else if (number % 7 == 0) {
			biggestDivider = 7;
		} else if (number % 6 == 0) {
			biggestDivider = 6;
		} else if (number % 3 == 0) {
			biggestDivider = 3;
		} else if (number % 2 == 0) {
			biggestDivider = 2;
		}

		if (biggestDivider != 0) {
			System.out.println(String.format("The number is divisible by %d", biggestDivider));
		} else {
			System.out.println("Not divisible");
		}
	}

}
