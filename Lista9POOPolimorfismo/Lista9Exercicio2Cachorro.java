//SEMANA 5 - BLOCO 1 - 09/03/22
//INTRODU��O DE PROGRAMA��O ORIENTADA � OBJETO
//POLIMORFISMO


package POOPolimorfismo;

public class Lista9Exercicio2Cachorro extends Lista9Exercicio2Animal{
	//Implemente um programa que crie os 3 tipos de animais definidos no exerc�cio
	//anterior e invoque o m�todo que emite o som de cada um de forma polim�rfica, isto
	//�, independente do tipo de animal.

	
	@Override				//Respons�vel por sobrescrever o m�todo de reptil
	public void emitirSom() {				//m�todo respons�vel por executar sysout - pois void n�o retorna
		System.out.println("Late...");
	}
}
