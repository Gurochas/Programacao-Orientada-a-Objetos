package Aluno;

public class Aluno {
	
	private long id;
	private String nome;
	private String ra;
	private String nascimento;

	public Aluno() {
		super();
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	
	public void exibir() {
		System.out.println("ID: " + id +
						   "\nNome: " + nome + 
						   "\nRA: " + ra +
						   "\nData de Nascimento: " + nascimento);
	}
	
}
