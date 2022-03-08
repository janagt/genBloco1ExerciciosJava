//SEMANA 5 - BLOCO 1 - 08/03/22
//INTRODUÇÃO DE PROGRAMAÇÃO ORIENTADA À OBJETO
//HERANÇA
//EXERCÍCIOS FEITO PELO INSTRUTOR EM AULA


package POOHeranca;

//classe de professor = MOLDE professor
public class ExemploProfMatematica extends ExemploProfessor {//a classe profmatematica é uma subclasse de professor (que é subclasse de pessoa)
	
	//caracteristicas do professor, não de pessoa
	public void lecionarMatemática() {
		System.out.println("Ensinando matemática");
	}

}
