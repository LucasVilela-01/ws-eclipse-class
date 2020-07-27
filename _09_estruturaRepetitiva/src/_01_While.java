import java.util.Scanner;

public class _01_While {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int s = 0;
		
		while (x != 0) {
			s += x;
			// ou s = s + x;
			x = sc.nextInt();
		}
		
		System.out.println("Total: " + s);
		
		sc.close();
	}
}