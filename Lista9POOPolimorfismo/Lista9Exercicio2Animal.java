//SEMANA 5 - BLOCO 1 - 09/03/22
//INTRODU��O DE PROGRAMA��O ORIENTADA � OBJETO
//POLIMORFISMO


package POOPolimorfismo;

public abstract class Lista9Exercicio2Animal {				//abstract pq n�o criar� objeto
	//Implemente um programa que crie os 3 tipos de animais definidos no exerc�cio
	//anterior e invoque o m�todo que emite o som de cada um de forma polim�rfica, isto
	//�, independente do tipo de animal.
	
	private String nome;
	private int idade;
	private String acao;
	
	//m�todos respons�vel por executar sysout - pois void n�o retorna
	public void emitirSom(){
		System.out.println("Som do Animal");
	}

	//m�todos de set - para receber um parametro e exibir
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setAcao(String acao) {
		this.acao = acao;
	}
	

}
