package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		System.out.println("Enter the product data:");
		System.out.print("Name: ");
		produto.name = scan.next();
		
		System.out.print("Price: ");
		produto.price = scan.nextDouble();
		
		System.out.print("Quantity in stock: ");
		produto.quantity = scan.nextInt();
		
		System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f%n%n", produto.name, produto.price, produto.quantity, produto.totalValueInStock());

		System.out.print("Enter the number of products to be added in stock: ");
		int qtdAdd = scan.nextInt();
		produto.addProducts(qtdAdd);
		
		System.out.printf("Updated data: %s, $ %.2f, %d units, Total: $ %.2f%n%n", produto.name, produto.price, produto.quantity, produto.totalValueInStock());
		
		System.out.print("Enter the number of products to be removed from stock: ");
		int qtdRemove = scan.nextInt();
		produto.removeProducts(qtdRemove);
		
		System.out.printf("Updated data: %s, $ %.2f, %d units, Total: $ %.2f%n%n", produto.name, produto.price, produto.quantity, produto.totalValueInStock());
		
		scan.close();
	}

}
