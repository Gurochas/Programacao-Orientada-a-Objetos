package Telas;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Cadastro_Contatos extends Application {

	@Override
	public void start(Stage stage) {

		GridPane painel = new GridPane();
		Scene scn = new Scene(painel, 600, 135);
		
		painel.setVgap(10);
		
		ColumnConstraints col1 = new ColumnConstraints();
		col1.setPercentWidth(25);
		ColumnConstraints col2 = new ColumnConstraints();
		col2.setPercentWidth(75);
		painel.getColumnConstraints().addAll(col1, col2);
		
		painel.add(new Label("Id"), 0, 0);
		painel.add(new Label("Nome"), 0, 1);
		painel.add(new Label("Telefone"), 0, 2);
		
		TextField txtId = new TextField();
		TextField txtNome = new TextField();
		TextField txtTelefone = new TextField();
		
		painel.add(txtId, 1, 0);
		painel.add(txtNome, 1, 1);
		painel.add(txtTelefone, 1, 2);
		
		FlowPane fp = new FlowPane();
		
		Button btnSave = new Button("Salvar");
		Button btnPesquisar = new Button("Pesquisar");
		fp.getChildren().addAll(btnSave, btnPesquisar);
		painel.add(fp, 0, 3);
		
		stage.setScene(scn);
		stage.setTitle("Cadastro de Contatos");
		stage.show();

	}

	public static void main(String[] args) {
		Application.launch(Cadastro_Contatos.class, args);
	}

}