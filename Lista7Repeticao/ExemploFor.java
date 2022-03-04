//SEMANA 4 - BLOCO 1 - 04/03/22
//INTRODU��O L�GICA COM JAVA
//LA�OS DE REPETI��O & MATRIZES E VETORES
//EXERC�CIOS FEITO PELO INSTRUTOR EM AULA


package Repeticao;

public class ExemploFor {
	// FOR (PARA): Quando sabemos at� onde vai a contagem, quantas vezes queremos repetir.
	// x=1 -> inicia (tabuada come�a pelo 1)
	// x<= -> t�rmino (tabuada termina no 10)
	// x++ -> incremento de 1 em 1 (igual x+=1)
	
	
	public static void main(String[] args) {
		int tabuada;								//vari�vel para la�o
		
		System.out.println("TABUADA DO 5");			//retorno console do exerc�cio
		
		for (tabuada=1;tabuada<=10;tabuada++){		//condi��es
			System.out.println("5 x " + tabuada + " = " + 5*tabuada);
		}
	}
}
