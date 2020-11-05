package AulaJavaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


class Codigo implements EventHandler<ActionEvent>{

	private Label label;
	
    @Override
    public void handle(ActionEvent arg0) {
        System.out.println("Bot�o apertado");
        label.setText("Bot�o apertado");
    }

	public void setLabel(Label label) {
		this.label = label;
	}
    
    
}

public class TesteEventos extends Application{
    @Override
    public void start(Stage stage) {
        BorderPane border = new BorderPane();
        Scene scn = new Scene(border, 400, 200);
        Label lbl = new Label("Texto");
        Button btn = new Button("Me aperte!!!");
        
        //Codigo cod = new Codigo();
        //cod.setLabel(lbl);        
        
        btn.addEventHandler(ActionEvent.ANY, new EventHandler<ActionEvent>(){
			
        	@Override
			public void handle(ActionEvent a) {
        		lbl.setText("Bot�o apertado");
			} 
        	
        });
        
        btn.addEventHandler(ActionEvent.ANY, (a) -> {
        		lbl.setText("Bot�o apertado");
        });
        
        btn.setOnAction((a) -> lbl.setText("Bot�o apertado"));
        
        
        
        border.setTop(lbl);
        border.setBottom(btn);
        
        stage.setScene(scn);
        stage.setTitle("Teste de Eventos");
        stage.show();
        
    }
    
    public static void main(String[] args) {
        Application.launch(TesteEventos.class, args);
    }
}
