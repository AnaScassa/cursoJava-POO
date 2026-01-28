package application;

import java.util.Scanner;
import entities.Produto;

public class ProgramProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Produto a = new Produto();

		System.out.println("Programa de produto\n");

		System.out.print("Digite o nome do produto: ");
		a.name = sc.nextLine();

		System.out.print("Digite o preço do produto: ");
		a.price = sc.nextDouble();

		System.out.print("Digite a quantidade em estoque: ");
		a.quantity = sc.nextDouble();

		System.out.println("\nDados do produto:");
		System.out.println(a);

		System.out.print("\nDigite a quantidade para adicionar ao estoque: ");
		a.n = sc.nextDouble();
		a.addProduct();

		System.out.println("\nDados atualizados:");
		System.out.println(a);

		System.out.print("\nDigite a quantidade para remover do estoque: ");
		a.n = sc.nextDouble();
		a.lessProduct();

		System.out.println("\nDados finais:");
		System.out.println(a);

		sc.close();
	}
}
