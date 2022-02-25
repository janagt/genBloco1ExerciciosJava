//SEMANA 3 - BLOCO 1 - 25/02/22
//INTRODUÇÃO LÓGICA COM JAVA
//OPERADORES ARITMÉTICOS

package Introducao;

import java.util.Scanner;

public class Lista1Exercicio4 {
	//Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
	//calcule a seguinte expressão: D = (R + S) / 2, onde: R = (A+B)²  e S= (B+C)²

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//inteiro a, b, c
		int nA,nB,nC;
		//real r, s, d, somaAB, somaBC, somaRS
		double nR, nS, nD, somaAB, somaBC, somaRS;			//tipo real, mas double é para potência
		Scanner leia = new Scanner (System.in);				//SYSTEM INPUT
		
		//escreva("Digite o primeiro número: ")
		System.out.print("Digite o número de A: ");			//SYSTEM OUTPUT
		//leia(a)
		nA = leia.nextInt();
		
		//escreva("Digite o segundo número: ")
		System.out.print("Digite o número de B: ");
		//leia(b)
		nB = leia.nextInt();
		
		//escreva("Digite o terceiro número: ")
		System.out.print("Digite o número de C: ");
		//leia(c)
		nC = leia.nextInt();

		somaAB= nA+nB;
		somaBC= nB+nC;

		//r= mat.potencia(somaAB, 2)
		nR = Math.pow(somaAB, 2);							// Formula de potência em java
		//s= mat.potencia(somaBC, 2)
		nS = Math.pow(somaBC, 2);

		somaRS= (nR + nS) / 2;
		
		//escreva("O resultado é: ", somaRS)
		System.out.println("\nO resultado é: " + somaRS);
		
	}

}
