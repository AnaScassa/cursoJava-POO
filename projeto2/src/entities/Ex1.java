package entities;

public class Ex1 {

	public String nome;
	public double salarioBruto;
	public double imposto;
	public double novoSalario;
	
	public double calculaSalario() {
		double valorImposto = salarioBruto * (imposto / 100);
		novoSalario = salarioBruto - valorImposto;
		return novoSalario;
	}

	@Override
	public String toString() {
		return "Olá " + nome
			+ "\nSeu salário bruto: " + salarioBruto
			+ "\nSalário com imposto: " + novoSalario;
	}
}
