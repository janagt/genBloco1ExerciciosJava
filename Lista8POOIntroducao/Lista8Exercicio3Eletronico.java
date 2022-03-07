//SEMANA 5 - BLOCO 1 - 07/03/22
//INTRODUÇÃO DE PROGRAMAÇÃO ORIENTADA À OBJETO
//CLASSE, ATRIBUTOS, MÉTODOS E INSTÂNCIAS


package POOIntroducao;

public class Lista8Exercicio3Eletronico {
	//Crie uma classe produto eletrônico e apresente os atributos e métodos
	//referentes esta classe, em seguida crie um objeto produto eletrônico,
	//defina as instancias deste objeto e apresente as informações deste objeto no console.
	
	String marca;
	String modelo ;
	String cor;
	double peso;
	int android;
	boolean conexao;
	boolean provaDAgua;
	
	//METODO CONSTRUTOR (quando o método padrão não atende os requisitos)
	
	public Lista8Exercicio3Eletronico() {							//começa com o mesmo nome da classe
		this.marca="Samsung";
		this.modelo="Galaxy Note 10 Lite";
		this.cor="Azul Meia Noite";
		this.peso=0.2;
		this.android=11;
		this.provaDAgua=true;
	}
	
	//método listagem
	public void listar() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Peso: " + this.peso);
		System.out.println("Versão Android: " + this.android);
		System.out.println("Tem 5g? " + this.conexao);
		System.out.println("Tem proteção IP68? " + this.provaDAgua);
	};
}
