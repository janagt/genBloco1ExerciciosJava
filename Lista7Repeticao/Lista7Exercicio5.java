//SEMANA 4 - BLOCO 1 - 04/03/22
//INTRODUÇÃO LÓGICA COM JAVA
//LAÇOS DE REPETIÇÃO & MATRIZES E VETORES


package Repeticao;

import java.util.Scanner;

public class Lista7Exercicio5 {
	//Crie um programa que leia um número do teclado até que encontre um
	//número igual a zero. No final, mostre a soma dos números
	//digitados.(DO...WHILE)

	public static void main(String[] args) {
		int numero=0, soma=0;
		Scanner leia = new Scanner(System.in);
		
		do {
			//faz o laço com os inputs
			//coleta e soma enquanto for diferente de zero
			System.out.println("Digite um valor:");
			numero = leia.nextInt();
			
			//vai somando de numero em numero
			soma+=numero;
		
		}while(numero!=0); //condição
		
		System.out.println("\nA soma dos valores inseridos é: "+soma+".\nFIM DO PROGRAMA.");
	}
}
