package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramList {

	public static void main (String[] args) {
		//usar o arraylist para azer uma lista
		List<String> list = new ArrayList<>(); //não aceita tipos primitivos
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add(2, "Marco"); //sobreposição de onde o "marco" deveria ficar

		System.out.println(list.size());
		
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("----------");
		list.remove(3);
		//remove se a letra na posição 0 for M
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
		}
		// indexOf procura o valor na lista, se true mostra se false -1
		System.out.println("Index of Ana: " + list.indexOf("Ana"));
		System.out.println("Index of Ninguém: " + list.indexOf("Ninguém"));
		System.out.println("----------");
		
		// 1- converte para stram
		// 2 - fala a operação que quer (só ter nome que começa com a)
		// 3 - volta para a lista
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("----------");
		// se não encontrar retorna null
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
	}
}
