import java.util.Scanner;
import java.lang.Character;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		char character = str.charAt(0);
		
		if(Character.isUpperCase(character)){
			System.out.println("upper-case");
		}else {
			System.out.println("lower-case");
		}
	}

}
