import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer meters = sc.nextInt();
		sc.close();
		
		Double kilometers = meters/1000.0;
		System.out.printf("%.2f", kilometers);
	}

}
