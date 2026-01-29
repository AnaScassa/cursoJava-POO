package application;

import java.util.Scanner;

import entities.Ex1;

public class ProgramEx1 {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	Ex1 pessoa = new Ex1();
	int op = 1;
	
	do {
		System.out.println("\nOlá digite seu nome: ");
		pessoa.nome = sc.next();
		System.out.println("\ndigite qual seu salário bruto: ");
		pessoa.salarioBruto = sc.nextDouble();
		System.out.println("\ndigite qual porcentagem do seu imposto: ");
		pessoa.imposto = sc.nextDouble();
		
		pessoa.calculaSalario();
		System.out.println(pessoa);
		
		System.out.println("\nDeseja continuar? 1-sim, 2-não");
		op = sc.nextInt();
	}while(op != 2);
	sc.close();
	}
}
