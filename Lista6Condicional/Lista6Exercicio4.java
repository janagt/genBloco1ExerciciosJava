//SEMANA 4 - BLOCO 1 - 03/03/22
//INTRODU��O L�GICA COM JAVA
//LA�OS CONDICIONAIS


package Condicional;

import java.util.Scanner;

public class Lista6Exercicio4 {
	//Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
	//n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
	//�mpar exiba o n�mero elevado ao quadrado.
	
	
	public static void main(String[] args) {
		double numero, resto, valorRaiz, valorPotencia;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira um n�mero: ");
		numero = leia.nextDouble();
		
		resto = numero % 2;
		
		if (resto==0){
			valorRaiz = Math.sqrt(numero);
			System.out.println(numero + " � par, sua raiz quadrada � de: " + valorRaiz);
		}
		else {
			valorPotencia = Math.pow(numero, 2);
			System.out.println(numero + " � �mpar, sua raiz quadrada � de: " + valorPotencia);
		}
	}
}
