import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = Integer.parseInt(scanner.nextLine());

		int[] first = new int[size];
		int[] second = new int[size];

		boolean zeroIndexIsFirst = true;

		for (int i = 0; i < size; i++) {
			int[] nums = Stream.of(scanner.nextLine().split(" ")).mapToInt(Integer::valueOf).toArray();

			if (zeroIndexIsFirst) {
				first[i] = nums[0];
				second[i] = nums[1];
				zeroIndexIsFirst = false;
			} else {
				first[i] = nums[1];
				second[i] = nums[0];
				zeroIndexIsFirst = true;
			}
		}
		
		scanner.close();
		
		Arrays.stream(first).forEach(x->System.out.printf("%d ",x));
		System.out.println();
		Arrays.stream(second).forEach(x->System.out.printf("%d ",x));
	}

}
