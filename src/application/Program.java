package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter the product data:");
		System.out.print("Name: ");
		product.name = scan.next();
		
		System.out.print("Price: ");
		product.price = scan.nextDouble();
		
		System.out.print("Quantity in stock: ");
		product.quantity = scan.nextInt();
		
		System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f%n%n", product.name, product.price, product.quantity, product.totalValueInStock());

		System.out.print("Enter the number of products to be added in stock: ");
		int qtdAdd = scan.nextInt();
		product.addProducts(qtdAdd);
		
		System.out.printf("Updated data: %s, $ %.2f, %d units, Total: $ %.2f%n%n", product.name, product.price, product.quantity, product.totalValueInStock());
		
		System.out.print("Enter the number of products to be removed from stock: ");
		int qtdRemove = scan.nextInt();
		product.removeProducts(qtdRemove);
		
		System.out.printf("Updated data: %s, $ %.2f, %d units, Total: $ %.2f%n%n", product.name, product.price, product.quantity, product.totalValueInStock());
		
		scan.close();
		
	}

}
