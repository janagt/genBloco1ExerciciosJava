//SEMANA 5 - BLOCO 1 - 07/03/22
//INTRODU��O DE PROGRAMA��O ORIENTADA � OBJETO
//CLASSE, ATRIBUTOS, M�TODOS E INST�NCIAS


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
	
	//METODO CONSTRUTOR (quando o m�todo padr�o n�o atende os requisitos)
	public Lista8Exercicio7Paciente() {							//come�a com o mesmo nome da classe
		this.nome="Jos� da Silva";
		this.endereco="Avenida Brasil, 595 - Jd Ipaussurama - Moeminha/SP";
		this.cpf=44200205449l;
		this.telefone=2232325846l;
		this.sexo='M';
		this.codigoConvenio=423246;
		this.sintomas="Dores de cabe�a, �nsia";
		this.codigoPaciente=299;
	}
	
	//m�todo listagem
	public void listar() {
		System.out.println("DADOS DO PACIENTE " + codigoPaciente);
		System.out.println("\nNome: " + this.nome);
		System.out.println("Endere�o: " + this.endereco);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("G�nero: " + this.sexo);
		System.out.println("C�digo Conv�nio: " + this.codigoConvenio);
		System.out.println("Ativo: " + this.ativo);
		System.out.println("Sintomas: " + this.sintomas);
	};
}
