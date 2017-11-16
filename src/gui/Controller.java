package gui;

import java.net.URL;
import java.util.ResourceBundle;

import domain.Ampellogik;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

class Controller implements Initializable {

    //---------------------------------------------
    // Membervariablen für Steuerelemente
    //---------------------------------------------        
    @FXML
    private Circle circleRot;

    @FXML
    private Circle circleGelb;

    @FXML
    private Circle circleGruen;

    @FXML
    private Button buttonWeiter;

    private String zustand;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //---------------------------------------------
        // Eventhandler
        //---------------------------------------------    
        buttonWeiter.setOnAction(event -> {
            Ampellogik.weiter();

        });

        //---------------------------------------------
        // Start
        //---------------------------------------------
        // Code wird ausgeführt,
        // wenn Fenster und Steuerelemente bereit sind
        zustand = "ROT";
        circleRot.setFill(Color.RED);
    }

    public void rotAn(){
        circleRot.setFill(Color.RED);
    }
    public void rotAus(){
        circleRot.setFill(Color.GRAY);
    }
    public void GelbAn(){
        circleGelb.setFill(Color.YELLOW);
    }
    public void GelbAus(){
        circleGelb.setFill(Color.GRAY);
    }
    public void GruenAn(){
        circleGruen.setFill(Color.GREEN);
    }
    public void GruenAus(){
        circleGruen.setFill(Color.GRAY);
    }
}
