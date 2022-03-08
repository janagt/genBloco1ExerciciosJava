//SEMANA 5 - BLOCO 1 - 08/03/22
//INTRODU��O DE PROGRAMA��O ORIENTADA � OBJETO
//HERAN�A
//EXERC�CIOS FEITO PELO INSTRUTOR EM AULA


package POOHeranca;

//classe de aluno = MOLDE aluno
public class ExemploAluno extends ExemploPessoa {				//a classe aluno � uma subclasse de pessoa
	
	//caracteristicas do aluno, n�o de pessoa
	private int matricula;
	private String curso;
	
	//metodo dele
	public void entregarAtividade() {
		System.out.println("Atividade entregue com sucesso!!");
	}

	//get sempre retorna
	public int getMatricula() {
		return matricula;
	}

	//void sempre pux parametro e n�o retorna
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	//get retorna o valor da string curso
	public String getCurso() {
		return curso;
	}

	//get alterando o valor da string curso
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	

}
