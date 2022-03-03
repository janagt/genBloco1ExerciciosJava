//SEMANA 4 - BLOCO 1 - 03/03/22
//INTRODUÇÃO LÓGICA COM JAVA
//LAÇOS CONDICIONAIS


package Condicional;

import java.util.*;

public class Lista6Exercicio1 {
	// Faça um programa que receba três inteiros e diga qual deles é o maior.
	
	public static void main(String[] args) {
		int n1,n2,n3,maiorNumero=0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite três números: ");
		n1 = leia.nextInt();
		n2 = leia.nextInt();
		n3 = leia.nextInt();
		
		System.out.print("Os números escolhidos foram: " + n1 + ", "+ n2 + ", "+ n3);
		
		if(n1 > maiorNumero){
			maiorNumero = n1;
		}
		if (n2 > maiorNumero){
			maiorNumero = n2;
		}
		if (n3 > maiorNumero){
			maiorNumero = n3;
		}

		System.out.println("\nO maior número é: " + maiorNumero);
	}

}
