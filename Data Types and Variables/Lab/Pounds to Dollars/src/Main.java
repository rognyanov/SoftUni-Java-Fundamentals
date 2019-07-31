import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final double poundDollarValue = 1.31;
		
		Scanner sc = new Scanner(System.in);
		Double pounds = sc.nextDouble();
		sc.close();
		
		Double dollars = pounds*poundDollarValue;
		System.out.printf("%.3f", dollars);
	}

}
