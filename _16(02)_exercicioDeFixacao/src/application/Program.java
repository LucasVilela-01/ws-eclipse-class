package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Emplyoee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Emplyoee> list = new ArrayList<>();
		
			System.out.print("How many employees will be registered? ");
			int n = sc.nextInt();
			
			for (int i = 1 ; i <= n ; i++) {
				System.out.println("Emplyoee #" + i);
				
				System.out.print("Id: ");
				Integer id = sc.nextInt();
				while (hasId(list, id)) {
					System.out.println("Id already taken. Try again: ");
					id = sc.nextInt();
				}
				
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Salary: ");
				Double salary = sc.nextDouble();
				list.add(new Emplyoee(id, name, salary)); // Guarda informações digitadas acima no list na classe Emplyoee
				}
			
				System.out.println();
				System.out.print("Enter the employee id that will have salary increase: ");
				int id = sc.nextInt();
				Emplyoee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
				if (emp == null) {
					System.out.println("This id does not exist!");
				}
				else {
					System.out.println("Enter the percentage: ");
					double percentage = sc.nextDouble();
					emp.increaseSalary(percentage);
				}
				
				System.out.println();
				System.out.println("List of employee:");
				for (Emplyoee obj: list) {
					System.out.println(obj);
				}
				
		sc.close();
	}

	public static boolean hasId(List<Emplyoee> list, int id) {
		Emplyoee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}