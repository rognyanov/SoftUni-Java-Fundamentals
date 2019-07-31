import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		String biggestKeg = "";
		double biggestKegVolume = 0;
		
			for (int j = 0; j < n; j++) {
				String model = sc.nextLine();
				double radius = Double.parseDouble(sc.nextLine());
				double height = Integer.parseInt(sc.nextLine());
				
				double kegVolume = Math.PI*Math.pow(radius, 2)*height;
				if(kegVolume>=biggestKegVolume) {
					biggestKegVolume=kegVolume;
					biggestKeg=model;
				}
			}
		
		sc.close();
		
		System.out.println(biggestKeg);
	}

}
