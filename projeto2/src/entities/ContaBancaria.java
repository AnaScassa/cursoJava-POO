package entities;

public class ContaBancaria {

	private String nome;
	private int numero;
	private double saldo;
	public double deposito;
	
	public ContaBancaria(String nome, int numero, double saldo, double deposito) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.saldo = saldo;
		this.deposito = deposito;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}
	
	public double adicionar() {
	    saldo += deposito;
		return saldo;
	}
	
	public double subtrair() {
	    saldo -= deposito;
		return saldo;
	}	
}
