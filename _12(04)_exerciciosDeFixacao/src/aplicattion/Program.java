package aplicattion;

import java.util.Locale;
import java.util.Scanner;

import entities.Dice;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Dice dice = new Dice();
		
		System.out.print("Name: ");
		dice.name = sc.nextLine();
		System.out.print("Gross salary: $ ");
		dice.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		dice.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employye: " + dice);
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		dice.increaseSalary(percentage);
		
		System.out.println();
		System.out.print("Updated data: " + dice);
		
		sc.close();
	}
}