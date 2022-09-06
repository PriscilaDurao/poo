package br.com.residencia.poo.primeiraaula;

import java.util.Scanner;

public class PrimeiraExercicioUm {

	public static void main(String[] args) {
				
		Scanner leia = new Scanner(System.in);
		String nome;
		System.out.print("Diga seu nome: ");
		nome = leia.nextLine();
		System.out.println("Olá, " +nome);
		leia.close();
		 

	}

}
