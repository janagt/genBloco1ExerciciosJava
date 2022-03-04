//SEMANA 4 - BLOCO 1 - 04/03/22
//INTRODUÇÃO LÓGICA COM JAVA
//LAÇOS DE REPETIÇÃO & MATRIZES E VETORES
//EXERCÍCIOS FEITO PELO INSTRUTOR EM AULA


package Repeticao;

import java.util.Scanner;

public class ExemploDoWhile {
	//DO WHILE (FAÇA ENQUANTO): Parecido com o WHILE, é um laço tipo composto, limitado à uma condição.
	//							Vai executar apenas uma vez, antes de excecutar a condição.
	
	public static void main(String[] args) {
		int n1, n2;
		double resultado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		n1 = leia.nextInt();
		
		System.out.println("Digite outro número: ");
		n2 = leia.nextInt();
		
		
		do {
			resultado = (double) n1/n2;								//conversor de int para double
			System.out.println("O resultado é: " + resultado);
			
			System.out.println("Digite um número: ");				//laço de repetição de coleta de dados
			n1 = leia.nextInt();			
			System.out.println("Digite outro número: ");
			n2 = leia.nextInt();
		} while (n2!=0);
		
		System.out.println("FIM DO PROGRAMA");						//Mensagem no console quando a condição for falsa.
	}
	

}
