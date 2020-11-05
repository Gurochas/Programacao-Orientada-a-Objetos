package PetShop;

public class Veterinario extends Pessoa{
	private int id;
	private String turno;
	
	public Veterinario() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	public void trabalhar() {
		System.out.println(getNome() + " está trabalhando");
	}
	
}
