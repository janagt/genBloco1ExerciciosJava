//SEMANA 5 - BLOCO 1 - 07/03/22
//INTRODUÇÃO DE PROGRAMAÇÃO ORIENTADA À OBJETO
//CLASSE, ATRIBUTOS, MÉTODOS E INSTÂNCIAS


package POOIntroducao;

public class Lista8Exercicio6ContaBancaria {
	//Crie uma classe conta bancaria e apresente os atributos e métodos
	//referentes esta classe, em seguida crie um objeto conta bancaria, defina
	//as instancias deste objeto e apresente as informações deste objeto no console.
	
	String banco;
	String nome;
	int agencia;
	String contaCorrente;
	double saldoInicial;
	String dataInicial;
	boolean ativo;
	
	//METODO CONSTRUTOR (quando o método padrão não atende os requisitos)
	public Lista8Exercicio6ContaBancaria() {							//começa com o mesmo nome da classe
		this.banco="BB | Branco do Brasil";
		this.nome="José da Silva";
		this.agencia=40601;
		this.contaCorrente="423246-X";
		this.saldoInicial=1500;
		this.dataInicial="25/04/2021";
		this.ativo=true;
	}
	
	//método listagem
	public void listar() {
		System.out.println("Banco: " + this.banco);
		System.out.println("Nome: " + this.nome);
		System.out.println("Agência: " + this.agencia);
		System.out.println("Conta corrente: " + this.contaCorrente);
		System.out.println("Saldo inicial: R$" + this.saldoInicial);
		System.out.println("Data inicial: " + this.dataInicial);
		System.out.println("Ativo: " + this.ativo);
	};

}
