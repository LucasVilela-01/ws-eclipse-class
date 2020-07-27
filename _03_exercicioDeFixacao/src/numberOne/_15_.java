package numberOne;

import java.util.Locale;
import java.util.Scanner;

public class _15_ {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double s = sc.nextDouble();
		double ir;
		
		if (s <= 2000.0) {
			ir = 0.0;
		}
		else if (s <= 3000.0) {
			ir = (s - 2000.0) * 0.08;
		}
		else if (s <= 4500.0) {
			ir = (s - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			ir = (s - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		
		if (ir == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", ir);
		}
			
		sc.close();
	}
}