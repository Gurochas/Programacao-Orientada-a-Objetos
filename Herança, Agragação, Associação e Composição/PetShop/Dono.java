package PetShop;

public class Dono extends Pessoa{
	private String telefone;

	public Dono() {
		super();
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void levarPet() {
		System.out.println(getNome() + " está levando seu pet para consulta");
	}

}
