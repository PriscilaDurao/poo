package br.com.residencia.poo.segundaaula;

import java.util.Scanner;

public class SegundaAulaExercicioCinco {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int a = 2 + 3 - 5 * 8 - 4 + 354 - 521 + 7 * 66;
		int b = 2 + 7 * (14 - 21) + 28 * 3 * 42 + 740 - (156 + 4 + 40) * 9;
		String tipo;
		
		System.out.print("Saiba o valor das expressões matemáticas abaixo: ");
		System.out.println("\na) 2 + 3 - 5 * 8 - 4 + 354 - 521 + 7 * 66" + "\nb) 2 + 7 * (14 - 21) + 28 * 3 * 42 + 740 - (156 + 4 + 40) * 9");
		System.out.print("\nEscolha a expressão matemática a ou b: ");
		tipo = leia.next();
		
		if (tipo.equals("a")) {
			
			System.out.print("\nO resultado da expressão é " + a);
			
		} else {
		
			System.out.println("\nO resultado da expressão é " + b);
		}
		leia.close();

}
}
