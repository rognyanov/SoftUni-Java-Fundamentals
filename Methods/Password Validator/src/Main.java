import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static String PASSOWORD_IS_VALID = "Password is valid";
	private static String PASSWORD_LENGTH_MESSAGE = "Password must be between 6 and 10 characters";
	private static String PASSOWRD_CHARACTERS_MESSAGE = "Password must consist only of letters and digits";
	private static String PASSWORD_MIN_TWO_DIGITS = "Password must have at least 2 digits";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String password = scanner.nextLine();
		scanner.close();

		List<String> errorMessages = new ArrayList<String>();

		if (password.length() < 6 || password.length() > 10)
			errorMessages.add(PASSWORD_LENGTH_MESSAGE);

		int digitsCount = 0;

		for (int i = 0; i < password.length(); i++) {
			char c = password.charAt(i);
			if ((Character.isDigit(c) || Character.isLetter(c)) == false) {
				if (!errorMessages.contains(PASSOWRD_CHARACTERS_MESSAGE))
					errorMessages.add(PASSOWRD_CHARACTERS_MESSAGE);
			}

			if (Character.isDigit(c))
				digitsCount++;
		}

		if (digitsCount < 2)
			errorMessages.add(PASSWORD_MIN_TWO_DIGITS);

		if (errorMessages.size() == 0) {
			System.out.println(PASSOWORD_IS_VALID);
		} else {
			errorMessages.forEach(x -> System.out.println(x));
		}

	}
}
