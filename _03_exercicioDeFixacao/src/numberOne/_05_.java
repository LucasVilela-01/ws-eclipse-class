package numberOne;

import java.util.Locale;
import java.util.Scanner;

public class _05_ {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int h = sc.nextInt();
		double v = sc.nextDouble();
		double s;
		
		s = h * v;
		
		System.out.println("NUMBER = " + n);
		System.out.printf("SALARY = U$ %.2f%n", s);
		
		sc.close();
	}
}