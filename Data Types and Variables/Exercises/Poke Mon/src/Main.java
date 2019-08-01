import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int initialPokePower = Integer.parseInt(sc.nextLine());
		int distance = Integer.parseInt(sc.nextLine());
		short exhaustionFactor = Short.parseShort(sc.nextLine());
		
		sc.close();

		int pokePower = initialPokePower;
		int pokedTargets = 0;

		while (pokePower >= distance) {
			if (initialPokePower / 2 == pokePower) {
				if (exhaustionFactor != 0)
					pokePower /= exhaustionFactor;
				continue;
			}
			
			pokePower -= distance;
			pokedTargets++;
		}
		
		System.out.println(pokePower);
		System.out.println(pokedTargets);
	}

}
