import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numberString = sc.nextLine();
		
		sc.close();
		
		int result = Stream.of(numberString.split(""))
				.mapToInt(Integer::valueOf)
				.sum();
		
		System.out.println(result);
	}

}
