//SEMANA 5 - BLOCO 1 - 08/03/22
//INTRODUÇÃO DE PROGRAMAÇÃO ORIENTADA À OBJETO
//HERANÇA
//EXERCÍCIOS FEITO PELO INSTRUTOR EM AULA


package POOHeranca;

public class ExemploGen {
	public static void main(String[] args) {
		ExemploPessoa p1 = new ExemploPessoa();
		ExemploAluno a1 = new ExemploAluno();
		ExemploProfessor prof1 = new ExemploProfessor();
		ExemploProfMatematica pm = new ExemploProfMatematica();
		
		pm.lecionarMatemática();
		
		p1.setNome("Luiz");
		a1.setNome("João");	
		prof1.setNome("Maria");
		
		System.out.println("Nome é: "+p1.getNome());
		System.out.println("Nome é: "+a1.getNome());
		System.out.println("Nome é: "+prof1.getNome());
		
		prof1.aumento(30);
		a1.entregarAtividade();
		
	}
}
