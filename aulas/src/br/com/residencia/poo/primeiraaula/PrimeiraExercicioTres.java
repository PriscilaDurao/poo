package br.com.residencia.poo.primeiraaula;

import java.util.Scanner;

public class PrimeiraExercicioTres {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		String nome;
		int idade;
		System.out.println("Qual o seu nome?");
		nome = ler.nextLine();
		System.out.println ("\nQual a sua idade?");
		idade = ler.nextInt();
		 System.out.flush(); 
		System.out.println("\nSeu nome é " + nome + " e sua idade é " + idade);
		ler.close();


	}

}
