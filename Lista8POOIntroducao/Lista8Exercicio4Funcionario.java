//SEMANA 5 - BLOCO 1 - 07/03/22
//INTRODU��O DE PROGRAMA��O ORIENTADA � OBJETO
//CLASSE, ATRIBUTOS, M�TODOS E INST�NCIAS


package POOIntroducao;

public class Lista8Exercicio4Funcionario {
	//Crie uma classe funcion�rio e apresente os atributos e m�todos
	//referentes esta classe, em seguida crie um objeto funcion�rio, defina as
	//instancias deste objeto e apresente as informa��es deste objeto no console.
	
	String nome;
	String sobrenome ;
	String cargo;
	char sexo;
	int bloco;
	int cadastro;
	String turno;
	
	//METODO CONSTRUTOR (quando o m�todo padr�o n�o atende os requisitos)
	
	public Lista8Exercicio4Funcionario() {							//come�a com o mesmo nome da classe
		this.nome="Lu�za";
		this.sobrenome="Lima";
		this.cargo="Estoquista";
		this.sexo='F';
		this.bloco=13;
		this.cadastro=2022;
		this.turno="Manh�";
	}
	
	//m�todo listagem
	public void listar() {
		System.out.println("Funcion�rio(a): " + this.nome + " " + this.sobrenome);
		System.out.println("Fun��o: " + this.cargo);
		System.out.println("G�nero: " + this.sexo);
		System.out.println("Respons�vel pelo bloco: " + this.bloco);
		System.out.println("N�mero do cadastro " + this.cadastro);
		System.out.println("Turno: " + this.turno);
	};
}
