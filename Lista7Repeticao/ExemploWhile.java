//SEMANA 4 - BLOCO 1 - 04/03/22
//INTRODUÇÃO LÓGICA COM JAVA
//LAÇOS DE REPETIÇÃO & MATRIZES E VETORES
//EXERCÍCIOS FEITO PELO INSTRUTOR EM AULA


package Repeticao;

import java.util.Scanner;

public class ExemploWhile {
	//WHILE (ENQUANTO): Quando não sabemos até quando irá se repetir, não dá para mensuarar. PODE NUNCA ACONTECER.
	
	public static void main(String[] args) {
		int n1, n2;
		double resultado;
		
		Scanner leia = new Scanner(System.in);							//indicador de input
		
		System.out.println("Digite um número: ");						//indicador de output
		n1 = leia.nextInt();
		
		System.out.println("Digite um valor que irá dividir: ");		//indicador de output
		n2 = leia.nextInt();
		
		resultado = (double) n1/n2;										//converte inteiro para real
		
		while (n2!=0){													//enquanto for diferente de 0, fará o laço
			System.out.println("Divisão: " + resultado);
			
			System.out.println("Digite um número: ");					//pq eu quero que ele repita
			n1 = leia.nextInt();			
			System.out.println("Digite um valor que irá dividir: ");
			n2 = leia.nextInt();
			resultado = (double) n1/n2;	
		}
		System.out.println("FIM DO PROGRAMA");							//se n2!=0 não for verdadeira, não irá executar o laço
	}

}
