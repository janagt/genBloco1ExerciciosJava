//SEMANA 5 - BLOCO 1 - 09/03/22
//INTRODUÇÃO DE PROGRAMAÇÃO ORIENTADA À OBJETO
//POLIMORFISMO


package POOPolimorfismo;

public class Lista9Exercicio2Cachorro extends Lista9Exercicio2Animal{
	//Implemente um programa que crie os 3 tipos de animais definidos no exercício
	//anterior e invoque o método que emite o som de cada um de forma polimórfica, isto
	//é, independente do tipo de animal.

	
	@Override				//Responsável por sobrescrever o método de reptil
	public void emitirSom() {				//método responsável por executar sysout - pois void não retorna
		System.out.println("Late...");
	}
}
