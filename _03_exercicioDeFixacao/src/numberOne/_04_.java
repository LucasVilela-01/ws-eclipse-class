package numberOne;

import java.util.Scanner;

public class _04_ {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int r;
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		r = (A * B) - (C * D);
		
		System.out.println("DIFERENCA: " + r);
		
		sc.close();
	}
}