//SEMANA 5 - BLOCO 1 - 08/03/22
//INTRODU��O DE PROGRAMA��O ORIENTADA � OBJETO
//HERAN�A
//EXERC�CIOS FEITO PELO INSTRUTOR EM AULA


package POOHeranca;

public class ExemploGen {
	public static void main(String[] args) {
		ExemploPessoa p1 = new ExemploPessoa();
		ExemploAluno a1 = new ExemploAluno();
		ExemploProfessor prof1 = new ExemploProfessor();
		ExemploProfMatematica pm = new ExemploProfMatematica();
		
		pm.lecionarMatem�tica();
		
		p1.setNome("Luiz");
		a1.setNome("Jo�o");	
		prof1.setNome("Maria");
		
		System.out.println("Nome �: "+p1.getNome());
		System.out.println("Nome �: "+a1.getNome());
		System.out.println("Nome �: "+prof1.getNome());
		
		prof1.aumento(30);
		a1.entregarAtividade();
		
	}
}
