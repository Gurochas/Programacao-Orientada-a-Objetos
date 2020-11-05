package Aeroporto;

public class Piloto extends Pessoa{
	private int id;
	private String nacionalidade; 
	private Aeronave aviao;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}


	public Aeronave getAviao() {
		return aviao;
	}
	public void setAviao(Aeronave aviao) {
		this.aviao = aviao;
	}
	
	
	public void pilotar() {
		System.out.println(getNome() + " está pilotando");
	}
}

