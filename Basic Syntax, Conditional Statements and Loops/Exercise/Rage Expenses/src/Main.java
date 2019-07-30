import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer lostGamesCount = sc.nextInt();
		Double headsetPrice = sc.nextDouble();
		Double mousePrice = sc.nextDouble();
		Double keyboardPrice = sc.nextDouble();
		Double displayPrice = sc.nextDouble();

		sc.close();
		
		Integer trashedHeadsets = lostGamesCount/2;
		Integer trashedMouses = lostGamesCount/3;
		Integer trashedKeyboards = lostGamesCount/6;
		Integer trashedDisplays = trashedKeyboards/2;
		
		Double expenses = trashedHeadsets*headsetPrice + trashedMouses*mousePrice + trashedKeyboards*keyboardPrice + trashedDisplays*displayPrice;
		
		System.out.println(String.format("Rage expenses: %.2f lv.", expenses));
	}

}
