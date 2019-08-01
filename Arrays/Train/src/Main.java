import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputLines = Integer.parseInt(scanner.nextLine());
		int[] train = new int[inputLines];
				
		for (int i = 0; i < inputLines; i++) {
			int num = Integer.parseInt(scanner.nextLine());
			train[i] = num;
		}
		
		scanner.close();
		
		getStream(train).forEach(x->System.out.printf("%d ", x));
		System.out.printf("%n%d",getStream(train).sum());
	}
	
	public static IntStream getStream(int[] arr) {
		return Arrays.stream(arr);
	}

}
