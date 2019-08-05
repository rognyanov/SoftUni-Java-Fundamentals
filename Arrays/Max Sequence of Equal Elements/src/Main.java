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
		
		int maxOcurrencies = 0;
		int ocurredNumber = 0;
		
		for (int index = 0; index < numbers.length; index++) {
			int nextIndex = index+1;
			
			if(nextIndex>=numbers.length) {
				nextIndex--;
			}
			
			int occurencies = 1;
			while(numbers[nextIndex]==numbers[index])
			{
				occurencies++;
				nextIndex++;
				if(nextIndex>numbers.length-1) {
					break;
				}
			}
			
			if(occurencies>maxOcurrencies) {
				maxOcurrencies=occurencies;
				ocurredNumber=numbers[index];
			}
		}
		
		for (int i = 0; i < maxOcurrencies; i++) {
			System.out.printf("%d ", ocurredNumber);
		}

	}

}
