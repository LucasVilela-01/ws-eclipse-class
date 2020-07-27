package numberOne;

import java.util.Locale;
import java.util.Scanner;

public class _07_ {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double t, c, tz, q, r;
		double pi = 3.14159;
		
		t = (A * C) / 2;
		c = Math.pow(C, 2) * pi;
		tz = (A + B) * C / 2;
		q = Math.pow(B, 2);
		r = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", t);
		System.out.printf("CIRCULO: %.3f%n", c);
		System.out.printf("TRAPEZIO: %.3f%n", tz);
		System.out.printf("QUADRADO: %.3f%n", q);
		System.out.printf("RETANGULO: %.3f%n", r);
		
		sc.close();
	}
}