package br.com.residencia.poo.segundaaula;

import java.util.Scanner;

public class SegundaAulaMiniCalculadora {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		float num, ndois, nr;
		String tipo = "0";

		System.out.println("Escolha uma opção:\n" + "[+] Soma\n" + "[-]Subtração\n" + "[*]Multiplicação\n"
				+ "[/]Divisão\n" + "[0]Sair");
		tipo = leia.next();

		if (tipo.equals("+") || tipo.equals("-") || tipo.equals("*") || tipo.equals("/") || tipo.equals("0")) {
			switch (tipo) {

			case "+": // somar
				System.out.print("\nDigite um número: ");
				num = leia.nextFloat();
				System.out.print("Digite outro número: ");
				ndois = leia.nextFloat();
				nr = num + ndois;
				System.out.print("\nSeu resultado é " + nr + ".");
				break;

			case "-": // subtrair
				System.out.print("\nDigite um número: ");
				num = leia.nextFloat();
				System.out.print("Digite outro número: ");
				ndois = leia.nextFloat();
				nr = num - ndois;
				System.out.print("\nSeu resultado é " + nr + ".");
				break;

			case "*": // multiplicar
				System.out.print("\nDigite um número: ");
				num = leia.nextFloat();
				System.out.print("Digite outro número: ");
				ndois = leia.nextFloat();
				nr = num * ndois;
				System.out.print("\nSeu resultado é " + nr + ".");
				break;

			case "/": // dividir
				System.out.print("\nDigite um número: ");
				num = leia.nextFloat();
				System.out.print("Digite outro número: ");
				ndois = leia.nextFloat();
				nr = num / ndois;
				System.out.print("\nSeu resultado é " + nr + ".");
				break;

			case "0": // sair
				System.out.println("Você saiu da calculadora!");
				break;
			}

		} else {
			System.out.println("Opção Inválida!");
			leia.close();

		}

	}
}
