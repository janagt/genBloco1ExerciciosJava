//SEMANA 5 - BLOCO 1 - 08/03/22
//INTRODU��O DE PROGRAMA��O ORIENTADA � OBJETO
//HERAN�A
//EXERC�CIOS FEITO PELO INSTRUTOR EM AULA


package POOHeranca;

//classe de professor = MOLDE professor
public class ExemploProfMatematica extends ExemploProfessor {//a classe profmatematica � uma subclasse de professor (que � subclasse de pessoa)
	
	//caracteristicas do professor, n�o de pessoa
	public void lecionarMatem�tica() {
		System.out.println("Ensinando matem�tica");
	}

}
