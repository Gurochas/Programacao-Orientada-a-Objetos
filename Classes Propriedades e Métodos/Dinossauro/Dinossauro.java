package Dinossauro;

public class Dinossauro {
	
	int energia;
	int velocidade;
	int temperatura;
	String humor;
	
	public Dinossauro() {
		energia = 5;
		velocidade = 0;
		temperatura = 5;
		humor = "Feliz :)";
		
	}

	public void pular(){
		System.out.println("O dinossauro pulou || \n\t Humor: Feliz :) \n\t -1 energia");
		humor = "Feliz :)";
		energia--;
	}
	
	public void correr(){
		System.out.println("O dinossauro correu - \n\t Humor: Feliz :) \n\t -1 energia");
		humor = "Feliz :)";
		energia--;
	}
	
	public void comer(){
		System.out.println("O dinossauro comeu - \n\t Humor: Feliz :) \n\t +1 energia");
		humor = "Feliz :)";
		energia++;
	}
	
	public void brincar(){
		System.out.println("O dinossauro brincou - \n\t Humor: Feliz :) \n\t -1 energia");
		humor = "Feliz :)";
		energia--;
	}
	
	public void tomarSol(){
		System.out.println("O dinossauro tomou sol - \n\t +1 velocidade \n\t -1 energia");
		velocidade++;
		energia--;
	}
	
	public void ficarNaSombra(){
		System.out.println("O dinossauro ficou na sombra - \n\t Humor: Triste :( \n\t +1 energia");
		humor = "Triste :(";
		energia++;
	}
	
}
