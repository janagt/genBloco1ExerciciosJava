package POOHeranca;

//classe pessoa MOLDE
public class ExemploPessoa {
	
	//atributos que ficar�o protegidos pelo private
	private String nome;
	private int idade;
	private double altura;
	
	//respons�vel pela contagem de anivers�rio
	public void aniversario()
	{
		this.idade++;		//idade = idade +1
	}

	//respons�vel pela exibi��o do nome
	public String getNome() {
		return nome;
	}

	//respons�vel pela altera��o do nome
	public void setNome(String nome) {
		this.nome = nome;
	}

	//respons�vel pela exibi��o da idade
	public int getIdade() {
		return idade;
	}

	//respons�vel pela altera��o da idade
	public void setIdade(int idade) {
		this.idade = idade;
	}

	//respons�vel pela exibi��o da altura
	public double getAltura() {
		return altura;
	}

	//respons�vel pela altera��o da altura
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
}
