import java.util.Scanner;

public class _05_For {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int s = 0;
		
		for (int i = 0 ; i < n ; i++ /* ou i = i + 1 */ ) {
			int x = sc.nextInt();
			s = s + x;
		}
		
		System.out.println("Total: " + s);
		
		sc.close();
	}
}