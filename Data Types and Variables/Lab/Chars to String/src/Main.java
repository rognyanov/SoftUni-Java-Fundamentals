import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 3; i++) {			
			String c = sc.nextLine();
			sb.append(c);
		}
		
		System.out.println(sb.toString());
	}

}
