package Introducao;

import java.util.Scanner;

//Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
//expressa em segundos e mostre-o expresso em horas, minutos e segundos.

public class Lista1Exercicio3 {
	
	//equivalente a funcao inicio
	public static void main(String[] args) {
		
		//inteiro segundos, minutos, horas, resto1, duracao
		int seg, min, hora, resto, duracao;
		Scanner leia = new Scanner(System.in);

		//escreva("\nOl�, insira quantos segundos teve a dura��o do evento:")
		System.out.println("Ol�, quantos segundos durou o evento? ");
		//leia(duracao)
		duracao = leia.nextInt();

		hora = duracao / 3600;		//dura��o em horas
		resto = duracao % 3600; 	//resto vai dar o tanto de meses

		min = resto / 60; 			//dura��o em dias
		seg = resto % 60; 			//vai dar o resto de dias
		
		//escreva("\nN�mero em segundos: ", segundos,"s")
		System.out.println("\nDura��o de segundos: " + seg + "s");
		//escreva("\nN�mero em minutos: ", minutos,"min")
		System.out.println("Dura��o de minutos: " + min + "min");
		//escreva("\nN�mero em horas: ", horas,"h")
		System.out.println("Dura��o de hors: " + hora + "h");
	}

}
