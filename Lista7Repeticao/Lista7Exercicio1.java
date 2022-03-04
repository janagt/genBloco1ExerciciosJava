//SEMANA 4 - BLOCO 1 - 04/03/22
//INTRODUÇÃO LÓGICA COM JAVA
//LAÇOS DE REPETIÇÃO & MATRIZES E VETORES


package Repeticao;

public class Lista7Exercicio1 {
	//Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)

	public static void main(String[] args) {
		int numeros;
		
		for (numeros=1000; numeros<=1999; numeros++) {
			
			if (numeros%11==5){									//resto de numeros dividido por 11 tem que ser 5
				System.out.println(numeros);
			}
		}
	}

}
