import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		scanner.close();

		long vowelsCount = getVolewsCount(line);
		
		System.out.println(vowelsCount);
	}

	private static long getVolewsCount(String line) {
		long vowelsCount = line
				.toLowerCase()
				.chars()
				.mapToObj(c->(char)c)
				.filter(c -> "aeiou".contains(String.valueOf(c)))
				.count();
		
		return vowelsCount;
	}

}
