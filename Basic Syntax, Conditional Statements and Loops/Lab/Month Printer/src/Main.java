import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	
		Scanner scanner = new Scanner(System.in);
		
		int monthIndex = scanner.nextInt();
		if(monthIndex > 0 && monthIndex <12) {
			System.out.println(monthNames[monthIndex-1]);
		} else {
			System.out.println("Error!");
		}
		
	}

}
