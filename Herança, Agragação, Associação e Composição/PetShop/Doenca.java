package PetShop;

public class Doenca {
	private int id;
	private String nome;
	private String descrição;

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
	public String getDescrição() {
		return descrição;
	}
	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}
	
	public void espalhar() {
		System.out.println("A doença " + this.nome + " está se espalhando");
	}

}
