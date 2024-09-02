package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainController {

    @FXML
    private Button button;

    @FXML
    void toA(ActionEvent event) throws IOException {
    	// A 화면으로 이동
    	Main.setRoot("A");
    }

}







