package projeto1;
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		double salario;
		double imposto;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Exercicio 8 para lembrar\n ");
		System.out.println("Qual seu salario: \n ");
		salario = sc.nextDouble();
		
		if(salario < 2000) {
			imposto = 0;
		}else if(salario > 2000 && salario < 3000) {
			imposto = (salario - 2000.0) * 0.08;
		}else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		
		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}		
		sc.close();
	}

}
