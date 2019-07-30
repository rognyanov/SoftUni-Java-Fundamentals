import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer n = scanner.nextInt();
		
		scanner.close();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(String.format("%d X %d = %d", n, i, n*i));
		}
	}

}
