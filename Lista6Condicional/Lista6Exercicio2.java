//SEMANA 4 - BLOCO 1 - 03/03/22
//INTRODU��O L�GICA COM JAVA
//LA�OS CONDICIONAIS


package Condicional;

import java.util.Scanner;

public class Lista6Exercicio2 {
	//Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
	
	public static void main(String[] args) {
		int n1,n2,n3,saida1,saida2,saida3; 
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite tr�s n�meros: ");
		n1 = leia.nextInt();
		n2 = leia.nextInt();
		n3 = leia.nextInt();
		
		//System.out.print("Os n�meros escolhidos foram: " + n1 + ", "+ n2 + ", "+ n3);
		
		if (n1>n2 && n1>n3 && n2>n3) {
			System.out.println("\nMaior para o menor valor: " + n1 + ", "+ n2 + ", "+ n3);
		}
		else if (n1>n2 && n1>n3 && n3>n2) {
			System.out.println("\nMaior para o menor valor: " + n1 + ", "+ n3 + ", "+ n2);
		}
		else if (n2>n1 && n2>n3 && n1>n3) {
			System.out.println("\nMaior para o menor valor: " + n2 + ", "+ n1 + ", "+ n3);
		}
		else if (n2>n1 && n2>n3 && n3>n1) {
			System.out.println("\nMaior para o menor valor: " + n2 + ", "+ n3 + ", "+ n1);
		}
		else if (n3>n1 && n3>n2 && n1>n2) {
			System.out.println("\nMaior para o menor valor: " + n3 + ", "+ n1 + ", "+ n2);
		}
		else if (n3>n1 && n3>n2 && n2>n1) {
			System.out.println("\nMaior para o menor valor: " + n3 + ", "+ n2 + ", "+ n1);
		}
	}
}
