import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final double yearDays = 365.2422;
		Scanner sc = new Scanner(System.in);

		int centuries = Integer.parseInt(sc.nextLine());
		sc.close();
		
		int years = centuries*100;
		int days = (int) (years*yearDays);
		int hours = days*24;
		int minutes = hours*60;
		
		System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes",
				centuries,
				years,
				days,
				hours,
				minutes
		);
	}

}
