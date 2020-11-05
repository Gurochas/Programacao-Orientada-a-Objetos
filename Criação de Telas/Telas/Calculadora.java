package Telas;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calculadora extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		
		String [] nomes = {"1","2","3","+",
						   "4","5","6","-",
						   "7","8","9","*",
						   ".","0","=","/"};
		
		BorderPane bp = new BorderPane();
		Scene scn = new Scene(bp, 200, 180);
		
		FlowPane paneDisplay = new FlowPane();
		paneDisplay.setHgap(8);
		bp.setTop(paneDisplay);
		
		GridPane paneBotoes = new GridPane();
		bp.setCenter(paneBotoes);
		
		paneBotoes.setHgap(5);
		paneBotoes.setVgap(5);
		ColumnConstraints col1 = new ColumnConstraints();
		col1.setPercentWidth(25);
		col1.setHalignment(HPos.CENTER);
		paneBotoes.getColumnConstraints().addAll(col1, col1, col1, col1);
		
		for (int i = 0; i < 16; i++) {
			Button btn = new Button(nomes[i]);
			btn.setPrefSize(40, 30);
			int lin = i / 4;
			int col = i % 4;
			paneBotoes.add(btn, col, lin);
		}
		
		TextField txtResult = new TextField("0");
		Button btnCE = new Button("CE");
		btnCE.setPrefSize(40, 30);;
		paneDisplay.getChildren().addAll(txtResult, btnCE);
		
		stage.setScene(scn);
		stage.setTitle("Calculadora");
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(Calculadora.class, args);
	}

}
