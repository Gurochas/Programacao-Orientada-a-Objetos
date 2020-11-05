package Observer;

public class Leitor implements Observer{
	
	private String nome;
	
	public Leitor(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public void update(Revista r) {
		System.out.println(nome + " est� endo o artigo - " + r.artigo());
		
	}
	
}
