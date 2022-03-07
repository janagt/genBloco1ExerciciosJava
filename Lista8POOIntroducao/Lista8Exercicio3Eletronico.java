//SEMANA 5 - BLOCO 1 - 07/03/22
//INTRODU��O DE PROGRAMA��O ORIENTADA � OBJETO
//CLASSE, ATRIBUTOS, M�TODOS E INST�NCIAS


package POOIntroducao;

public class Lista8Exercicio3Eletronico {
	//Crie uma classe produto eletr�nico e apresente os atributos e m�todos
	//referentes esta classe, em seguida crie um objeto produto eletr�nico,
	//defina as instancias deste objeto e apresente as informa��es deste objeto no console.
	
	String marca;
	String modelo ;
	String cor;
	double peso;
	int android;
	boolean conexao;
	boolean provaDAgua;
	
	//METODO CONSTRUTOR (quando o m�todo padr�o n�o atende os requisitos)
	
	public Lista8Exercicio3Eletronico() {							//come�a com o mesmo nome da classe
		this.marca="Samsung";
		this.modelo="Galaxy Note 10 Lite";
		this.cor="Azul Meia Noite";
		this.peso=0.2;
		this.android=11;
		this.provaDAgua=true;
	}
	
	//m�todo listagem
	public void listar() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Peso: " + this.peso);
		System.out.println("Vers�o Android: " + this.android);
		System.out.println("Tem 5g? " + this.conexao);
		System.out.println("Tem prote��o IP68? " + this.provaDAgua);
	};
}
