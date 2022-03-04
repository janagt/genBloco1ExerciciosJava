//SEMANA 4 - BLOCO 1 - 04/03/22
//INTRODUÇÃO LÓGICA COM JAVA
//LAÇOS DE REPETIÇÃO & MATRIZES E VETORES


package Repeticao;

import java.util.Scanner;

public class Lista7Exercicio2 {
	//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

	public static void main(String[] args) {
		int numeros, valor, pares=0,impares=0;							//numeros=laço, valor=inserido pelo user + contagem (par/impar)
		
		for(numeros=0; numeros<10; numeros++) {
			
			Scanner leia = new Scanner(System.in);						//input
			System.out.print("Digite um numero: ");						//sinaliza pro usuário
			valor = leia.nextInt();										//coleta a informação
			
			if(valor%2==0){												//laço validação do valor user par/impar e contagem
				//System.out.println("Número par:" + numeros);
				pares++;
			}else{
				//System.out.println("Número ímpar:" + numeros);
				impares++;
			}
		}
		
		System.out.println("Números pares: "+pares+", números ímpares: "+impares+".");		//exibe

	}

}
