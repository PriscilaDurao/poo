//O programa “bem-vindo” pergunta seu nome e sobrenome, e depois
//gentilmente te cumprimenta.
//- 1º etapa: perguntar o nome;
//- 2º etapa: perguntar o sobrenome;
//- 3º etapa: junta o nome com o sobrenome e forma uma frase.


package br.com.residencia.poo.segundaaula;

import java.util.Scanner; 

public class SegundaAulaExercicioUm {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String nome, sobrenome;
		
		System.out.print("Olá, Qual o seu nome?" );
		nome = leia.next();
		System.out.print("Qual o seu sobre nome? ");
		sobrenome = leia.next();
		
		System.out.print("\nOlá "+ nome+ " " + sobrenome +", seja bem vindo(a) no universo da programação!");
		
		leia.close();

	}

}
