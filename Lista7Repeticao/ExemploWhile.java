//SEMANA 4 - BLOCO 1 - 04/03/22
//INTRODU��O L�GICA COM JAVA
//LA�OS DE REPETI��O & MATRIZES E VETORES
//EXERC�CIOS FEITO PELO INSTRUTOR EM AULA


package Repeticao;

import java.util.Scanner;

public class ExemploWhile {
	//WHILE (ENQUANTO): Quando n�o sabemos at� quando ir� se repetir, n�o d� para mensuarar. PODE NUNCA ACONTECER.
	
	public static void main(String[] args) {
		int n1, n2;
		double resultado;
		
		Scanner leia = new Scanner(System.in);							//indicador de input
		
		System.out.println("Digite um n�mero: ");						//indicador de output
		n1 = leia.nextInt();
		
		System.out.println("Digite um valor que ir� dividir: ");		//indicador de output
		n2 = leia.nextInt();
		
		resultado = (double) n1/n2;										//converte inteiro para real
		
		while (n2!=0){													//enquanto for diferente de 0, far� o la�o
			System.out.println("Divis�o: " + resultado);
			
			System.out.println("Digite um n�mero: ");					//pq eu quero que ele repita
			n1 = leia.nextInt();			
			System.out.println("Digite um valor que ir� dividir: ");
			n2 = leia.nextInt();
			resultado = (double) n1/n2;	
		}
		System.out.println("FIM DO PROGRAMA");							//se n2!=0 n�o for verdadeira, n�o ir� executar o la�o
	}

}
