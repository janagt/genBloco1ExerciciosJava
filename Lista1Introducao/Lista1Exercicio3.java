package Introducao;

import java.util.Scanner;

//Faça um sistema que leia o tempo de duração de um evento em uma fábrica
//expressa em segundos e mostre-o expresso em horas, minutos e segundos.

public class Lista1Exercicio3 {
	
	//equivalente a funcao inicio
	public static void main(String[] args) {
		
		//inteiro segundos, minutos, horas, resto1, duracao
		int seg, min, hora, resto, duracao;
		Scanner leia = new Scanner(System.in);

		//escreva("\nOlá, insira quantos segundos teve a duração do evento:")
		System.out.println("Olá, quantos segundos durou o evento? ");
		//leia(duracao)
		duracao = leia.nextInt();

		hora = duracao / 3600;		//duração em horas
		resto = duracao % 3600; 	//resto vai dar o tanto de meses

		min = resto / 60; 			//duração em dias
		seg = resto % 60; 			//vai dar o resto de dias
		
		//escreva("\nNúmero em segundos: ", segundos,"s")
		System.out.println("\nDuração de segundos: " + seg + "s");
		//escreva("\nNúmero em minutos: ", minutos,"min")
		System.out.println("Duração de minutos: " + min + "min");
		//escreva("\nNúmero em horas: ", horas,"h")
		System.out.println("Duração de hors: " + hora + "h");
	}

}
