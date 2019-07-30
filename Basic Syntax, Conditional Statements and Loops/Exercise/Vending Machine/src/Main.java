import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		HashSet<Double> acceptedCoins = new HashSet<Double>() {
			{
				add(0.1);
				add(0.2);
				add(0.5);
				add(1.0);
				add(2.0);
			}
		};

		HashMap<String, Double> productPrices = new HashMap<String, Double>() {
			{
				put("Nuts", 2.0);
				put("Water", 0.7);
				put("Crisps", 1.5);
				put("Soda", 0.8);
				put("Coke", 1.0);
			}
		};

		Double moneyInserted = 0.0;

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		while (input.equals("Start") == false) {
			Double coin = Double.parseDouble(input);
			if (acceptedCoins.contains(coin) == false) {
				System.out.println(String.format("Cannot accept %.2f", coin));
			} else {
				moneyInserted+=coin;
			}

			input = sc.nextLine();
		}

		input=sc.nextLine();
		
		while (input.equals("End") == false) {
			if (productPrices.containsKey(input) == false) {
				System.out.println("Invalid product");
			} else {
				Double productPrice = productPrices.get(input);

				if (moneyInserted - productPrice >= 0) {
					moneyInserted -= productPrice;
					System.out.println(String.format("Purchased %s", input));
				} else {
					System.out.println("Sorry, not enough money");
				}
			}
			
			input = sc.nextLine();
		}
		
		sc.close();

		System.out.println(String.format("Change: %.2f", moneyInserted));
	}

}
