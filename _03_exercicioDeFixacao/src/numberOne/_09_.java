package numberOne;

import java.util.Scanner;

public class _09_ {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		if (x % 2 == 0) {
			System.out.println("Par");
		}
		else {
			System.out.println("Ímpar");
		}
		sc.close();
	}
}