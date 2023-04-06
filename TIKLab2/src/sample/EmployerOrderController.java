/**
 * Sample Skeleton for 'employerOrderForm.fxml' Controller Class
 */

package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class EmployerOrderController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="problemFromClient"
    private Label problemFromClient; // Value injected by FXMLLoader


    private String data;


    public void setData(String data) {
        this.data = data;
    }
    @FXML
    void btn_acceptProblem(ActionEvent event) {
        System.out.println("nazar"+this.data);
    }

    @FXML
        // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert problemFromClient != null : "fx:id=\"problemFromClient\" was not injected: check your FXML file 'employerOrderForm.fxml'.";

    }

}
