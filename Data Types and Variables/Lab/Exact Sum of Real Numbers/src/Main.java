import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = Integer.parseInt(sc.nextLine());
		
		BigDecimal sum = new BigDecimal(0);
		
		for(int i=0; i<n; i++) {
			String numberString = sc.nextLine();
			BigDecimal number = new BigDecimal(numberString);
			sum = sum.add(number);
		}
		
		System.out.println(sum);
	}

}
