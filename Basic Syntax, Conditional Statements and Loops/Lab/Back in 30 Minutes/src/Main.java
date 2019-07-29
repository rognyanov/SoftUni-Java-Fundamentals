import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Integer hours = scanner.nextInt();
		Integer minutes = scanner.nextInt();
		String timeString = String.format("%02d:%02d", hours, minutes);
				
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
		
		LocalTime dt = LocalTime.parse(timeString, formatter);
		dt = dt.plusMinutes(30);
				
		String result = dt.format(formatter);
		
		System.out.println(result);
	}

}