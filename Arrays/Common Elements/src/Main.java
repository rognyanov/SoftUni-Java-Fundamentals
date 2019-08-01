import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] first = scanner.nextLine().split(" ");
		String[] second = scanner.nextLine().split(" ");
		
		scanner.close();
		
		StringBuilder result = new StringBuilder();
		
		for(String secondElement : second) {
			for(String firstElement: first) {
				if(secondElement.equals(firstElement))
					result.append(firstElement+" ");
			}
		}
		
		System.out.println(result.toString());
	}

}
