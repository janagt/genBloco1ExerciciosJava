//SEMANA 5 - BLOCO 1 - 07/03/22
//INTRODU��O DE PROGRAMA��O ORIENTADA � OBJETO
//CLASSE, ATRIBUTOS, M�TODOS E INST�NCIAS


package POOIntroducao;

public class Lista8Exercicio2Aviao {
	//Crie uma classe avi�o e apresente os atributos e m�todos referentes
	//esta classe, em seguida crie um objeto avi�o, defina as instancias deste
	//objeto e apresente as informa��es deste objeto no console.
	
	
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

	//m�todo listagem
	public void listar() {
		System.out.println("Modelo do avi�o: " + this.modelo);
		System.out.println("Alcance m�ximo: " + this.alcanceMaximo + "km");
		System.out.println("Capacidade de passageiros: " + this.capacidadeDePassageiros);
		System.out.println("Total de leitos: " + this.totalDeLeitos);
		System.out.println("Velocidade operacional m�xima: " + this.velocidadeOperacionalMaxima + "km/h");
		System.out.println("Peso m�ximo para decolagem: " + this.pesoMaximoDecolagem + "kg");
		System.out.println("Altitude m�xima de cruzeiro: " + this.altitudeMaximaDeCruzeiro + "m");
	};
}
