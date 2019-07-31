import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = Integer.parseInt(sc.nextLine());
		int end = Integer.parseInt(sc.nextLine());
		
		sc.close();
		
		for (int i = start; i <= end; i++) {
			System.out.printf("%c ", (char)i);
		}
	}

}
