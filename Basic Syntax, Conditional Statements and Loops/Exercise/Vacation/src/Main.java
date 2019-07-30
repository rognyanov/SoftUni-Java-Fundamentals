import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final HashMap<String, HashMap<String, Double>> table = new HashMap<String, HashMap<String, Double>>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				put("students", new HashMap<String, Double>() {
					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;

					{
						put("friday", 8.45);
						put("saturday", 9.80);
						put("sunday", 10.46);
					}
				});

				put("business", new HashMap<String, Double>() {
					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;

					{
						put("friday", 10.90);
						put("saturday", 15.60);
						put("sunday", 16.0);
					}
				});

				put("regular", new HashMap<String, Double>() {
					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;

					{
						put("friday", 15.0);
						put("saturday", 20.0);
						put("sunday", 22.50);
					}
				});
			}
		};

		Scanner sc = new Scanner(System.in);
		Integer peopleCount = Integer.parseInt(sc.nextLine());
		String peopleType = sc.nextLine();
		String day = sc.nextLine();
		sc.close();

		peopleType = peopleType.toLowerCase();
		day = day.toLowerCase();
		
		Double singlePrice = table.get(peopleType).get(day);
		Double totalPrice = singlePrice * peopleCount;

		switch (peopleType) {
		case "students":
			if (peopleCount >= 30) {
				totalPrice -= totalPrice*15/100;
			}
			break;
		case "business":
			if (peopleCount >= 100) {
				totalPrice -= 10*singlePrice;
			}
			break;
		case "regular":
			if (peopleCount >= 10 && peopleCount <= 20) {
				totalPrice -= totalPrice*5/100;
			}
			break;
		default:
			break;
		}
		
		System.out.println(String.format("Total price: %.2f", totalPrice));
	}

}
