//SEMANA 5 - BLOCO 1 - 07/03/22
//INTRODUÇÃO DE PROGRAMAÇÃO ORIENTADA À OBJETO
//CLASSE, ATRIBUTOS, MÉTODOS E INSTÂNCIAS


package POOIntroducao;

public class Lista8Exercicio4Funcionario {
	//Crie uma classe funcionário e apresente os atributos e métodos
	//referentes esta classe, em seguida crie um objeto funcionário, defina as
	//instancias deste objeto e apresente as informações deste objeto no console.
	
	String nome;
	String sobrenome ;
	String cargo;
	char sexo;
	int bloco;
	int cadastro;
	String turno;
	
	//METODO CONSTRUTOR (quando o método padrão não atende os requisitos)
	
	public Lista8Exercicio4Funcionario() {							//começa com o mesmo nome da classe
		this.nome="Luíza";
		this.sobrenome="Lima";
		this.cargo="Estoquista";
		this.sexo='F';
		this.bloco=13;
		this.cadastro=2022;
		this.turno="Manhã";
	}
	
	//método listagem
	public void listar() {
		System.out.println("Funcionário(a): " + this.nome + " " + this.sobrenome);
		System.out.println("Função: " + this.cargo);
		System.out.println("Gênero: " + this.sexo);
		System.out.println("Responsável pelo bloco: " + this.bloco);
		System.out.println("Número do cadastro " + this.cadastro);
		System.out.println("Turno: " + this.turno);
	};
}
