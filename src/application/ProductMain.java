package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProductMain {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data:");
		System.out.print("name: ");
		product.name = sc.nextLine();
		System.out.print("price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println(product);
		
		System.out.println();
		System.out.print("Enter the number of product to be added in stock");
		
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.print("Updated data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of product to be removed in stock");
		
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.print("Updated data: " + product);		
				
		sc.close();
		
	}

}
