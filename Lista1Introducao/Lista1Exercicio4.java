//SEMANA 3 - BLOCO 1 - 25/02/22
//INTRODU��O L�GICA COM JAVA
//OPERADORES ARITM�TICOS

package Introducao;

import java.util.Scanner;

public class Lista1Exercicio4 {
	//Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
	//calcule a seguinte express�o: D = (R + S) / 2, onde: R = (A+B)�  e S= (B+C)�

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//inteiro a, b, c
		int nA,nB,nC;
		//real r, s, d, somaAB, somaBC, somaRS
		double nR, nS, nD, somaAB, somaBC, somaRS;			//tipo real, mas double � para pot�ncia
		Scanner leia = new Scanner (System.in);				//SYSTEM INPUT
		
		//escreva("Digite o primeiro n�mero: ")
		System.out.print("Digite o n�mero de A: ");			//SYSTEM OUTPUT
		//leia(a)
		nA = leia.nextInt();
		
		//escreva("Digite o segundo n�mero: ")
		System.out.print("Digite o n�mero de B: ");
		//leia(b)
		nB = leia.nextInt();
		
		//escreva("Digite o terceiro n�mero: ")
		System.out.print("Digite o n�mero de C: ");
		//leia(c)
		nC = leia.nextInt();

		somaAB= nA+nB;
		somaBC= nB+nC;

		//r= mat.potencia(somaAB, 2)
		nR = Math.pow(somaAB, 2);							// Formula de pot�ncia em java
		//s= mat.potencia(somaBC, 2)
		nS = Math.pow(somaBC, 2);

		somaRS= (nR + nS) / 2;
		
		//escreva("O resultado �: ", somaRS)
		System.out.println("\nO resultado �: " + somaRS);
		
	}

}
