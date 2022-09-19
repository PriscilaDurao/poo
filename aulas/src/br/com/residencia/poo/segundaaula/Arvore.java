package br.com.residencia.poo.segundaaula;

public class Arvore {

	public static void main(String[] args) {

		int linha = 8, t = 1;

		for (int cont = 1; cont <= 8; cont++) {
			for (int contDois = 1; contDois <= 10; contDois++)
				if (contDois == linha) {
					for (int contTres = 1; contTres <= t; contTres++)
						System.out.print('*');

					t = t + 2;
					linha--;

				} else {
					System.out.print(' ');

				}
			System.out.println();
		}
		System.out.println("      |_|");
	}
}
