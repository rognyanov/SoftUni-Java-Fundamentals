import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		HashMap<String, String> languages = new HashMap<String, String>(){{
			put("USA", "English");
			put("England", "English");
			put("Spain", "Spanish");
			put("Argentina", "Spanish");
			put("Mexico", "Spanish");
		}};
		
		Scanner scanner = new Scanner(System.in);
		String countryName = scanner.nextLine();
		
		scanner.close();
		
		if(languages.containsKey(countryName)) {
			System.out.println(languages.get(countryName));
		} else {
			System.out.println("unknown");
		}
	}

}