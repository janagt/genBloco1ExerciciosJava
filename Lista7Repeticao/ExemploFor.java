//SEMANA 4 - BLOCO 1 - 04/03/22
//INTRODUÇÃO LÓGICA COM JAVA
//LAÇOS DE REPETIÇÃO & MATRIZES E VETORES
//EXERCÍCIOS FEITO PELO INSTRUTOR EM AULA


package Repeticao;

public class ExemploFor {
	// FOR (PARA): Quando sabemos até onde vai a contagem, quantas vezes queremos repetir.
	// x=1 -> inicia (tabuada começa pelo 1)
	// x<= -> término (tabuada termina no 10)
	// x++ -> incremento de 1 em 1 (igual x+=1)
	
	
	public static void main(String[] args) {
		int tabuada;								//variável para laço
		
		System.out.println("TABUADA DO 5");			//retorno console do exercício
		
		for (tabuada=1;tabuada<=10;tabuada++){		//condições
			System.out.println("5 x " + tabuada + " = " + 5*tabuada);
		}
	}
}
