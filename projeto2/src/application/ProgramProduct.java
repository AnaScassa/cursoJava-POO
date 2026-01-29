package application;

import java.util.Scanner;
import entities.Produto;

public class ProgramProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		System.out.println("Programa de produto\n");

		System.out.print("Digite o nome do produto: ");
		String name = sc.nextLine();

		System.out.print("Digite o preço do produto: ");
		double price = sc.nextDouble();
		
		Produto a = new Produto(name, price);

		System.out.println("\nDados do produto:");
		System.out.println(a);

		System.out.print("\nDigite a quantidade para adicionar ao estoque: ");
		double n2 = sc.nextDouble();
		a.setN(n2);
		a.addProduct();

		System.out.println("\nDados atualizados:");
		System.out.println(a);

		System.out.print("\nDigite a quantidade para remover do estoque: ");
		n2 = sc.nextDouble();
		a.setN(n2); // encapsulamento, nao estou deixando o usuario inserir o valor no "n" diretamente
		a.lessProduct();

		System.out.println("\nDados finais:");
		System.out.println(a);

		sc.close();
	}
}
