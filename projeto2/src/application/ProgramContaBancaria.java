package application;

import java.util.Scanner;

import entities.ContaBancaria;

public class ProgramContaBancaria {

	public static void main(String[] args) {
		String nome;
		int numero;
		double saldo;
		double deposito = 0;
		int op = 1;
		double n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n-------Conta Bancaria-------\nInsira o nome da conta: ");
		nome = sc.next();
		System.out.println("Insira o número da conta: ");
		numero = sc.nextInt();
		System.out.println("Insira o saldo atual da conta: ");
		saldo = sc.nextDouble();
		
		ContaBancaria cb = new ContaBancaria(nome, numero, saldo, deposito);
		
		do {
			System.out.println("Nome: " + cb.getNome() + "\nNúmero: " + cb.getNumero() + "\nSaldo: " + cb.getSaldo());
			
			System.out.println("Insira o valor que deseja depositar na conta: ");
			n = sc.nextDouble();
			cb.setDeposito(n);
			cb.adicionar();
			
			System.out.println("Insira o valor que deseja sacar na conta: ");
			n = sc.nextDouble();
			cb.setDeposito(n);
			cb.subtrair();
			
			System.out.println("Nome: " + cb.getNome() + "\nNúmero: " + cb.getNumero() + "\nSaldo: " + cb.getSaldo());

			System.out.println("Deseja continuar? 1- sim/ 2- não");
			op = sc.nextInt();
			
		} while (op != 2);
	}

}
