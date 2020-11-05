package CRUD_Alunos;

import java.util.ArrayList;
import java.util.List;

public class Control {
	
	private List<Contato> lista = new ArrayList<>();
	
	public void adicionarContato(Contato c) {
		lista.add(c);
		System.out.printf("A lista agora tem %d contatos%n", lista.size());
	}
	
	public Contato presquisar (String nome) {
		for (Contato c : lista) { 
			if (c.getNome().contains(nome)){ 
				return c;
			}
		}
		return null;
	}
	
	
	
	

}
