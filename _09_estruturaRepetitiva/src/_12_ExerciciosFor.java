import java.util.Scanner;

public class _12_ExerciciosFor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int i = 1 ; i <= n ; i++) {
			
			int a = i;
			int b = (int) Math.pow(i, 2);
			int c = (int) Math.pow(i, 3);
			
			System.out.printf("%d %d %d%n", a, b, c);
		}
		
		sc.close();
	}
}