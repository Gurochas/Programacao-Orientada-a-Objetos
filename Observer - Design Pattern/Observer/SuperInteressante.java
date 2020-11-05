package Observer;

import java.util.LinkedList;
import java.util.List;

public class SuperInteressante implements Revista, Subject{
	
	List<Observer> assinantes = new LinkedList<>();
	private String artigo;
	
	public void publicarArtigo(String artigo) {
		System.out.println("Publicando artigo");
		this.artigo = artigo;
		notificar();
	}

	@Override
	public void notificar() {
		System.out.println("Enviando novo artigo aos assinantes");
		for(Observer o : assinantes) {
			o.update(this);
		}
	}

	@Override
	public void registrar(Observer o) {
		assinantes.add(o);
		System.out.println("Assinante registrado");
	}

	@Override
	public String artigo() {
		return artigo;
	}
	
}
