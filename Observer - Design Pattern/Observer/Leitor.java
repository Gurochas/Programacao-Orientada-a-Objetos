package Observer;

public class Leitor implements Observer{
	
	private String nome;
	
	public Leitor(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public void update(Revista r) {
		System.out.println(nome + " está endo o artigo - " + r.artigo());
		
	}
	
}
