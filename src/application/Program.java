package application;

import java.util.Locale;
import java.util.Scanner;

import employee.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Nome: ");
		employee.name = sc.nextLine();
		
		System.out.print("Salário bruto: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.print("Imposto ");
		employee.tax = sc.nextDouble();
		
		System.out.printf("Employee: %s, $ %.2f%n", employee.name, employee.netSalary());
		System.out.print("Qual o percentual de aumento? ");
		double percentage = sc.nextDouble();
		
		employee.increaseSalary(percentage);
		System.out.printf("Salário após o aumento de %.2f%%: %.2f%n", percentage, employee.netSalary());
		sc.close();
	}

}
