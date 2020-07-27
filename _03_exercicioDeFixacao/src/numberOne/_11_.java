package numberOne;

import java.util.Scanner;

public class _11_ {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int r;
		
		if ( x < y) {
			r = y -x;
		}
		else {
			r = 24 - x + y;
		}
		
		System.out.println("O jogo durou " + r + " hora(s)");
		
		sc.close();
	}
}
