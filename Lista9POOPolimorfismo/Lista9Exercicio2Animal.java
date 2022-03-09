//SEMANA 5 - BLOCO 1 - 09/03/22
//INTRODUÇÃO DE PROGRAMAÇÃO ORIENTADA À OBJETO
//POLIMORFISMO


package POOPolimorfismo;

public abstract class Lista9Exercicio2Animal {				//abstract pq não criará objeto
	//Implemente um programa que crie os 3 tipos de animais definidos no exercício
	//anterior e invoque o método que emite o som de cada um de forma polimórfica, isto
	//é, independente do tipo de animal.
	
	private String nome;
	private int idade;
	private String acao;
	
	//métodos responsável por executar sysout - pois void não retorna
	public void emitirSom(){
		System.out.println("Som do Animal");
	}

	//métodos de set - para receber um parametro e exibir
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
