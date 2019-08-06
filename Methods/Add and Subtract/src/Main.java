import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer firstNumber = Integer.parseInt(scanner.nextLine());
		Integer secondNumber = Integer.parseInt(scanner.nextLine());
		Integer thirdNumber = Integer.parseInt(scanner.nextLine());
		
		scanner.close();
		
		Integer sum = getSum(firstNumber, secondNumber);
		Integer subtracted = sum-thirdNumber;
		
		System.out.println(subtracted);
	}

	public static int getSum(Integer... params) {
		Integer result = 0;
		
		for(Integer num : params) {
			result+=num;
		}
		
		return result;
	}
	
	public static int getSubtract(Integer first, Integer second) {
		return first-second;
	}
}
