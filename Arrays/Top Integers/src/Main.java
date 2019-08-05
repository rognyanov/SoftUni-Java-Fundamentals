import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] data = Stream.of(scanner.nextLine().split(" "))
				.mapToInt(Integer::parseInt)
				.toArray();
		
		scanner.close();
		
		List<Integer> result = new ArrayList<Integer>();
		
		for (int i = 0; i < data.length; i++) {
			boolean isTop = true;
			int element = data[i];
			
			for (int j = i+1; j < data.length; j++) {
				if(data[j]>element)
					isTop=false;
			}
			
			if(isTop) {
				result.add(element);
			}
		}
		
		result.forEach(x->System.out.printf("%d ",x));
		
	}

}
