//SEMANA 5 - BLOCO 1 - 07/03/22
//INTRODUÇÃO DE PROGRAMAÇÃO ORIENTADA À OBJETO
//CLASSE, ATRIBUTOS, MÉTODOS E INSTÂNCIAS


package POOIntroducao;

public class Lista8Exercicio7Paciente {
	String nome;
	String endereco;
	long cpf;
	long telefone;
	char sexo;
	int codigoConvenio;
	boolean ativo;
	String sintomas;
	int codigoPaciente;
	
	//METODO CONSTRUTOR (quando o método padrão não atende os requisitos)
	public Lista8Exercicio7Paciente() {							//começa com o mesmo nome da classe
		this.nome="José da Silva";
		this.endereco="Avenida Brasil, 595 - Jd Ipaussurama - Moeminha/SP";
		this.cpf=44200205449l;
		this.telefone=2232325846l;
		this.sexo='M';
		this.codigoConvenio=423246;
		this.sintomas="Dores de cabeça, ânsia";
		this.codigoPaciente=299;
	}
	
	//método listagem
	public void listar() {
		System.out.println("DADOS DO PACIENTE " + codigoPaciente);
		System.out.println("\nNome: " + this.nome);
		System.out.println("Endereço: " + this.endereco);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("Gênero: " + this.sexo);
		System.out.println("Código Convênio: " + this.codigoConvenio);
		System.out.println("Ativo: " + this.ativo);
		System.out.println("Sintomas: " + this.sintomas);
	};
}
