//SEMANA 3 - BLOCO 1 - 25/02/22
//INTRODUÇÃO LÓGICA COM JAVA
//OPERADORES ARITMÉTICOS


package Introducao;

import java.util.Scanner;

public class Lista1Exercicio8 {
	//O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
	//percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
	//Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
	//escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
	//consumidor.
	
	public static void main(String[] args) {
		double custoInicial, perc, custoDistribuidor, custoImposto, custoFinal;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva o custo de fábrica do carro: R$");
		custoInicial = leia.nextDouble();
		
		//percentual distribuidor 28 – percentual impostos 45
		perc = 100 - 45 - 28; 			// valor que sobra dos impostos
		
		custoDistribuidor = (custoInicial * 28) / perc;
		custoImposto = (custoInicial * 45) / perc; 
		
		custoFinal = custoInicial + custoDistribuidor + custoImposto;
		System.out.println("O custo final do consumidor para o carro é: R$" + custoFinal);
	}

}
