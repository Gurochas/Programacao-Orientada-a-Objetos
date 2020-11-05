package AulaJavaFX;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class TesteEventosSolucao extends Application 
									implements EventHandler<ActionEvent>{
	
    Label lbl = new Label("Texto");
	
    @Override
    public void start(Stage stage) {
        BorderPane border = new BorderPane();
        Scene scn = new Scene(border, 400, 200);
        Button btn = new Button("Me aperte!!!");
  
        border.setTop(lbl);
        border.setBottom(btn);

        btn.addEventHandler(ActionEvent.ANY, this);
        
        stage.setScene(scn);
        stage.setTitle("Teste de Eventos");
        stage.show();
        
    }
    
	@Override
	public void handle(ActionEvent arg0) {
		lbl.setText("Botão apertado");
	}
    
    public static void main(String[] args) {
        Application.launch(TesteEventosSolucao.class, args);
    }

}
