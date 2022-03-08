//SEMANA 5 - BLOCO 1 - 08/03/22
//INTRODUÇÃO DE PROGRAMAÇÃO ORIENTADA À OBJETO
//HERANÇA
//EXERCÍCIOS FEITO PELO INSTRUTOR EM AULA


package POOHeranca;

//classe de aluno = MOLDE aluno
public class ExemploAluno extends ExemploPessoa {				//a classe aluno é uma subclasse de pessoa
	
	//caracteristicas do aluno, não de pessoa
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

	//void sempre pux parametro e não retorna
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
