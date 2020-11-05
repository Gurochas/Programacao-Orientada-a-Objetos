package Dicionario;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		
		List<Palavra> lista = new LinkedList<>();
		
		Palavra p1 = new Palavra("Amor", "Forte afeição por outra pessoa, nascida de laços de consanguinidade ou de relações sociais.");
		lista.add(p1);
		Palavra p2 = new Palavra("Amizade","Sentimento de grande afeição, simpatia, apreço entre pessoas ou entidades.");
		lista.add(p2);
		Palavra p3 = new Palavra("Cadeira","Peça de mobília composta de um assento individual e de um encosto, com ou sem braços.");
		lista.add(p3);
		Palavra p4 = new Palavra("Mercado","Lugar público onde negociantes expõem e vendem gêneros alimentícios e artigos de uso rotineiro.");
		lista.add(p4);
		Palavra p5 = new Palavra("Caneta","Pequeno tubo em que se coloca lápis ou pena para escrever.");
		lista.add(p5);
		Palavra p6 = new Palavra("Felicidade","Qualidade ou estado de feliz.");
		lista.add(p6);
		
		
		System.out.println("Digite a palavra a ser procurada: ");
		String palavra = scan.nextLine();
		
		boolean find = false;
		for(Palavra p : lista) {
			if(p.getPalavra().contains(palavra)) {
				System.out.println(p.getPalavra() + " - " + p.getDefinicao());
				find = true;
			}
		}
		
		if(!find) { 
			System.out.println("Palavra não encontrada - Digite sua defição: ");
			Palavra np = new Palavra(palavra, scan.nextLine());
			System.out.println("- Palavra registrada -");
			System.out.println(np.getPalavra() + " - " +np.getDefinicao());
		}
	}

}
