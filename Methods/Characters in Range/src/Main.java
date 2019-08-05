import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		char start = scanner.nextLine().charAt(0);
		char end = scanner.nextLine().charAt(0);
		
		scanner.close();
		
		int startIndex = (int)start+1;
		int endIndex = (int)end;
		
		for (int i = startIndex; i < endIndex; i++) {
			char c = (char)i;
			System.out.print(c+" ");
		}
		
		for(int i=endIndex+1; i<startIndex-1; i++) {
			char c = (char)i;
			System.out.print(c+" ");
		}
	}
}