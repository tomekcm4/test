import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;


public class MenuController {

    @FXML
    private Button otworzListePracownikowButton;


    public void otworzListePracownikow(ActionEvent actionEvent) throws IOException {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(this.getClass().getResource("/ListaPracownika.fxml"));
        Pane pane = loader.load();

        Scene scene = new Scene(pane);
        Stage Stage1 = new Stage();
        Stage1.setScene(scene);
        Stage1.setTitle("Program Beta");
        Stage1.show();
        Stage1.setX(1000);
        Stage1.setY(0);
    }
}
