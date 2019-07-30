import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String dayType = scanner.nextLine();
		Integer age = scanner.nextInt();
		
		scanner.close();
		
		Integer price = null;
		
		switch (dayType.toLowerCase()) {
		case "weekday":
			if(0<=age && age<=18) {
				price=12;
			} else if(18<age && age<=64) {
				price=18;
			} else if(64<age && age<=122) {
				price=12;
			}
			break;
		case "weekend":
			if(0<=age && age<=18) {
				price=15;
			} else if(18<age && age<=64) {
				price=20;
			} else if(64<age && age<=122) {
				price=15;
			}
			break;
		case "holiday":
			if(0<=age && age<=18) {
				price=5;
			} else if(18<age && age<=64) {
				price=12;
			} else if(64<age && age<=122) {
				price=10;
			}
			break;
		default:
			System.out.println("Error!");
			break;
		}
		
		if(price == null) {
			System.out.println("Error!");
		}else {
			System.out.println(String.format("%d$", price));
		}
	}

}
