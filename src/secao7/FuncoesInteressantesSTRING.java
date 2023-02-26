package secao7;

public class FuncoesInteressantesSTRING {

	public static void main(String[] args) {

		String original = "abcde FGHIJ ABC abc DEFG ";

		String s01 = original.toLowerCase(); // tudo minusculo
		String s02 = original.toUpperCase(); // tudo maiusculo
		String s03 = original.trim(); // eliminou os espaços
		String s04 = original.substring(2); // gerou uma nova string a partir do 2 caracter
		String s05 = original.substring(2, 9); // gerou uma nova string do 2 ao 9 caracter
		String s06 = original.replace('a', 'x'); // trocou o a pelo x
		String s07 = original.replace("abc", "xy"); // trocou o abc pelo xy

		int i = original.indexOf("bc"); // primeira ocorrencia do bc é 1
		int j = original.lastIndexOf("bc"); // ultima ocorrencia de bc é 17

		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);

		String s = "potato apple lemon";

		String[] vect = s.split(" "); // transforma as string separadas pelo espaço em itens no array

		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];

	}

}
