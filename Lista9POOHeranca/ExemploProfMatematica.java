package POOHeranca;

//classe de professor = MOLDE professor
public class ExemploProfMatematica extends ExemploProfessor {//a classe profmatematica � uma subclasse de professor (que � subclasse de pessoa)
	
	//caracteristicas do professor, n�o de pessoa
	public void lecionarMatem�tica() {
		System.out.println("Ensinando matem�tica");
	}

}
