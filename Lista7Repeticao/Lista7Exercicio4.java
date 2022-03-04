//SEMANA 4 - BLOCO 1 - 04/03/22
//INTRODUÇÃO LÓGICA COM JAVA
//LAÇOS DE REPETIÇÃO & MATRIZES E VETORES


package Repeticao;

import java.util.Scanner;

public class Lista7Exercicio4 {
	//Uma empresa desenvolveu uma pesquisa para saber as características
	//psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
	//era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
	//(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
	//agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
	//pessoas, calcule e mostre: (WHILE)
	//-- o número de pessoas calmas;
	//-- o número de mulheres nervosas;
	//-- número de homens agressivos;
	//-- número de outros calmos;
	//-- número de pessoas nervosas com mais de 40 anos;
	//-- número de pessoas calmas com menos de 18 anos.
	
	public static void main(String[] args) {
		int idade=0, genero, personalidade, pessoas=0, pCalmas=0, mNervosas=0, hAgressivos=0, oCalmos=0, pNervosasMais=0, pCalmasMenos=0;
		
		Scanner leia = new Scanner(System.in);
		
		while(pessoas<150){
			
			//coleta de dados
			System.out.println("Qual sua idade? ");
			idade = leia.nextInt();
			System.out.println("Qual seu gênero? Digite: \n1-Masculino\n2-Feminino\n3-Outros");
			genero = leia.nextInt();
			System.out.println("Você se considera: \n1-Pessoa Calma\n2-Pessoa Nervosa\n3-Pessoa Agressiva");
			personalidade = leia.nextInt();
			
			//número de pessoas calmas
			if (personalidade==1){
				pCalmas++;						//contagem 1+1
			}
			
			//número de mulheres nervosas
			if (personalidade==2 && genero==2){
				mNervosas++;					
			}

			//número de homens agressivos
			if (personalidade==3 && genero==1){
				hAgressivos++;					
			}
			
			//número de outros calmos
			if (personalidade==1 && genero==3){
				oCalmos++;					
			}

			//número de pessoas nervosas+40
			if (personalidade==2 && idade>40){
				pNervosasMais++;					
			}
			
			//número de pessoas calmas-18
			if (personalidade==1 && idade>18){
				pCalmasMenos++;					
			}
			
			pessoas++; 							//responsável pela contagem do total de pessoas
			
		}
		System.out.println("Total da pesquisa:\n\tPessoas calmas: " + pCalmas+"\n\tMulheres nervosas: " +mNervosas+"\n\tHomens agressivos: " +hAgressivos+"\n\tOutros calmos: " +oCalmos+"\n\tPessoas nervosas com mais de 40 anos: " +pNervosasMais+ "\n\tPessoas calmas com menos de 18 anos:" +pCalmasMenos);
	}

}
