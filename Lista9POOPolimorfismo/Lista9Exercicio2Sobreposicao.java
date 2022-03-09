//SEMANA 5 - BLOCO 1 - 09/03/22
//INTRODUÇÃO DE PROGRAMAÇÃO ORIENTADA À OBJETO
//POLIMORFISMO


package POOPolimorfismo;

public class Lista9Exercicio2Sobreposicao {
	//Implemente um programa que crie os 3 tipos de animais definidos no exercício
	//anterior e invoque o método que emite o som de cada um de forma polimórfica, isto
	//é, independente do tipo de animal.
	
	//possui a main pois irá executar
	public static void main(String[] args) {
		//criação dos objetos
		Lista9Exercicio2Cachorro cachorro = new Lista9Exercicio2Cachorro();
		Lista9Exercicio2Cavalo cavalo = new Lista9Exercicio2Cavalo();
		Lista9Exercicio2Preguica preguica = new Lista9Exercicio2Preguica();
		
		cachorro.setNome("Pingo");
		cachorro.setIdade(10);
		cachorro.emitirSom();
		cachorro.setAcao("Corre...");
		
		System.out.println("\n");
		
		cavalo.setNome("Lulu");
		cavalo.setIdade(4);
		cavalo.emitirSom();
		cavalo.setAcao("Corre...");
		
		System.out.println("\n");
		
		preguica.setNome("Milly");
		preguica.setIdade(40);
		preguica.emitirSom();
		preguica.setAcao("Sobe em árvore...");
	}
}
