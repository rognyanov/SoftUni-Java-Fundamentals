import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double amountOfMoney = sc.nextDouble();
		Integer countOfStudents = sc.nextInt();
		Double priceOfSaber = sc.nextDouble();
		Double priceOfRobe = sc.nextDouble();
		Double priceOfBelt = sc.nextDouble();
		sc.close();
		
		Double priceForSabers = priceOfSaber*(countOfStudents + Math.ceil(countOfStudents*10.0/100));
		Double priceForRobes = priceOfRobe*countOfStudents;
		Double priceForBelts = priceOfBelt*(countOfStudents-(Integer)countOfStudents/6);
		
		Double neededMoney = priceForSabers+priceForRobes+priceForBelts;
		
		if(amountOfMoney >= neededMoney) {
			System.out.println(String.format("The money is enough - it would cost %.2flv.", neededMoney));
		}
		else {
			System.out.println(String.format("Ivan Cho will need %.2flv more.", neededMoney-amountOfMoney));
		}
	}

}
