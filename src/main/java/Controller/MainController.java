package Controller;

import Util.DiscoverAmmountLetters;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private Button btn_start;

    @FXML
    private TextField entry;

    @FXML
    private Circle circle2;

    @FXML
    private Circle circle3;

    @FXML
    private Circle circle1;

    @FXML
    private Circle circle6;

    @FXML
    private Circle circle7;

    @FXML
    private Circle circle4;

    @FXML
    private Circle circle5;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    @FXML
    void btn_start_clicked(ActionEvent event) {
        // Recebendo a string inserida pelo usuário
        String entryString = null;
        try {
            entryString = entry.getText();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Descobrindo a quantidade de letras que aparece na string
        DiscoverAmmountLetters discoverAmmountLetters = new DiscoverAmmountLetters();
        System.out.println("X apareceu: " + discoverAmmountLetters.ammountLetters(entryString, 'x'));
        System.out.println("Y apareceu: " + discoverAmmountLetters.ammountLetters(entryString, 'y'));
        System.out.println("B apareceu: " + discoverAmmountLetters.ammountLetters(entryString, 'b'));
    }
}
