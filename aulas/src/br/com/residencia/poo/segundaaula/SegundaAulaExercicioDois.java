//O programa “Tempo de vida” irá imprimir a soma das idades de todos os
//colegas da sua equipe (6 pessoas). Pergunte a cada um a idade e não
//esqueça a sua! Depois faça a atribuição direta da expressão em uma
//variável inteira.

package br.com.residencia.poo.segundaaula;
import java.util.Scanner;

public class SegundaAulaExercicioDois {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int idade, total = 0, cont = 1, total1 = 0;
		
		do  {
			
			System.out.print("Qual a idade do seu colega " + cont + "? ");
			idade = leia.nextInt();
			total1 += idade;
			cont++;
			 			 
		} while (cont <= 5);
		
		System.out.print("Qual a minha idade? ");
		idade = leia.nextInt();
		total = total1 + idade;

		System.out.println("O tempo de vida dos meus colegas é " + total + ".");
		leia.close();
		

	}
}
