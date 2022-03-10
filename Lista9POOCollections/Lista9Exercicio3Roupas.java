//SEMANA 5 - BLOCO 1 - 10/03/22
//INTRODU��O DE PROGRAMA��O ORIENTADA � OBJETO
//COLLECTIONS & EXCEPTIONS


package POOCollections;

public class Lista9Exercicio3Roupas {
	//Crie uma um programa para trabalhar com estoque de uma loja, o programa dever�
	//trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
	//programa dever� atender as seguintes funcionalidades:
	//	>	Armazenar dados da List
	//	>	Remover dados da list;
	//	>	Atualizar dados da list.
	//	>	Apresentar todos os dados da list.
	
	private String peca;
	private int quantidade;
	
	//metodo construtor
	public Lista9Exercicio3Roupas(String x, int y) {
		this.peca=x;
		this.quantidade=y;
	}
	
	//getters e setters
	public void setPeca(String peca) {
		this.peca = peca;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	//metodo para imprimir
	public String toString() {
		return "Pe�a: "+this.peca+" � Quantidade:"+this.quantidade;
	}
	
}
