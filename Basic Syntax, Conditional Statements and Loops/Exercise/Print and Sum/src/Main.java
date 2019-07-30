import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer start = sc.nextInt();
		Integer end = sc.nextInt();
		
		sc.close();
		
		Integer sum = 0;
		
		for (int i = start; i <= end; i++) {
			System.out.print(String.format("%d ", i));
			sum+=i;
		}
		
		System.out.println(String.format("%sSum: %d", System.lineSeparator() , sum));
	}

}
