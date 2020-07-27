import java.util.Locale;
import java.util.Scanner;

public class _09_ExerciciosFor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0 ; i < n ; i++) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if (y != 0) {
				double t = (double) x / y;
				System.out.printf("%.1f%n", t);
			}
			else {
				System.out.println("Divisão impossível");
			}
		}
		
		sc.close();
	}
}