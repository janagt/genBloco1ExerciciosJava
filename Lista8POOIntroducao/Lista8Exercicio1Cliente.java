//SEMANA 5 - BLOCO 1 - 07/03/22
//INTRODU��O DE PROGRAMA��O ORIENTADA � OBJETO
//CLASSE, ATRIBUTOS, M�TODOS E INST�NCIAS


package POOIntroducao;

public class Lista8Exercicio1Cliente {
	//Crie uma classe cliente e apresente os atributos e m�todos referentes
	//esta classe, em seguida crie um objeto cliente, defina as instancias deste
	//objeto e apresente as informa��es deste objeto no console.
	
	
	String nome;
	int ordemDeServico;
	double valor;
	boolean pagamento;
	
	//construtor
	public Lista8Exercicio1Cliente() {
		this.nome="Lucas";
		this.ordemDeServico=4597;
		this.valor=4000;
		this.pagamento=true;
	}
	
	//m�todo listagem
	public void listar() {
		System.out.println("Nome do Cliente: " + this.nome);
		System.out.println("Ordem de Servi�o: " + this.ordemDeServico);
		System.out.println("Or�amento: " + this.valor);
		System.out.println("Pagamento efetuado: " + this.pagamento);
	};
	
	
}
