package br.com.poo.sistemabancario.contas;

public class Conta {
	// declaracao de variaveis
	public int numero;
	public String titular;
	private double saldo;

	// acoes da conta

	// metodo de saque sem tratamento
//	public void sacar (double valor) {
//		double novoSaldo = this.saldo = valor;
//		this.saldo = novoSaldo;
//	}

	// metodo de saque com tratamento parcial
	public boolean sacar(double valor) {
		if (this.saldo < valor) {
			System.out.println("Saldo insuficente!");
			return false;
		} else {
			double novoSaldo = this.saldo - valor;
			this.saldo = novoSaldo;
			return true;
		}
	}

	// metodo para efetuar um deposito
	public boolean depositar(double valor) {
//		double novoSaldo = this.saldo + valor;
//		this.saldo = novoSaldo;
		if (valor < 0) {
			System.out.println("Valor inválido!");
			return false;
		} else {
			this.saldo += valor;
			return true;
		}
	}

	// metodo para efetuar uma tranferencia

	public boolean transfere(Conta destino, double valor) {
		if (saldo < valor) {
			System.out.println("Saldo Insufiente!");
			return false;
		} else {
			this.saldo = this.saldo - valor;
			destino.saldo = destino.saldo + valor;
			return true;
			
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public Conta() {
		super();
	}

	public Conta(int numero, String titular, double saldo) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	
}
