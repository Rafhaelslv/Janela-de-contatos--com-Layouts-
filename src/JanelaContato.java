import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class JanelaContato extends Application {
    public void start(Stage primaryStage){
        primaryStage.setTitle("Agenda de Contatos");

        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        Button btnSalvar = new Button("Salvar");
        Button btnPesquisar = new Button("Pesquisar");
        Label lblId = new Label("Id: ");
        Label lblNome = new Label("Nome: ");
        Label lblTelefone = new Label("Telefone: ");
        TextField txtId = new TextField();
        TextField txtNome = new TextField();
        TextField txtTelefone = new TextField();

        gridPane.add(btnSalvar, 1, 5);
        gridPane.add(btnPesquisar, 2, 5);
        gridPane.add(lblId, 0, 0);
        gridPane.add(lblNome, 0, 1);
        gridPane.add(lblTelefone, 0, 2);
        gridPane.add(txtId, 1, 0);
        gridPane.add(txtNome, 1, 1);
        gridPane.add(txtTelefone, 1, 2);

        Scene scene = new Scene(gridPane, 350, 180);

        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}