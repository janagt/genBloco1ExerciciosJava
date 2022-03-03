//SEMANA 4 - BLOCO 1 - 03/03/22
//INTRODUÇÃO LÓGICA COM JAVA
//LAÇOS CONDICIONAIS


package Condicional;

import java.util.Scanner;

public class Lista6Exercicio4 {
	//Faça um programa em que permita a entrada de um número qualquer e exiba se este
	//número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
	//ímpar exiba o número elevado ao quadrado.
	
	
	public static void main(String[] args) {
		double numero, resto, valorRaiz, valorPotencia;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira um número: ");
		numero = leia.nextDouble();
		
		resto = numero % 2;
		
		if (resto==0){
			valorRaiz = Math.sqrt(numero);
			System.out.println(numero + " é par, sua raiz quadrada é de: " + valorRaiz);
		}
		else {
			valorPotencia = Math.pow(numero, 2);
			System.out.println(numero + " é ímpar, sua raiz quadrada é de: " + valorPotencia);
		}
	}
}
