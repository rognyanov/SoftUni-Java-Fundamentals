import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numberString = sc.nextLine();
		sc.close();

		for (Integer i = 1; i <= Integer.parseInt(numberString); i++) {
			
			int result = getSumOfDigits(i.toString());
			
			if(result == 5 || result == 7 || result == 11) {
				System.out.printf("%d -> True", i);
				System.out.print(System.lineSeparator());
			}else {
				System.out.printf("%d -> False", i);
				System.out.print(System.lineSeparator());
			}
		}
	}

	private static int getSumOfDigits(String numberString) {
		return Stream.of(numberString.split(""))
				.mapToInt(Integer::valueOf)
				.sum();
	}

}
