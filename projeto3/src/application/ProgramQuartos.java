package application;

import java.util.Scanner;

import entities.Quartos;

public class ProgramQuartos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, n2;
		
		System.out.println("quantas quartos: ");
		n = sc.nextInt();
		
		Quartos[] vect = new Quartos[10];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Insira o número do quarto 0 - 9: ");
			n2 = sc.nextInt();
			
			if(n2 < 10 && n2 >= 0) {
				if(vect[n2] == null) {
					System.out.println("Digite o nome: ");
					String nome = sc.next();
					System.out.println("Digite o email: ");
					String email = sc.next();
					vect[n2] = new Quartos(nome, email, n);
				}
			}
		}
		for (int j = 0; j < vect.length; j++) {
		    if (vect[j] != null) {
		        System.out.println(
		            "Quarto " + vect[j].getNumQuarto() +
		            ": " + vect[j].getNome() +
		            ", " + vect[j].getEmail()
		        );
		    }
		}

		

	}

}
