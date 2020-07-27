import java.util.Scanner;

public class _02_ {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// pode apagar os dois 00 a esquerda, pois não precisa 
		// 0b100000 <- 32
		
		int mask = 0b00100000;  // pode representar na forma binária ou decimal
		int n = sc.nextInt();
		
		if ( (n & mask) != 0 ) {
			System.out.println("6th bit is true !");
		}
		else {
			System.out.println("6th bit is false !");
		}
		
		sc.close();
	}
}