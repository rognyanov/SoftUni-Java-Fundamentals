import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.Stream;;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] data = Stream.of(scanner.nextLine().split(" "))
				.mapToInt(Integer::parseInt)
				.toArray();
		
		Integer[] numbers = Arrays.stream(data).boxed().toArray(Integer[]::new);
	
		int rotationsCount = Integer.parseInt(scanner.nextLine());
		scanner.close();
		
		int[] rotatedArray = rotateArray(numbers, rotationsCount);
		Arrays.stream(rotatedArray).forEach(x->System.out.printf("%d ", x));
	}

	private static int[] rotateArray(Integer[] numbers, int rotationsCount) {
		Queue<Integer> numbersQueue = new LinkedList<Integer>(Arrays.asList(numbers));
		
		for (int i = 0; i < rotationsCount; i++) {
			int floatingNumber = numbersQueue.remove();
			numbersQueue.add(floatingNumber);
		}
		
		return numbersQueue.stream().mapToInt(x->x).toArray();
	}
	
}
