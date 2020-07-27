package numberOne;

import java.util.Locale;
import java.util.Scanner;

public class _06_ {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int c1 = sc.nextInt();
		int n1 = sc.nextInt();
		double v1 = sc.nextDouble();
		
		int c2 = sc.nextInt();
		int n2 = sc.nextInt();
		double v2 = sc.nextDouble();
		
		double t;
	
		t = n1 * v1 + n2 * v2;
		
		System.out.printf("VALOR A PAGAR: %.2f%n", t);
		
		sc.close();
	}
}