//SEMANA 5 - BLOCO 1 - 10/03/22
//INTRODU��O DE PROGRAMA��O ORIENTADA � OBJETO
//COLLECTIONS & EXCEPTIONS


package POOCollections;

import java.util.ArrayList;

public class Lista9Exercicio3Loja {
	//Crie uma um programa para trabalhar com estoque de uma loja, o programa dever�
	//trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
	//programa dever� atender as seguintes funcionalidades:
	//	>	Armazenar dados da List
	//	>	Remover dados da list;
	//	>	Atualizar dados da list.
	//	>	Apresentar todos os dados da list.
	
	public static void main(String[] args) {
		//cole��o de objetos -> referentes � classe roupas
		Lista9Exercicio3Roupas peca1 = new Lista9Exercicio3Roupas("Anel",21);
		Lista9Exercicio3Roupas peca2 = new Lista9Exercicio3Roupas("Colar",50);
		Lista9Exercicio3Roupas peca3 = new Lista9Exercicio3Roupas("Pulseira",90);
		Lista9Exercicio3Roupas peca4 = new Lista9Exercicio3Roupas("Brinco",90);
		
		//lista que juntar� os objetos
		ArrayList<Lista9Exercicio3Roupas>roupas = new ArrayList<>();
		
		//estado atual do objeto roupas
		System.out.println(roupas);
		System.out.println();
		//ades�o das pe�as
		roupas.add(peca1);
		roupas.add(peca2);
		roupas.add(peca3);
		roupas.add(peca4);
		System.out.println(roupas);
		System.out.println();
		//remo��o da pe�a2 (indice 1)
		roupas.remove(1);
		System.out.println(roupas);
		System.out.println();
		//sobrescreve pe�a2 no �ndice 0
		roupas.set(0, peca2);
		//adiciona outra pe�a2
		roupas.add(peca2);
		System.out.println(roupas);
		
	}
	
}
