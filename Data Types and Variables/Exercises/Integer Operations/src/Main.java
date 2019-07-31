import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstNumber = Integer.parseInt(sc.nextLine());
		int secondNumber = Integer.parseInt(sc.nextLine());
		int thirdNumber = Integer.parseInt(sc.nextLine());
		int fourthNumber = Integer.parseInt(sc.nextLine());
		
		sc.close();
		
		int result = ((firstNumber+secondNumber)/thirdNumber)*fourthNumber;
		System.out.println(result);
	}

}
