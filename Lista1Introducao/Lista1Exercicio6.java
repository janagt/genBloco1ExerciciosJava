//SEMANA 3 - BLOCO 1 - 25/02/22
//INTRODU��O L�GICA COM JAVA
//OPERADORES ARITM�TICOS


package Introducao;

import java.util.Scanner;

public class Lista1Exercicio6 {
	//Construa um programa em c que, tendo como dados de entrada dois pontos
	//quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a dist�ncia entre eles. A f�rmula
	//que efetua tal c�lculo �: d = squareRoot((x2-x1)� + (y2-y1)�) --> raiz quadrada

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//inteiro p1X, p1Y, p2X, p2Y
		int pontoX1, pontoX2, pontoY1, pontoY2;
		//real subt1, subt2, poten1, poten2, soma, d
		double subtracao1, subtracao2, potencia1, potencia2, soma, valorD;
		Scanner leia = new Scanner(System.in);
		
		//PONTO 1
		//escreva("Qual que � a distancia horizontal (x) do ponto 1? ")
		System.out.print("Qual � a dist�ncia horizontal (x) do ponto 1? ");
		//leia(p1X)	
		pontoX1 = leia.nextInt();
		//escreva("Qual que � a distancia vertical (y) do ponto 1? ")
		System.out.print("Qual � a dist�ncia horizontal (y) do ponto 1? ");
		//leia(p1Y)
		pontoY1 = leia.nextInt();

		//PONTO 2
		//escreva("Qual que � a distancia horizontal (x) do ponto 2? ")
		System.out.print("Qual � a dist�ncia horizontal (x) do ponto 2? ");
		//leia(p2X)
		pontoX2 = leia.nextInt();
		//escreva("Qual que � a distancia vertical (y) do ponto 2? ")
		System.out.print("Qual � a dist�ncia horizontal (y) do ponto 2? ");
		//leia(p2Y)
		pontoY2 = leia.nextInt();
		
		subtracao1 = pontoX2 - pontoX1;
		subtracao2 = pontoY2 - pontoY1;

		//poten1= mat.potencia(subt1, 2)
		potencia1 = Math.pow(subtracao1, 2);			// formula de potencia
		//poten2= mat.potencia(subt2, 2)
		potencia2 = Math.pow(subtracao2, 2);

		soma = potencia1 + potencia2;
		
		//d = mat.raiz(soma, 2)
		valorD = Math.sqrt(soma);

		//escreva("A distancia entre o ponto 1 do ponto 2 �: ", d)
		System.out.println("A dist�ncia entre os pontos � de: " + valorD);

	}

}
