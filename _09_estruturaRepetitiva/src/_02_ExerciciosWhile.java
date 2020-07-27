import java.util.Scanner;

public class _02_ExerciciosWhile {

	public static void main(String[] args) {
		
		// senha
		
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		
		while (s != 2002) {
			System.out.println("Senha Inválida");
			s = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();
	}
}