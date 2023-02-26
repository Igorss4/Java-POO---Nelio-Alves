package secao6;

import java.util.Scanner;

public class EstruturaRepetitiva_While {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = 0;
		
		while (x != 0) { //enquanto x for diferente de 0, mantenha a execução!
			soma += x;
			x = sc.nextInt();
		}
		System.out.println(soma);
		
		sc.close();

	}

}
