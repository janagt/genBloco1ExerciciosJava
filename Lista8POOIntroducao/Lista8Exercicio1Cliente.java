//SEMANA 5 - BLOCO 1 - 07/03/22
//INTRODUÇÃO DE PROGRAMAÇÃO ORIENTADA À OBJETO
//CLASSE, ATRIBUTOS, MÉTODOS E INSTÂNCIAS


package POOIntroducao;

public class Lista8Exercicio1Cliente {
	//Crie uma classe cliente e apresente os atributos e métodos referentes
	//esta classe, em seguida crie um objeto cliente, defina as instancias deste
	//objeto e apresente as informações deste objeto no console.
	
	
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
	
	//método listagem
	public void listar() {
		System.out.println("Nome do Cliente: " + this.nome);
		System.out.println("Ordem de Serviço: " + this.ordemDeServico);
		System.out.println("Orçamento: " + this.valor);
		System.out.println("Pagamento efetuado: " + this.pagamento);
	};
	
	
}
