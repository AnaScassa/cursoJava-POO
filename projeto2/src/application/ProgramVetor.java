package application;

import java.util.Iterator;
import java.util.Scanner;

public class ProgramVetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] vect = new double[3]; // vetor muito diferente de c
		int n;
		double soma = 0;
		
		System.out.println("quantas notas: ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Insira o valor: ");
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}
		
		soma = soma/n;
		
		
		System.out.println(soma);

	}

}
