package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee2;

public class IncreaseSalaryMain {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered: ");
		int numEmployees = sc.nextInt();
		
		List<Employee2> lista = new ArrayList<>();
		
		for(int i=0; i < numEmployees; i++) {
			
			System.out.println();
			System.out.println("Employee #" + i + ":");
			
			System.out.print("Id: ");
			int id = sc.nextInt();
						
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			lista.add(new Employee2(id, name, salary));
		}
		
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase:");
		int id = sc.nextInt();
		
		Employee2 emp = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if(emp != null) {
			System.out.println();
			System.out.print("Enter the percentage:");
			Double percentage = sc.nextDouble();
			emp.IncreaseSalary(percentage);
		} else {
			System.out.println("This id does not exist");
		}		
		
		System.out.println("List of employees: ");
		
		for(Employee2 emplo: lista) {
			System.out.println(emplo);
		}
	  sc.close();
	}

}
