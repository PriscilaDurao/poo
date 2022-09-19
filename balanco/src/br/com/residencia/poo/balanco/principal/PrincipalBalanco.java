package br.com.residencia.poo.balanco.principal;

import br.com.residencia.poo.balanco.BalancoTrimestral;

public class PrincipalBalanco {

	public static void main(String[] args) {
		
		BalancoTrimestral b = new BalancoTrimestral();
		b.soma();
		b.soma(2000.00);
		b.soma(20000.00, 2000.00);
		b.soma(2000.00, 45000.00, 2000.00);

	}

}
