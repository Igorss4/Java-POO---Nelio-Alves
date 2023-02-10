package secao5;

import java.util.Scanner;

public class EstruturaCondicional_IfElse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		int x = 5;

		// Estrutura condicional Simples
//		System.out.println("Bom Dia");
//
//		if (x > 0) {
//			System.out.println("Bom Tarde");
//		}
//		if (x < 0) {
//			System.out.println("Bom Noite");
//		}

		// Estrutura condicional Composta
//		int hora;
//		
//		System.out.println("Que horas são? ");
//		hora = sc.nextInt();
//		
//		if(hora < 12) {
//			System.out.println("Bom Dia!");
//		} else {
//			System.out.println("Boa Tarde!");
//		}

		//Encadeamento de Estruturas Condicionais
		int hora;

		System.out.println("Que horas são? ");
		hora = sc.nextInt();

		if (hora < 12) {
			System.out.println("Bom Dia!");
		} else {
			if (hora < 18) {
				System.out.println("Boa Tarde!");
			} else {
				System.out.println("Boa Noite!");
			}
		}

		sc.close();
	}

}
