import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[3];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i]=Integer.parseInt(scanner.nextLine());
		}
		
		scanner.close();
		
		int min = getMinValue(numbers);
		System.out.println(min);
	}

	private static int getMinValue(int[] numbers) {
		int min = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if(numbers[i]<min)
				min=numbers[i];
		}
		
		return min;
	}

}
