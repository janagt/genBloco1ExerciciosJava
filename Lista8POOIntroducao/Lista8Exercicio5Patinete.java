//SEMANA 5 - BLOCO 1 - 07/03/22
//INTRODU��O DE PROGRAMA��O ORIENTADA � OBJETO
//CLASSE, ATRIBUTOS, M�TODOS E INST�NCIAS


package POOIntroducao;

public class Lista8Exercicio5Patinete {
	//Crie uma classe patinete e apresente os atributos e m�todos referentes
	//esta classe, em seguida crie um objeto patinete, defina as instancias deste
	//objeto e apresente as informa��es deste objeto no console.
	
	
	String modelo;
	String cor;
	String idade;
	int rodas;
	boolean eletrico;
	
	//METODO CONSTRUTOR (quando o m�todo padr�o n�o atende os requisitos)
	public Lista8Exercicio5Patinete() {							//come�a com o mesmo nome da classe
		this.modelo="FX3000";
		this.cor="branco";
		this.idade="at� 10 anos";
		this.rodas=3;
	}
	
	//m�todo listagem
	public void listar() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Idade: " + this.idade);
		System.out.println("Quantidade de rodas: " + this.rodas);
	};
}
