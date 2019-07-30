import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer age = sc.nextInt();
		sc.close();
		
		String status = "";
		
		if(age >= 0 && age <= 2) {
			status = "baby";
		} else if(age >= 3 && age <= 13) {
			status = "child";
		} else if(age >= 14 && age <= 19) {
			status = "teenager";
		} else if(age >= 20 && age <=65) {
			status = "adult";
		} else {
			status = "elder";
		}
		
		System.out.println(status);
	}

}