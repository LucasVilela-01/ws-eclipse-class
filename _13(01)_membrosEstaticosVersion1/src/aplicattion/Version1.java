package aplicattion;

import java.util.Locale;
import java.util.Scanner;

public class Version1 {

	public static final double PI = 3.14159;
	/* 
	acrecentado a palavra "final" para dizer que tal valor é constante e não pode ser
	alterado.
	*/
	
	
	public static void main(String[] args) {
		
		// Versão 1: métodos na própria classe do programa
		/* Nota: dentro de um método estático você não pode chamar membros de instância 
		da mesma classe.
		*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = circumference(radius);
		
		double v = volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", PI);
		
		sc.close();
	}
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}