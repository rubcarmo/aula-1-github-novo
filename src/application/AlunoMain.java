package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class AlunoMain {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Name: ");
		student.name = sc.nextLine();
		System.out.print("Nota 1 semester: ");
		student.nota1 = sc.nextDouble();
		System.out.print("Nota 2 semester: ");
		student.nota2 = sc.nextDouble();
		System.out.print("Nota 3 semester: ");
		student.nota3 = sc.nextDouble();
		
		student.calculaNotaFinal();
		
		System.out.println("FINAL GRADE: " + String.format("%.2f", student.notaFinal));
		System.out.print(student.statusStudent(student.verificaAprovacao()));
		if(!student.verificaAprovacao()) {
			System.out.println(" MISSING " + student.pontosFaltantes() + " POINTS");
		}
		
	}
	

}
