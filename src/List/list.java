package List;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class list {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-------------");
		list.removeIf(x -> x.charAt(0) == 'M'); //lambda para remover o que contenha M 
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-------------");
		System.out.println("Index of Marco: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("-------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); //filtro lambda para filtrar e imprimir apenas a letra a 
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("-------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null); // pega o primeiro da letra indicada se nao encontra volta nulo 
		System.out.println(name);
	}

}
