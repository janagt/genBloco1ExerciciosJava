//SEMANA 4 - BLOCO 1 - 04/03/22
//INTRODU��O L�GICA COM JAVA
//LA�OS DE REPETI��O & MATRIZES E VETORES


package Repeticao;

import java.util.Scanner;

public class Lista7Exercicio2 {
	//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

	public static void main(String[] args) {
		int numeros, valor, pares=0,impares=0;							//numeros=la�o, valor=inserido pelo user + contagem (par/impar)
		
		for(numeros=0; numeros<10; numeros++) {
			
			Scanner leia = new Scanner(System.in);						//input
			System.out.print("Digite um numero: ");						//sinaliza pro usu�rio
			valor = leia.nextInt();										//coleta a informa��o
			
			if(valor%2==0){												//la�o valida��o do valor user par/impar e contagem
				//System.out.println("N�mero par:" + numeros);
				pares++;
			}else{
				//System.out.println("N�mero �mpar:" + numeros);
				impares++;
			}
		}
		
		System.out.println("N�meros pares: "+pares+", n�meros �mpares: "+impares+".");		//exibe

	}

}
