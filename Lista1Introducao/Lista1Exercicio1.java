//SEMANA 3 - BLOCO 1 - 25/02/22
//INTRODU��O L�GICA COM JAVA
//OPERADORES ARITM�TICOS

package Introducao;

import java.util.Scanner;


public class Lista1Exercicio1 {
	//Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e
	//mostre-a expressa apenas em dias.
	
	
	//equivalente a funcao inicio
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// inteiro anos, meses, dias, var1, var2, var3
		int n1, n2, n3, anos, meses, dias;
		Scanner leia = new Scanner(System.in);				//respons�vel por puxar o que digitado no console
				
		//escreva("\nOl�, quantos anos vc tem: ")
		System.out.print("Digite quantos anos: ");
		//leia(anos)
		n1=leia.nextInt();									//referente ao leia do Portugol
		//escreva("\nOl�, insira quantos meses:")
		System.out.print("Digite quantos meses: ");
		//leia(meses)
		n2=leia.nextInt();	
		//escreva("\nOl�, insira quantos dias:")
		System.out.print("Digite quantos dias: ");
		//leia(dias)
		n3=leia.nextInt();	
		
		//var1= anos * 365				//para saber os anos em dias
		anos = n1 * 365;
		//var2= meses * 30				//para saber os meses em dias
		meses = n2 *30;
		//var3= var1 + var2 + dias			//para saber o total de dias
		dias = anos + meses + n3;
		
		
		//escreva("\nSua idade �: ",var3)
		System.out.println("A sua idade em dias �: " + dias + " dias.");
		
	}

}
