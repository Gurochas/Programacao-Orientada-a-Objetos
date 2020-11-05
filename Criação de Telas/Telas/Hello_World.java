package Telas;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Hello_World extends Application {
    @Override
    public void start(Stage stage) throws Exception {
    	Pane painel = new Pane();
        Scene scn = new Scene(painel, 600, 240);
        Label txt = new Label("Hello World");
        painel.getChildren().add(txt);
        stage.setScene(scn);
        stage.setTitle("Hello world");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(Hello_World.class, args);
    }
}