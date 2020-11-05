package CRUD_Alunos_BCE;

import java.util.ArrayList;
import java.util.List;

import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class AlunoControl {
	
	private ObservableList<Aluno> lista = FXCollections.observableArrayList();

	private LongProperty id = new SimpleLongProperty();
	private StringProperty ra = new SimpleStringProperty();
	private StringProperty nome = new SimpleStringProperty();
	
	
	public Aluno getAluno() {
		Aluno a = new Aluno();
		a.setId(this.id.get());
		a.setRa(this.ra.get());
		a.setNome(this.nome.get());
		return a;
	}
	
	public void setAluno(Aluno a) {
		if(a != null) {
			this.id.set(a.getId());
			this.ra.set(a.getRa());
			this.nome.set(a.getNome());
		}
	}
	
	public void adicionar() {
		lista.add(getAluno());
	}
	
	public void pesquisarPorNome() {
		String txt = this.nome.get();
		for(Aluno a : lista) {
			if(a.getNome().contains(txt)) {
				setAluno(a);
			}
		}
	}
	
	public ObservableList<Aluno> getLista() { 
		return lista;
	}

	public LongProperty getIdProperty() {
		return id;
	}

	public StringProperty getRaProperty() {
		return ra;
	}

	public StringProperty getNomeProperty() {
		return nome;
	}
	
}
