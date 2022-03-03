//SEMANA 4 - BLOCO 1 - 03/03/22
//INTRODUÇÃO LÓGICA COM JAVA
//LAÇOS CONDICIONAIS


package Condicional;

import java.util.Scanner;

public class Lista6Exercicio3 {
	//Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
	//10-14 infantil
	//15-17 juvenil
	//18-25 adulto
	
	
	public static void main(String[] args) {
		int idade;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Olá, nadador(a)! Qual sua idade? ");
		idade = leia.nextInt();

		if (idade>=18 && idade<=25)
		{
			System.out.println("Categoria: Adultos");
		}
		else if (idade<18 && idade>=15)
		{
			System.out.println("Categoria: Juvenil");
		}
		else if (idade<15 && idade>=10)
		{
			System.out.println("Categoria: Infantil");
		}
		else
		{
			System.out.println("Desculpe, insira uma idade entre 10 e 25 anos para calcularmos em que categoria você está!");
		}
	}
}
