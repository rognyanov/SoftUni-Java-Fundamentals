import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputCount = Integer.parseInt(sc.nextLine());
		int sum = 0;
		
		for (int i = 0; i < inputCount; i++) {
			char newChar = sc.nextLine().toCharArray()[0];
			sum+=newChar;
		}
		
		sc.close();
		
		System.out.printf("The sum equals: %d", sum);
	}

}
