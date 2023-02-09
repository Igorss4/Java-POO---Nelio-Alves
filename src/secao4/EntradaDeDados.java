package secao4;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String s1, s2, s3, a;
		char x;
		int y;
		double z;

		System.out.println("Digite algo!");
		x = sc.next().charAt(0);
		System.out.println("Primeira letra digitada é: " + x);

		System.out.println("Digite 3 vezes");
		sc.nextLine();
		s1 = sc.nextLine(); // para ler até quebra de linha (enter)
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("DADOS DIGITADOS");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		System.out.println("Digite um texto, um numero inteiro e um numero flutuante!");
		a = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Dados digitados: ");
		System.out.println(a);
		System.out.println(y);
		System.out.println(z);

		sc.close();

	}

}
