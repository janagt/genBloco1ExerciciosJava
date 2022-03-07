//SEMANA 5 - BLOCO 1 - 07/03/22
//INTRODUÇÃO DE PROGRAMAÇÃO ORIENTADA À OBJETO
//CLASSE, ATRIBUTOS, MÉTODOS E INSTÂNCIAS
//EXERCÍCIOS FEITO PELO INSTRUTOR EM AULA

package POOIntroducao;

public class ExemploCaneta {								//o molde da caneta, o projeto
	
	//ATRIBUTOS (Características)
	
	String cor;
	double ponta;
	int carga;
	boolean tampada;
	
	//METODO CONSTRUTOR (quando o método padrão não atende os requisitos)
	
	public ExemploCaneta() {							//começa com o mesmo nome da classe
		this.tampada=true;
		this.carga=100;
		this.cor="azul";
		this.ponta=1.0;
	}
	
	//MÉTODOS (Comportamentos) - função
	
	public void escrever() {
		
		// para ela escrever tem que estar tampada
		if (this.tampada==true){							//usado para referenciar 
			System.out.println("ERRO caneta tampada!");
		}else {
			System.out.println("Escrevendo...");
		}
	}
	
	public void tampar() {
		this.tampada=true;
	}
	
	public void destampar() {
		this.tampada=false;
	}
	
	public void estado() {
		System.out.println("Cor: " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Está tampada? " + this.tampada);
		System.out.println("A carga está hein: " + this.carga + "%");
	}

}
