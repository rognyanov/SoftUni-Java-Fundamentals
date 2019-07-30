import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer n = scanner.nextInt();
		Integer startRange = scanner.nextInt();

		scanner.close();

		if (startRange <= 10) {
			for (int i = startRange; i <= 10; i++) {
				System.out.println(String.format("%d X %d = %d", n, i, n * i));
			}
		} else {
			System.out.println(String.format("%d X %d = %d", n, startRange, n * startRange));
		}
	}

}