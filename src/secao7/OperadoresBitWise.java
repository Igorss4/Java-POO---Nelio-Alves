package secao7;

import java.util.Scanner;

public class OperadoresBitWise {

	public static void main(String[] args) {

		int n1 = 89;
		int n2 = 60;

		System.out.println(n1 & n2); // operador E
		System.out.println(n1 | n2); // operador OU
		System.out.println(n1 ^ n2); // operador OU-EXCLUSIVO apenas 1 verdadeiro

		Scanner sc = new Scanner(System.in);

		int mask = 0b100000;
		int n = sc.nextInt();

		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		} else {
			System.out.println("6th bit is false");
		}

		sc.close();

	}

}
