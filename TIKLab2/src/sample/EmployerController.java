/**
 * Sample Skeleton for 'employerForm.fxml' Controller Class
 */

package sample;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class EmployerController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="problemClient"
    private TextArea problemClient; // Value injected by FXMLLoader

    @FXML // fx:id="problemFromClient"
    private Label problemFromClient; // Value injected by FXMLLoader




    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {


        assert problemClient != null : "fx:id=\"problemClient\" was not injected: check your FXML file 'employerForm.fxml'.";
        assert problemFromClient != null : "fx:id=\"problemFromClient\" was not injected: check your FXML file 'employerForm.fxml'.";


    }


}
