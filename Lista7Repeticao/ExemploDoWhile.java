//SEMANA 4 - BLOCO 1 - 04/03/22
//INTRODU��O L�GICA COM JAVA
//LA�OS DE REPETI��O & MATRIZES E VETORES
//EXERC�CIOS FEITO PELO INSTRUTOR EM AULA


package Repeticao;

import java.util.Scanner;

public class ExemploDoWhile {
	//DO WHILE (FA�A ENQUANTO): Parecido com o WHILE, � um la�o tipo composto, limitado � uma condi��o.
	//							Vai executar apenas uma vez, antes de excecutar a condi��o.
	
	public static void main(String[] args) {
		int n1, n2;
		double resultado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		n1 = leia.nextInt();
		
		System.out.println("Digite outro n�mero: ");
		n2 = leia.nextInt();
		
		
		do {
			resultado = (double) n1/n2;								//conversor de int para double
			System.out.println("O resultado �: " + resultado);
			
			System.out.println("Digite um n�mero: ");				//la�o de repeti��o de coleta de dados
			n1 = leia.nextInt();			
			System.out.println("Digite outro n�mero: ");
			n2 = leia.nextInt();
		} while (n2!=0);
		
		System.out.println("FIM DO PROGRAMA");						//Mensagem no console quando a condi��o for falsa.
	}
	

}
