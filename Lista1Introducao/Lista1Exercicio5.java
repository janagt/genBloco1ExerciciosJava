//SEMANA 3 - BLOCO 1 - 25/02/22
//INTRODU��O L�GICA COM JAVA
//OPERADORES ARITM�TICOS

package Introducao;

import java.util.Scanner;

public class Lista1Exercicio5 {
	//Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
	//aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
	//respectivamente.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//inteiro nota1, nota2, nota3
		int nota1=0, nota2=0, nota3=0;
		//real totalN1, totalN2, totalN3, totalNotas
		double totalN1, totalN2, totalN3, totalNotas;
		Scanner leia = new Scanner(System.in);

		//escreva("Insira a nota do primeiro trimestre: ")
		System.out.println("Insira a nota do primeiro trimestre: ");
		//leia(nota1)
		nota1 = leia.nextInt();
		
		//escreva("Insira a nota do segundo trimestre: ")
		System.out.println("Insira a nota do segundo trimestre: ");
		//leia(nota2)
		nota2 = leia.nextInt();
		
		//escreva("Insira a nota do terceiro trimestre: ")
		System.out.println("Insira a nota do terceiro trimestre: ");
		//leia(nota3)
		nota3 = leia.nextInt();

		totalN1= nota1 * 2;			//pq a nota 1 tem peso 2
		totalN2= nota2 * 3;			//pq a nota 2 tem peso 3
		totalN3= nota3	* 5;		//pq a nota 3 tem peso 5

		totalNotas = (totalN1 + totalN2 + totalN3) / (2 + 3 + 5);	//media ponderada
		
		//escreva("Sua nota at� o terceiro trimestre �: ", totalNotas)
		System.out.println("Sua m�dia de notas at� o terceiro trimestre � de: " + totalNotas);
	}

}
