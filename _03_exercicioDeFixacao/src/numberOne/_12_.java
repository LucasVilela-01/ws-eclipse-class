package numberOne;

import java.util.Locale;
import java.util.Scanner;

public class _12_ {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int c = sc.nextInt();
	int q = sc.nextInt();
	double t;
	
	if (c == 1) {
		t = q * 4.00;
	}
	else if (c == 2) {
		t = q * 4.50;
	}
	else if (c == 3) {
		t = q * 5.00;
	}
	else if (c == 4) {
		t = q * 2.00;
	}
	else if (c == 5) {
		t = q * 1.50;
	}
	else {
		t = 0;
	}
	
	System.out.printf("Total: R$ %.2f%n", t);
	
	sc.close();
	}
}