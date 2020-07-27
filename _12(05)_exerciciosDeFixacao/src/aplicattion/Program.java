package aplicattion;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student info = new Student();
		
		info.name = sc.nextLine();
		info.n1 = sc.nextDouble();
		info.n2 = sc.nextDouble();
		info.n3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", info.finalGrade());
		
		if (info.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", info.missingPoints());
		}
		else {
			System.out.println("PASS");
		}
		
		sc.close();
	}
}