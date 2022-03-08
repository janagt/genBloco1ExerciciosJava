package POOHeranca;

//classe pessoa MOLDE
public class ExemploPessoa {
	
	//atributos que ficarão protegidos pelo private
	private String nome;
	private int idade;
	private double altura;
	
	//responsável pela contagem de aniversário
	public void aniversario()
	{
		this.idade++;		//idade = idade +1
	}

	//responsável pela exibição do nome
	public String getNome() {
		return nome;
	}

	//responsável pela alteração do nome
	public void setNome(String nome) {
		this.nome = nome;
	}

	//responsável pela exibição da idade
	public int getIdade() {
		return idade;
	}

	//responsável pela alteração da idade
	public void setIdade(int idade) {
		this.idade = idade;
	}

	//responsável pela exibição da altura
	public double getAltura() {
		return altura;
	}

	//responsável pela alteração da altura
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
}
