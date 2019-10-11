package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class SalaryMain {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.println("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println(employee);
		
		System.out.println();
		System.out.print("Which percentage to increase the salary?");
		double percentage = sc.nextDouble();
		
		employee.increaseSalary(percentage);
		
		System.out.println();
		System.out.print("Updated data: " + employee);
	}

}
