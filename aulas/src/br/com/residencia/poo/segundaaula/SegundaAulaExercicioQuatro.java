//package br.com.residencia.poo.segundaaula;
//
//import java.util.Scanner;
//
//public class SegundaAulaExercicioQuatro {
//
//	public static void main(String[] args) {
//		
//		 Scanner leia = new Scanner (System.in);
//		 String conversor;
//		 float temperatura1, temperatura2;
//		 double c;
//		 double f;
//
//		 System.out.print("Conversor de temperatura");
//		 System.out.print("\nO que você quer converter?" + "\n1) Graus Celsius (°C) em graus Fahrenheit (°F)" + "\n" +
//		"2) Graus Fahrenheit (°F) em graus Celsius (°C)");
//		 System.out.print("\nDigite a opção desejada: ");
//		 conversor = leia.next();
//
//	 	if (conversor.equals("1")){
//	 		System.out.print("\nDigite a temperatura em graus Celsius (°C): "); 
//	 		temperatura1 = leia.nextFloat();
//	 		f = (temperatura1*1.8) + 32;
//	 		System.out.print("\nA temperatura em graus Fahrenheit (°F) é: " + f);
//	 	
//	 	}else if (conversor.equals("2")) {
//	 		
//	 		System.out.print("Digite a temperatura em graus Fahrenheit (°F): ");
//			temperatura2 = leia.nextFloat();
//			c = (temperatura2-32)/1.8;
//			System.out.print("\nA temperatura em graus Celsius (°C) é: " + c +"°C");
//	}
//	 	leia.close();
//
//}
//}


package br.com.residencia.poo.segundaaula;

import java.util.Scanner;

public class SegundaAulaExercicioQuatro {

	public static void main(String[] args) {
		
		 Scanner leia = new Scanner (System.in);
		 String conversor;
		 float temperatura1, temperatura2, c, f;
		 

		 System.out.print("Conversor de temperatura");
		 System.out.print("\nO que você quer converter?" + "\n1) Graus Celsius (°C) em graus Fahrenheit (°F)" + "\n" +
		"2) Graus Fahrenheit (°F) em graus Celsius (°C)");
		 System.out.print("\nDigite a opção desejada: ");
		 conversor = leia.next();

	 	if (conversor = "1"){
	 		System.out.print("\nDigite a temperatura em graus Celsius (°C): "); 
	 		temperatura1 = leia.nextFloat();
	 		f = (temperatura1*1.8) + 32;
	 		System.out.print("\nA temperatura em graus Fahrenheit (°F) é: " + f);
	 	
	 	}else if (conversor = "2") {
	 		
	 		System.out.print("Digite a temperatura em graus Fahrenheit (°F): ");
			temperatura2 = leia.nextFloat();
			c = (temperatura2-32)/1.8;
			System.out.print("\nA temperatura em graus Celsius (°C) é: " + c +"°C");
	}	 	

}
}

