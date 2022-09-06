//Crie o programa “mini calculadora”, que após ler dois números inteiros
//apresenta as operações de soma, subtração, multiplicação e divisão com
//eles.
//Obs.: Trate o maior número possível de erros (ex: operações com números
//negativos, divisão por zero, uso de letras, etc).

package br.com.residencia.poo.segundaaula;

import java.util.Scanner;

public class SegundaAulaExercicioTres {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		float num, ndois, nr, nrum, nrdois, nrtres;
		String tipo;

	     System.out.println("Descubra o resultado: ");
	     System.out.print("\nDigite um número: ");
	     num = leia.nextFloat();
	     System.out.print("Escolha um tipo de conta: soma (+), subtração (-), multiplicação (*) ou divisão (/): ");
	     tipo = leia.next();
	     System.out.print("Digite outro número: ");
	     ndois = leia.nextFloat();
	     
	     if(tipo.equals("soma")  ||  tipo.equals("Soma") ||  tipo.equals("+")){
	    	 
	     	nr = num + ndois;
	     	System.out.print("\nSeu resultado é " + nr + ".");
	     
	     	
	     } else if (tipo.equals("subtração") || tipo.equals("Subtração") || tipo.equals("-")){
	    	 
	     		nrum = num - ndois;     	
	     		System.out.print("\nSeu resultado é "+ nrum + ".");
	     		
	     	} else if (tipo.equals("multiplicação") || tipo.equals("Multiplicação") || tipo.equals("*")){
	     			
	     		nrdois = num * ndois;
	     		System.out.print("\nSeu resultado é " + nrdois + ".");
	      	
	     	} else if(tipo.equals("divisão") || tipo.equals("Divisão") || tipo.equals("/")){
	    	 
	     		nrtres = num / ndois;
	     		System.out.print ("\nSeu resultado é " + nrtres + ".");
	     				
	     	} else {
	     		
	     		System.out.println("Opção inválida, tente novamente!");
	     	}
	     leia.close();
	     
		}
	
	}


