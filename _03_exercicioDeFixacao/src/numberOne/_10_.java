package numberOne;

import java.util.Scanner;

public class _10_ {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
				
		if (x % y == 0 || y % x == 0) {
			System.out.println("S�o m�ltiplos");
		}
		else {
			System.out.println("N�o s�o m�ltiplos");
		}
		sc.close();
	}
}