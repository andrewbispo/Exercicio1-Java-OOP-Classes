package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Products;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Products produto = new Products();
		
		System.out.println("Enter the product data: ");
		System.out.print("Name: ");
		produto.name = sc.nextLine();
		System.out.print("Price: ");
		produto.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		produto.quantity = sc.nextInt();
		System.out.println();
		System.out.println("Product data: " + produto);
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		produto.addProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + produto);
		System.out.println();
		System.out.println("Product data: " + produto);
		System.out.print("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		produto.removeProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + produto);
		sc.close();
	}
}