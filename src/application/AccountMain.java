package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class AccountMain {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account;
		
		System.out.print("Enter account number: ");
		int numero = (sc.nextInt());	
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = (sc.nextLine());
		
		System.out.print("Is there a initial deposit (y/n)? ");
		char initial = sc.next().charAt(0);
		
		if(initial == 'y') {
			System.out.print("Enter initial deposit value: ");
			double saldoIni = (sc.nextDouble());
			
			account = new Account(numero, holder, saldoIni);
		} else {
			account = new Account(numero, holder);
		}		
		
		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.print("Enter a deposit value: ");
		account.deposit(sc.nextDouble());
		System.out.println("Updated account data:");
		System.out.println(account);
		
		System.out.print("Enter a saque value: ");
		account.saque(sc.nextDouble());
		System.out.println("Updated account data:");
		System.out.println(account);
		
		sc.close();
	}

}
