import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer number = sc.nextInt();
		sc.close();

		Integer factorialSum = 0;
		
		char[] numberParts = number.toString().toCharArray();
		
		for (char c : numberParts) {
			Integer num = Integer.parseInt(String.format("%s", c));
			Integer value = factorial(num);
			factorialSum+=value;
		}
		
		if(number.equals(factorialSum))
			System.out.println("yes");
		else	
			System.out.println("no");
	}

	static Integer factorial(Integer n) {
		if (n == 0)
			return 1;
		else
			return (n * factorial(n - 1));
	}

}
