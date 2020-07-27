package numberOne;

import java.util.Locale;
import java.util.Scanner;

public class _13_ {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double v;
		
		System.out.println("Digite um valor: ");
		v = sc.nextDouble();
		
		if (v >= 0 && v <= 25) {
			System.out.println("Intervalo [0,25]");
		}
		else if (v >= 25.01 && v <= 50) {
			System.out.println("Intervalo (25,50]");
		}
		else if (v >= 50.01 && v <= 75) {
			System.out.println("Intervalo (50,75]");
		}
		else if (v >= 75.01 && v <= 100) {
			System.out.println("Intervalo (75,100]");
		}
		else {
			System.out.println("Fora de intervalo");
		}
		
		sc.close();
	}
}