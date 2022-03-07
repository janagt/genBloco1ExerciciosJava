//SEMANA 5 - BLOCO 1 - 07/03/22
//INTRODUÇÃO DE PROGRAMAÇÃO ORIENTADA À OBJETO
//CLASSE, ATRIBUTOS, MÉTODOS E INSTÂNCIAS


package POOIntroducao;

public class Lista8Exercicio5Patinete {
	//Crie uma classe patinete e apresente os atributos e métodos referentes
	//esta classe, em seguida crie um objeto patinete, defina as instancias deste
	//objeto e apresente as informações deste objeto no console.
	
	
	String modelo;
	String cor;
	String idade;
	int rodas;
	boolean eletrico;
	
	//METODO CONSTRUTOR (quando o método padrão não atende os requisitos)
	public Lista8Exercicio5Patinete() {							//começa com o mesmo nome da classe
		this.modelo="FX3000";
		this.cor="branco";
		this.idade="até 10 anos";
		this.rodas=3;
	}
	
	//método listagem
	public void listar() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Idade: " + this.idade);
		System.out.println("Quantidade de rodas: " + this.rodas);
	};
}
