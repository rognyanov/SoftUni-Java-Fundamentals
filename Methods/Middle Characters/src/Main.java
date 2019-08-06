import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();

		String result;
		int inputLength = input.length();

		if (inputLength % 2 == 0) {
			result = input.substring(inputLength / 2 - 1, inputLength / 2 + 1);
		} else {
			result = Character.toString(input.charAt(inputLength / 2));
		}

		System.out.println(result);
	}

}
