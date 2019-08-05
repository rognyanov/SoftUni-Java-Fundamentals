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
		
		for (int i = 0; i < numbers.length; i++) {
			int leftSum = getSumOfRange(numbers, 0, i-1);
			int rightSum = getSumOfRange(numbers, i+1, numbers.length-1);
			
			if(leftSum==rightSum )
			{
				System.out.println(i);
				return;
			}
		}
		
		System.out.println("no");
		
	}

	private static int getSumOfRange(Integer[] numbers, int start, int end) {
		int sum = 0;
		
		for (int index = start; index <= end; index++) {
			sum+=numbers[index];
		}
		
		return sum;
	}

}
