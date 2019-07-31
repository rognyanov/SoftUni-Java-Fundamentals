import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final int maxCapacity = 255;
		
		Scanner sc = new Scanner(System.in);
		int inputCount = Integer.parseInt(sc.nextLine());
		
		int capacity = maxCapacity;
		
		for (int i = 0; i < inputCount; i++) {
			int liters = Integer.parseInt(sc.nextLine());
			if(capacity-liters<=0) {
				System.out.println("Insufficient capacity!");
				continue;
			}
			
			capacity-=liters;
		}
		
		sc.close();
		
		System.out.println(maxCapacity-capacity);
	}

}
