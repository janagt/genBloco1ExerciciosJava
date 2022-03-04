//SEMANA 4 - BLOCO 1 - 04/03/22
//INTRODU��O L�GICA COM JAVA
//LA�OS DE REPETI��O & MATRIZES E VETORES


package Repeticao;

import java.util.Scanner;

public class Lista7Exercicio3 {
	//Solicitar a idade de v�rias pessoas e imprimir: Total de pessoas com menos de
	//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	//idade for =-99. (WHILE)

	public static void main(String[] args) {
		// idade -> variavel para iniciar os anos inseridos na contagem input
		// menores -> vari�vel para os com menos de 21 anos
		// maiores -> vari�vel para os com mais de 50 anos
		
		int idade, menores=0, maiores=0;
		Scanner leia = new Scanner(System.in);					//input
		
		System.out.print("Digite a idade: ");					
		idade = leia.nextInt();									//coleta
		
		while(idade>-99) {										//condi��o
			//System.out.println(idade);
			
			System.out.print("\nDigite a idade ou digite -99 para fechar a contagem: ");
			idade = leia.nextInt();								//continua a coleta
			
			if(idade<21){
				menores++;
			}
			else if(idade>50){
				maiores++;
			}
			
		}

		System.out.println("\nMenores de 21 anos: " + menores + ", maiores de 50 anos: " + maiores);

	}

}
