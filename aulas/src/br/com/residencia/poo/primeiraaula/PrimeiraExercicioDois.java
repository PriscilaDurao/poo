package br.com.residencia.poo.primeiraaula;

import java.util.Scanner;

public class PrimeiraExercicioDois {

	public static void main(String[] args) {
	
	Scanner ler = new Scanner(System.in);
	float nota, media;
	float totalNotas = 0.0f;
	String disciplina, nome;
	System.out.print("Digete seu nome: ");
	nome = ler.nextLine();
	System.out.print("Digite a disciplina: ");
	disciplina = ler.nextLine();
	
	
	/*for (int cont = 1; cont <=3; cont++) {
		System.out.println("Insira a sua nota: ");
		nota = ler.nextfloat();
		totalNotas += nota;
	}*/
	
//	int cont = 1;
//	
//	while(cont<=3){
//		System.out.println("Insira a sua nota: ");
//		nota = ler.nextFloat();
//		totalNotas += nota;
//		cont++;
//	}

	int cont = 1;
	
	do {
		System.out.print("Insira a sua nota: ");
		nota = ler.nextFloat();
		totalNotas += nota;
		cont++;
	} while(cont<=3);
	
	media = totalNotas / 3;
	System.out.print("Olá, " + nome + "!");
	System.out.println("Sua média na disciplina " + disciplina + " é " + media); 
	ler.close();
	}

}
