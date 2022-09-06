package br.com.poo.sistemabancario.principal;

import br.com.poo.sistemabancario.contas.Conta;

public class Principal {

	public static void main(String[] args) {
		Conta contaUm = new Conta();

		contaUm.titular = "Caio";
		contaUm.getSaldo();
		contaUm.setNumero(132);
		contaUm.sacar(0);
		contaUm.depositar(0);

		//System.out.println("Saldo atual: " + contaUm.saldo + "\nNome do titular: " + contaUm.titular
				//+ "\nNúmero da conta: " + contaUm.numero);

		Conta contaDois = new Conta();

		contaDois.titular = "João";
		contaDois.getSaldo();
		contaDois.numero = 321;
		contaDois.sacar(0);
		contaDois.depositar(0);

		//System.out.println("\nSaldo atual: " + contaDois.saldo + "\nNome do titular: " + contaDois.titular
				//+ "\nNúmero da conta: " + contaDois.numero);
		
		contaUm.transfere(contaDois, 2000);
		
		System.out.println("Saldo Conta " + contaUm.titular + ": " + contaUm.getSaldo() + "\nSaldo Conta " + contaDois.titular + ": " + contaDois.getSaldo());
	
	}
}
