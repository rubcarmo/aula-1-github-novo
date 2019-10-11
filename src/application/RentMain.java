package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class RentMain {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented: ");
		int rooms = (sc.nextInt());
		
		Rent[] vect = new Rent[10];
		
		for(int i=0; i < rooms; i++) {
			
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			vect[room] = new Rent(name, email);

		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		
		for(int i=0; i < vect.length; i++ ) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i].getName() +", "+ vect[i].getEmail());
			}
		}
		
		sc.close();

	}

}
