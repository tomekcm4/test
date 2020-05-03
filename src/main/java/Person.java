import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Person {

    private SimpleStringProperty firstName;
    private SimpleStringProperty lastName;


    public Person(String firstName, String lastName) {
        this.firstName = new SimpleStringProperty(firstName);
        this.firstName = new SimpleStringProperty(lastName);
    }

    public String getFirstName() {
        return firstName.get();
    }


    public String getLastName() {
        return lastName.get();
    }


}
