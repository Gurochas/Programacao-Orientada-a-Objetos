package Aeroporto;

public class Passageiro extends Pessoa{
	private String num_passagem;
	private String tipo_passagem;
	private int numero_de_bagagens;
	
	public Passageiro() {
		super();
	}

	public String getNum_passagem() {
		return num_passagem;
	}

	public void setNum_passagem(String num_passagem) {
		this.num_passagem = num_passagem;
	}

	public String getTipo_passagem() {
		return tipo_passagem;
	}

	public void setTipo_passagem(String tipo_passagem) {
		this.tipo_passagem = tipo_passagem;
	}

	public int getNumero_de_bagagens() {
		return numero_de_bagagens;
	}

	public void setNumero_de_bagagens(int numero_de_bagagens) {
		this.numero_de_bagagens = numero_de_bagagens;
	}

	public void viajar() {
		System.out.println("O passageiro " + getNome() + " está viajando");
	}
}

