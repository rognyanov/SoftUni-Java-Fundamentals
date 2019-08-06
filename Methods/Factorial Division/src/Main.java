import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer first = Integer.parseInt(scanner.nextLine());
		Integer second = Integer.parseInt(scanner.nextLine());
		scanner.close();

		Double firstFactorial = getFactorial(first);
		Double secondFactorial = getFactorial(second);
		Double result = firstFactorial / secondFactorial;

		System.out.println(String.format("%.2f", result));
	}

	public static double getFactorial(double n) {
		if (n == 0)
			return 1;
		else
			return (n * getFactorial(n - 1));
	}
}
