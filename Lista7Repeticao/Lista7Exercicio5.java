//SEMANA 4 - BLOCO 1 - 04/03/22
//INTRODU��O L�GICA COM JAVA
//LA�OS DE REPETI��O & MATRIZES E VETORES


package Repeticao;

import java.util.Scanner;

public class Lista7Exercicio5 {
	//Crie um programa que leia um n�mero do teclado at� que encontre um
	//n�mero igual a zero. No final, mostre a soma dos n�meros
	//digitados.(DO...WHILE)

	public static void main(String[] args) {
		int numero=0, soma=0;
		Scanner leia = new Scanner(System.in);
		
		do {
			//faz o la�o com os inputs
			//coleta e soma enquanto for diferente de zero
			System.out.println("Digite um valor:");
			numero = leia.nextInt();
			
			//vai somando de numero em numero
			soma+=numero;
		
		}while(numero!=0); //condi��o
		
		System.out.println("\nA soma dos valores inseridos �: "+soma+".\nFIM DO PROGRAMA.");
	}
}
