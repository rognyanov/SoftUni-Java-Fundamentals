import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String townName = sc.nextLine();
		Integer townPopulation = sc.nextInt();
		Integer townArea = sc.nextInt();
		
		System.out.printf("Town %s has population of %d and area %d square km.", townName, townPopulation, townArea);
	}

}
