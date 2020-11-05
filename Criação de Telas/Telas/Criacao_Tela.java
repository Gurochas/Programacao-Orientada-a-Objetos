package Telas;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Criacao_Tela extends Application {
    @Override
    public void start(Stage stage) throws Exception {
    	Pane painel = new Pane();
        Scene scn = new Scene(painel, 650, 240);
        Label number = new Label("Entre com o número de telefone:");
        number.relocate(10, 10);
        TextField txtNumber = new TextField();
        txtNumber.setMinWidth(400);
        txtNumber.relocate(200, 10);
        Label name = new Label("Entre com seu nome:");
        name.relocate(10, 50);
        TextField txtName = new TextField();
        txtName.setMinWidth(400);
        txtName.relocate(200, 50);
        Button ok = new Button("Ok");
        ok.relocate(10, 80);
        Button cancel = new Button("Cancel");
        cancel.relocate(50, 80);
        painel.getChildren().addAll(number, txtNumber, name, txtName,
        		ok, cancel);
        stage.setScene(scn);
        stage.setTitle("Agenda de Contatos");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(Criacao_Tela.class, args);
    }
}