import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer n = Integer.parseInt(scanner.nextLine());
		scanner.close();

		for (int i = 1; i <= n; i++) {
			if (isTop(i)) {
				System.out.println(i);
			}
		}
	}

	private static boolean isTop(Integer i) {
		boolean result = true;

		int sum = String.valueOf(i)
				.chars()
				.map(Character::getNumericValue)
				.sum();

		if (sum % 8 != 0)
			result = false;
		
		int oddDigits = String.valueOf(i)
				.chars()
				.map(Character::getNumericValue)
				.filter(x->x%2!=0)
				.toArray()
				.length;
		
		if(oddDigits==0)
			result = false;

		return result;
	}

}
