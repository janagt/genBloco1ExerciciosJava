//SEMANA 4 - BLOCO 1 - 03/03/22
//INTRODU��O L�GICA COM JAVA
//LA�OS CONDICIONAIS


package Condicional;

import java.util.*;

public class Lista6Exercicio1 {
	// Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
	
	public static void main(String[] args) {
		int n1,n2,n3,maiorNumero=0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite tr�s n�meros: ");
		n1 = leia.nextInt();
		n2 = leia.nextInt();
		n3 = leia.nextInt();
		
		System.out.print("Os n�meros escolhidos foram: " + n1 + ", "+ n2 + ", "+ n3);
		
		if(n1 > maiorNumero){
			maiorNumero = n1;
		}
		if (n2 > maiorNumero){
			maiorNumero = n2;
		}
		if (n3 > maiorNumero){
			maiorNumero = n3;
		}

		System.out.println("\nO maior n�mero �: " + maiorNumero);
	}

}
