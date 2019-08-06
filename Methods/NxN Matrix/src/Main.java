import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer n = Integer.parseInt(scanner.nextLine());
		scanner.close();
		
		printMatrix(n);
	}

	private static void printMatrix(Integer n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%d ", n);
			}
			
			System.out.println();
		}
	}

}
