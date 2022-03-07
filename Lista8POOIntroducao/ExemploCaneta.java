//SEMANA 5 - BLOCO 1 - 07/03/22
//INTRODU��O DE PROGRAMA��O ORIENTADA � OBJETO
//CLASSE, ATRIBUTOS, M�TODOS E INST�NCIAS
//EXERC�CIOS FEITO PELO INSTRUTOR EM AULA

package POOIntroducao;

public class ExemploCaneta {								//o molde da caneta, o projeto
	
	//ATRIBUTOS (Caracter�sticas)
	
	String cor;
	double ponta;
	int carga;
	boolean tampada;
	
	//METODO CONSTRUTOR (quando o m�todo padr�o n�o atende os requisitos)
	
	public ExemploCaneta() {							//come�a com o mesmo nome da classe
		this.tampada=true;
		this.carga=100;
		this.cor="azul";
		this.ponta=1.0;
	}
	
	//M�TODOS (Comportamentos) - fun��o
	
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
		System.out.println("Est� tampada? " + this.tampada);
		System.out.println("A carga est� hein: " + this.carga + "%");
	}

}
