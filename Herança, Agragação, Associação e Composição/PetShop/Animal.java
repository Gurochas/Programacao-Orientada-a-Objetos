package PetShop;

public class Animal {
	private String nome;
	private String sexo;
	private Doenca doenca;

	private Dono dono;
	
	public Animal() {
		super();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Dono getDono() {
		return dono;
	}
	public void setDono(Dono dono) {
		this.dono = dono;
	}
	
	public Doenca getDoenca() {
		return doenca;
	}
	
	public void setDoenca(Doenca doenca) {
		this.doenca = doenca;
	}

	public void comer() {
		System.out.println(nome + " está comendo ração.");
	}

}
