import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer n = scanner.nextInt();
		
		scanner.close();
		
		Integer num = 1;
		Integer sum = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.println(num);
			sum+=num;
			num+=2;
		}
		
		System.out.println(String.format("Sum: %d", sum));
	}

}