//SEMANA 5 - BLOCO 1 - 08/03/22
//INTRODUÇÃO DE PROGRAMAÇÃO ORIENTADA À OBJETO
//HERANÇA


package POOHeranca;

//CLASSE ANIMAIS = MOLDE
public class Lista9Exercicio1Animal {
	//Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
	//comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
	//características de forma que tudo o que for comum a todos os animais fique na classe Animal:
	//ANIMAL: 1 Cachorro (nome, idade, som, corre) 2 Cavalo (nome, idade, som, corre) 3 Preguiça (nome, idade, som, sobe arvore)
	
	private String nome;
	private int idade;
	private String som;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	
	
}
