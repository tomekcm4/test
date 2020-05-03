import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ListaPracownikaController implements Initializable {

    @FXML
    private TextField TextFieldImie;
    @FXML
    private TextField TextFieldNazwisko;
    @FXML
    private TableView<Person> tableView;
    @FXML
    private TableColumn<Person, String> tableColumn1;
    @FXML
    private TableColumn<Person, String> tableColumn2;



    ObservableList<Person> persons = FXCollections.observableArrayList(new Person("TOM", "KOT")
            ,new Person("JAMES", "PAKE"));


    public void addRecord(ActionEvent actionEvent) throws IOException {
    Person person = new Person(TextFieldImie.getText(), TextFieldNazwisko.getText());
    tableView.getItems().add(person);


        TextFieldImie.clear();
        TextFieldNazwisko.clear();
    }

    public void initialize(URL location, ResourceBundle resources) {

        tableColumn1.setCellValueFactory(new PropertyValueFactory<Person, String>("firstName"));
        tableColumn2.setCellValueFactory(new PropertyValueFactory<Person, String>("lastName"));
        tableView.setItems(persons);


        tableView = new TableView<Person>();

        tableView.getColumns().addAll(tableColumn1, tableColumn2);


    }

    public void deleteRecord(ActionEvent actionEvent) {
        ObservableList<Person> personSelected, allPerson;
        allPerson = tableView.getItems();
        personSelected = tableView.getSelectionModel().getSelectedItems();
        personSelected.forEach(allPerson::remove);
    }
}
