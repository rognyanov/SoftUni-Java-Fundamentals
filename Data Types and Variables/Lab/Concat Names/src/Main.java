import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String first = sc.nextLine();
		String second = sc.nextLine();
		String delimeter = sc.nextLine();
		
		System.out.printf("%s%s%s", first, delimeter, second);
	}

}