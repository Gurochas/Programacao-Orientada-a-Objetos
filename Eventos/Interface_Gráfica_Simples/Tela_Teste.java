package Interface_Gráfica_Simples;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Tela_Teste extends Application
							implements EventHandler<ActionEvent>{

	@Override
	public void start(Stage stage) throws Exception {
		BorderPane bp = new BorderPane();
		Scene scn = new Scene(bp, 200, 200);
		
		Button btnSair = new Button("Sair");;
		btnSair.setPrefWidth(200);
		
		bp.setBottom(btnSair);
		bp.setLeft(new Label("Ola ... !!!"));
		
		btnSair.addEventHandler(ActionEvent.ANY, this);
		
		stage.setScene(scn);
        stage.setTitle("Janela de Teste");
        stage.show();
	}

	@Override
	public void handle(ActionEvent event) {
		System.exit(0);
	}
	
	public static void main(String[] args) {
		Application.launch(Tela_Teste.class, args);
	}
	

}
