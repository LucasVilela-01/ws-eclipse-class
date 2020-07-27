import java.util.Locale;
import java.util.Scanner;

public class _01_AtribuicaoCumulativa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int min = sc.nextInt();
		
		double c = 50.0;
		
		if (min > 100) {
			c += (min - 100) * 2;
		}
		
		System.out.printf("Valor a pagar = R$ %.2f%n", c);
		
		sc.close();
	}
}