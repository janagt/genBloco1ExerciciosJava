package Introducao;

import java.util.Scanner;

//Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.

public class Lista1Exercicio2 {
	
	//equivalente a funcao inicio
	public static void main(String[] args) {
		
		//inteiro idade, anos, meses, dias, resto;
		int idade, anos, meses, dias, resto;
		Scanner leia = new Scanner(System.in);						//respons�vel por puxar o que digitado no console
		
		//escreva("\nOl�, insira quantos dias de vida voc� tem:")
		System.out.print("Ol�, insira quantos dias de vida: ");
		//leia(idade)
		idade = leia.nextInt();
		
		anos = idade / 365;			//para saber os dias em ano
		resto = idade % 365;		//puxa o que sobrou de dias (que nao conseguem formar um ano)

		meses = resto / 30;			//puxa o resto de dias, transforma em meses
		dias = resto % 30;			//puxa o resto de dias (que nao formaram um m�s)

		//escreva("\nAnos: ", anos)
		System.out.println("\nTotal de anos: " + anos);
		//escreva("\nMeses: ", meses)
		System.out.println("Total de meses: " + meses);
		//escreva("\nDias:", dias)
		System.out.println("Total de dias: " + dias);


	}

}
