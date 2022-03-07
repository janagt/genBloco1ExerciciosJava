//SEMANA 5 - BLOCO 1 - 07/03/22
//INTRODUÇÃO DE PROGRAMAÇÃO ORIENTADA À OBJETO
//CLASSE, ATRIBUTOS, MÉTODOS E INSTÂNCIAS


package POOIntroducao;

public class Lista8Exercicio2Aviao {
	//Crie uma classe avião e apresente os atributos e métodos referentes
	//esta classe, em seguida crie um objeto avião, defina as instancias deste
	//objeto e apresente as informações deste objeto no console.
	
	
	String modelo;
	double alcanceMaximo ;
	int capacidadeDePassageiros;
	int totalDeLeitos;
	double velocidadeOperacionalMaxima;
	double pesoMaximoDecolagem;
	double altitudeMaximaDeCruzeiro;
	
	//construtor
	public Lista8Exercicio2Aviao() {
		this.modelo= "Gulfstream G650";
		this.alcanceMaximo = 13000;
		this.capacidadeDePassageiros = 19;
		this.totalDeLeitos = 10;
		this.velocidadeOperacionalMaxima = 1100;
		this.pesoMaximoDecolagem = 45000;
		this.altitudeMaximaDeCruzeiro = 15000;		
	}

	//método listagem
	public void listar() {
		System.out.println("Modelo do avião: " + this.modelo);
		System.out.println("Alcance máximo: " + this.alcanceMaximo + "km");
		System.out.println("Capacidade de passageiros: " + this.capacidadeDePassageiros);
		System.out.println("Total de leitos: " + this.totalDeLeitos);
		System.out.println("Velocidade operacional máxima: " + this.velocidadeOperacionalMaxima + "km/h");
		System.out.println("Peso máximo para decolagem: " + this.pesoMaximoDecolagem + "kg");
		System.out.println("Altitude máxima de cruzeiro: " + this.altitudeMaximaDeCruzeiro + "m");
	};
}
