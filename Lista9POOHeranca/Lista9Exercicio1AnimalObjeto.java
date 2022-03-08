package POOHeranca;

public class Lista9Exercicio1AnimalObjeto {

	public static void main(String[] args) {
		Lista9Exercicio1Cachorro cachorro1 = new Lista9Exercicio1Cachorro();
		Lista9Exercicio1Cavalo cavalo1 = new Lista9Exercicio1Cavalo();
		Lista9Exercicio1Preguica preguica1 = new Lista9Exercicio1Preguica();
		
		cachorro1.setNome("Chiquito");
		cachorro1.setIdade(7);
		cachorro1.setSom("Auau! (Late)");
		cachorro1.setAcao("Corre");
		
		
		cavalo1.setNome("Rei");
		cavalo1.setIdade(14);
		cavalo1.setSom("Irrinho! (Relincha)");
		cavalo1.setAcao("Corre");
		
		
		preguica1.setNome("Lulu");
		preguica1.setIdade(45);
		preguica1.setSom("Aaaaaaa! (Balidos)");
		preguica1.setAcao("Sobe em árvore");
		
		
		//prof1.setNome("Maria");
		
		System.out.println("CACHORRO:\n––––––––––––––\nNome: "+cachorro1.getNome()+"\nIdade: "+cachorro1.getIdade()+"\nSom: "+cachorro1.getSom()+"\nAção: "+cachorro1.getAcao());
		
		System.out.println("\n\nCAVALO:\n––––––––––––––\nNome: "+cavalo1.getNome()+"\nIdade: "+cavalo1.getIdade()+"\nSom: "+cavalo1.getSom()+"\nAção: "+cavalo1.getAcao());
		
		System.out.println("\n\nPREGUIÇA:\n––––––––––––––\nNome: "+preguica1.getNome()+"\nIdade: "+preguica1.getIdade()+"\nSom: "+preguica1.getSom()+"\nAção: "+preguica1.getAcao());
		
	}

}
