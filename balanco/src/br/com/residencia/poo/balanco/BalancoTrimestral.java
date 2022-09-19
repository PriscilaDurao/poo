package br.com.residencia.poo.balanco;

import java.text.DecimalFormat;

public class BalancoTrimestral {
	
	private double gastosJaneiro = 15000;
	private double gastosFevereiro = 23000;
	private double gastosMarco = 17000;
	private double gastosTrimestreUm = gastosJaneiro + gastosFevereiro + gastosMarco;

	public BalancoTrimestral() {
	}

	public BalancoTrimestral(Double gastosJaneiro, Double gastosFevereiro, Double gastosMarco, Double somaTotal) {
		this.gastosJaneiro = gastosJaneiro;
		this.gastosFevereiro = gastosFevereiro;
		this.gastosMarco = gastosMarco;
		this.gastosTrimestreUm = somaTotal;
	}

	public Double soma() {
		
		System.out.printf("\nO saldo do balanço trimestral total é R$ %.2f", gastosTrimestreUm);
		return gastosTrimestreUm;
	}

	public Double soma(Double gastosJaneiro) {
	
		System.out.printf("\nO saldo do balanço de janeiro é R$ %.2f", gastosJaneiro);
		return gastosJaneiro;
	}

	public Double soma(Double gastosJaneiro, Double gastosFevereiro) {
		Double gastosTrimestreUm = gastosJaneiro + gastosFevereiro;

		System.out.printf("\nO saldo do balanço bimestral total é R$ %.2f", gastosTrimestreUm);
		return gastosTrimestreUm;
	}

	public Double soma(Double gastosJaneiro, Double gastosFevereiro, Double gastosMarco) {
		Double gastosTrimestreUm = gastosJaneiro + gastosFevereiro + gastosMarco;

		System.out.printf("\nO saldo do balanço trimestral total é R$ %.2f", gastosTrimestreUm);

		return gastosTrimestreUm;
	

}
}
