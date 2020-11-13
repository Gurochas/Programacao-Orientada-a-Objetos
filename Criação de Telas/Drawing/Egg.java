package Drawing;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class Egg extends Application{

	@Override
	public void start(Stage stage){
		Pane painel = new Pane();
		Scene scn = new Scene(painel, 600, 400);
	
		for(int i = 300; i > 0; i-=6) {
			painel.getChildren().add(gerarElipse(i, 200));
			if(i <= 200) {
				painel.getChildren().add(gerarElipse(300, i));
			}
		}
			
		stage.setScene(scn);
        stage.setTitle("Agenda de Contatos");
        stage.show();
	}
	
	private Ellipse gerarElipse(int x, int y) {
		Ellipse e = new Ellipse(300, 200, x, y);
		e.setFill(Color.TRANSPARENT);
		e.setStroke(Color.BLACK);
		return e;
	}
	
	public static void main(String[] args) {
		Application.launch(Egg.class, args);
	}

}
