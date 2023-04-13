package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class MediaPrecoProduto {

	public static void main(String[] args) {
		
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite quantos produtos querem cadastrar: ");
		int n = sc.nextInt();
		Produto[] vect = new Produto[n];
		
		for (int i=0; i<vect.length; i++) {
		sc.nextLine();
		System.out.println("Digite o nome do produto: ");
		String name = sc.nextLine();
		System.out.println("Digite o valor do produto: ");
		double price = sc.nextDouble();
		vect[i] = new Produto(name, price);
		}
		
		double sum = 0.0;
		for (int i=0; i<vect.length; i++) {
		sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		sc.close();
		}
}