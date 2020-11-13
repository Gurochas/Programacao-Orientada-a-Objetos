package Drawing;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class House extends Application{

	@Override
	public void start(Stage stage){
		Pane painel = new Pane();
		Scene scn = new Scene(painel, 400, 400);
		
						         //col  lin  col lin
		Line telhadoEsq = new Line(100, 150, 200, 50);
		Line telhadoDir = new Line(300, 150, 200, 50);
		
		Rectangle retangulo = new Rectangle(100, 150, 200, 200);
		
		retangulo.setFill(Color.WHITE);
		retangulo.setStroke(Color.BLACK);

		painel.getChildren().addAll(telhadoDir, telhadoEsq, retangulo);
		
		stage.setScene(scn);
        stage.setTitle("Casa c:");
        stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(House.class, args);
	}

}
