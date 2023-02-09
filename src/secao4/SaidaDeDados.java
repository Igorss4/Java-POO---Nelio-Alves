package secao4;

import java.util.Locale;

public class SaidaDeDados {

	public static void main(String[] args) {
		
		double x = 10.35784;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		
		System.out.println(x);
		System.out.printf("%.2f%n", x); //formatação de decimal, sem especificar o locale usa o padrão do pc!
		System.out.printf("%.4f%n", x); //imprime 10,3578
		Locale.setDefault(Locale.US); //setado o local e formatação.
		System.out.printf("%.2f%n", x); //imprime 10.35
		
		// Regra de printf: %f = ponto flutuante, %d = inteiro, %s= texto, %n = quebra de linha.

		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n",
						nome, idade, renda); //imprime Maria tem 31 anos e ganha R$ 4000.00 reais

	}

}
