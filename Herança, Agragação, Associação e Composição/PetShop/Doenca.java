package PetShop;

public class Doenca {
	private int id;
	private String nome;
	private String descri��o;

	public Doenca() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescri��o() {
		return descri��o;
	}
	public void setDescri��o(String descri��o) {
		this.descri��o = descri��o;
	}
	
	public void espalhar() {
		System.out.println("A doen�a " + this.nome + " est� se espalhando");
	}

}
