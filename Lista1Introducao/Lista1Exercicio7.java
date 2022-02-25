//SEMANA 3 - BLOCO 1 - 25/02/22
//INTRODUÇÃO LÓGICA COM JAVA
//OPERADORES ARITMÉTICOS


package Introducao;

import java.util.Scanner;

public class Lista1Exercicio7 {
	//Um sistema de equações lineares do tipo: ax+by=c e dx+ey=f, pode ser resolvido segundo mostrado abaixo:
	//x = (ce-bf) / (ae-bd)
	//y = (af-cd) / (ae-bd)
	//Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//valores inteiros
		int nA, nB, nC, nD, nE, nF;
		//valores reais
		double subtracaoB, subtracaoX, subtracaoY, totalX, totalY; //subtracao base, subtracao de x e y – total das divisoes
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Escreva o valor para A: ");
		nA = leia.nextInt(); 
		System.out.print("Escreva o valor para B: ");
		nB = leia.nextInt(); 
		System.out.print("Escreva o valor para C: ");
		nC = leia.nextInt(); 
		System.out.print("Escreva o valor para D: ");
		nD = leia.nextInt(); 
		System.out.print("Escreva o valor para E: ");
		nE = leia.nextInt(); 
		System.out.print("Escreva o valor para F: ");
		nF = leia.nextInt(); 
		
		subtracaoB = (nA * nE) - (nB * nD);
		subtracaoX = (nC * nE) - (nB * nF);
		subtracaoY = (nA * nF) - (nC * nD);
		
		totalX = subtracaoX / subtracaoB;
		totalY = subtracaoY / subtracaoB;

		System.out.print("\nTotal de X: " + totalX);
		System.out.print("\nTotal de Y: " + totalY);
		
	}

}
