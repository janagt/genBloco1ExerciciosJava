package POOHeranca;

//classe de professor = MOLDE professor
public class ExemploProfessor extends ExemploPessoa {//a classe professor � uma subclasse de pessoa
	
	//caracteristicas do professor, n�o de pessoa
	private double salario;
	private String modulo;
	
	//metodo dele
	public void aumento (double aum) {
		this.salario=salario+aum;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getModulo() {
		return modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}
	
	
}
