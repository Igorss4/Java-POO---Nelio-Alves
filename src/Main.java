import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		double x = 10.35784;
		System.out.println(x);
		System.out.printf("%.2f%n", x); //formata��o de decimal, sem especificar o locale usa o padr�o do pc!
		System.out.printf("%.4f%n", x); //imprime 10,3578
		Locale.setDefault(Locale.US); //setado o local e formata��o.
		System.out.printf("%.2f%n", x); //imprime 10.35
		
		
	}

}
