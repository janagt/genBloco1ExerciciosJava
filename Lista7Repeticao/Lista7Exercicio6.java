//SEMANA 4 - BLOCO 1 - 04/03/22
//INTRODU��O L�GICA COM JAVA
//LA�OS DE REPETI��O & MATRIZES E VETORES


package Repeticao;

import java.util.Scanner;

public class Lista7Exercicio6 {
	//Escrever um programa que receba v�rios n�meros inteiros no teclado. E no final imprimir
	//a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)

	public static void main(String[] args) {
		
		int numero=0, soma=0,contaNumero=0;
		double media=0;
		Scanner leia=new Scanner(System.in);
		
		do {
			//faz o la�o com os inputs
			//coleta e soma enquanto for diferente de zero
			System.out.println("Digite um valor:");
			numero = leia.nextInt();
			
			//condi��o de multiplo exclui o zero
			if(numero%3==0 && numero!=0){				
				//vai somando de numero em numero
				soma+=numero;
				contaNumero++;
			}
			

			media= (double) soma/contaNumero;
			
		}while(numero!=0); 	
		
		System.out.println("A m�dia � de: " +media+"\nFIM DO PROGRAMA.");
	}

}
