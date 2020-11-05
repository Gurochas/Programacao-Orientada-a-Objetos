package ExGestaoAlunos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AlunoBoundary extends Application implements EventHandler<ActionEvent> {

	private TextField txtId = new TextField();
	private TextField txtNome = new TextField();
	private TextField txtRa = new TextField();
	private TextField txtNascimento = new TextField();

	private Button btnAdicionar = new Button("Adicionar");
	private Button btnPesquisar = new Button("Pesquisar");

	private List<Aluno> lista = new ArrayList<>();

	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	@Override
	public void start(Stage stage) {
		BorderPane bp = new BorderPane();

		Scene scn = new Scene(bp, 600, 200);

		GridPane grid = new GridPane();
		grid.setHgap(20);

		ColumnConstraints colLabels = new ColumnConstraints();
		colLabels.setHalignment(HPos.LEFT);
		colLabels.setPercentWidth(15);

		ColumnConstraints colTextField = new ColumnConstraints();
		colTextField.setPercentWidth(50);

		grid.getColumnConstraints().addAll(colLabels, colTextField);

		bp.setCenter(grid);

		grid.add(new Label("Id"), 0, 0);
		grid.add(txtId, 1, 0);
		grid.add(new Label("Nome"), 0, 1);
		grid.add(txtNome, 1, 1);
		grid.add(new Label("Telefone"), 0, 2);
		grid.add(txtRa, 1, 2);
		grid.add(new Label("Nascimento"), 0, 3);
		grid.add(txtNascimento, 1, 3);
		grid.add(btnAdicionar, 0, 4);
		grid.add(btnPesquisar, 1, 4);

		btnAdicionar.addEventHandler(ActionEvent.ACTION, this);
		btnPesquisar.addEventHandler(ActionEvent.ACTION, this);

		stage.setScene(scn);
		stage.setTitle("Gestão de Alunos");
		stage.show();

	}

	public Aluno boundaryParaAluno() {
		Aluno c = new Aluno();
		c.setId(Long.parseLong(txtId.getText()));
		c.setNome(txtNome.getText());
		c.setRa(txtRa.getText());
		LocalDate localDate = LocalDate.parse(txtNascimento.getText(), formatter);
		c.setNascimento(localDate);
		return c;
	}

	public void alunoParaBoundary(Aluno a) {
		txtId.setText(String.valueOf(a.getId()));
		txtNome.setText(a.getNome());
		txtRa.setText(a.getRa());
		String txtData = a.getNascimento().format(formatter);
		txtNascimento.setText(txtData);
	}

	@Override
	public void handle(ActionEvent e) {
		if (e.getTarget() == btnAdicionar) {
			Aluno a = boundaryParaAluno();
			lista.add(a);
			System.out.printf("A lista agora tem %d Alunos%n", lista.size());
		} else if (e.getTarget() == btnPesquisar) {
			for (Aluno a : lista) {
				if (a.getNome().contains(txtNome.getText())) {
					alunoParaBoundary(a);
				}
			}
		}
	}

	public static void main(String[] args) {
		Application.launch(AlunoBoundary.class, args);
	}
}