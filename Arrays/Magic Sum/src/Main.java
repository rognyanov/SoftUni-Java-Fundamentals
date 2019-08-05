import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer[] numbers = Stream.of(scanner.nextLine().split(" "))
				.mapToInt(Integer::valueOf)
				.boxed()
				.toArray(Integer[]::new);
		
		scanner.close();
		
		Integer wantedSum = Integer.parseInt(scanner.nextLine());
		
		scanner.close();

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				if(numbers[i]+numbers[j] == wantedSum.intValue()) {
					System.out.printf("%d %d%n", numbers[i], numbers[j]);
				}
			}
		}
	}

}
