package AulaJavaFX;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class TesteEventosMouse extends Application 
									implements EventHandler<MouseEvent>{
	
    Label lbl = new Label("Texto");
	
    @Override
    public void start(Stage stage) {
        BorderPane border = new BorderPane();
        Scene scn = new Scene(border, 400, 200);
        Button btn = new Button("Me aperte!!!");
        
        border.setTop(lbl);
        border.setBottom(btn);
        
        btn.addEventHandler(MouseEvent.ANY, this);
        
        stage.setScene(scn);
        stage.setTitle("Teste de Eventos");
        stage.show();
        
    }
    
	@Override
	public void handle(MouseEvent a) {
		lbl.setText(a.getEventType().getName());
		System.out.println(a.getEventType().getName());
	}
    
    public static void main(String[] args) {
        Application.launch(TesteEventosMouse.class, args);
    }

}
