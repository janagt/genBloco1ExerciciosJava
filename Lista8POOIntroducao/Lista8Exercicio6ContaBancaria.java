//SEMANA 5 - BLOCO 1 - 07/03/22
//INTRODU��O DE PROGRAMA��O ORIENTADA � OBJETO
//CLASSE, ATRIBUTOS, M�TODOS E INST�NCIAS


package POOIntroducao;

public class Lista8Exercicio6ContaBancaria {
	//Crie uma classe conta bancaria e apresente os atributos e m�todos
	//referentes esta classe, em seguida crie um objeto conta bancaria, defina
	//as instancias deste objeto e apresente as informa��es deste objeto no console.
	
	String banco;
	String nome;
	int agencia;
	String contaCorrente;
	double saldoInicial;
	String dataInicial;
	boolean ativo;
	
	//METODO CONSTRUTOR (quando o m�todo padr�o n�o atende os requisitos)
	public Lista8Exercicio6ContaBancaria() {							//come�a com o mesmo nome da classe
		this.banco="BB | Branco do Brasil";
		this.nome="Jos� da Silva";
		this.agencia=40601;
		this.contaCorrente="423246-X";
		this.saldoInicial=1500;
		this.dataInicial="25/04/2021";
		this.ativo=true;
	}
	
	//m�todo listagem
	public void listar() {
		System.out.println("Banco: " + this.banco);
		System.out.println("Nome: " + this.nome);
		System.out.println("Ag�ncia: " + this.agencia);
		System.out.println("Conta corrente: " + this.contaCorrente);
		System.out.println("Saldo inicial: R$" + this.saldoInicial);
		System.out.println("Data inicial: " + this.dataInicial);
		System.out.println("Ativo: " + this.ativo);
	};

}
