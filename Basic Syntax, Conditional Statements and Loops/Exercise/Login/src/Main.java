import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String username = sc.nextLine();
		
		String password = new StringBuilder(username).reverse().toString();
		
		Integer lockCounter = 0;
		String input = sc.nextLine();
		
		while(input.equals(password) == false) {
			System.out.println("Incorrect password. Try again.");
			lockCounter++;
			
			if(lockCounter>=3) {
				System.out.println(String.format("User %s blocked!", username));
				return;
			}
			
			input=sc.nextLine();
		}
		
		System.out.println(String.format("User %s logged in.", username));
	}

}
