package POOHeranca;

//classe de professor = MOLDE professor
public class ExemploProfMatematica extends ExemploProfessor {//a classe profmatematica é uma subclasse de professor (que é subclasse de pessoa)
	
	//caracteristicas do professor, não de pessoa
	public void lecionarMatemática() {
		System.out.println("Ensinando matemática");
	}

}
