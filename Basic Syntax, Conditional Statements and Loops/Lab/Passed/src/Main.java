import java.util.Scanner;

public final class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Double grade = scanner.nextDouble();
		
		scanner.close();
		
		if(grade>=3) {
			System.out.println("Passed!");
		}
	}

}