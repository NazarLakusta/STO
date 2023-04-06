/**
 * Sample Skeleton for 'waitingForm.fxml' Controller Class
 */

package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class WaitingController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="employerForm"
    private Button employerForm; // Value injected by FXMLLoader

    private ParentController parentController;

    @FXML // fx:id="testlabel"
    private Label testlabel; // Value injected by FXMLLoader



    private String data;
    public void setData(String data){
        this.data=data;
    }

    public String getData(){
        return this.data;
    }
    @FXML
    void btn_employer(ActionEvent event) {
        Stage newStage = new Stage();
        Stage primaryStage = (Stage) employerForm.getScene().getWindow();
        try {
            // загружаем файл FXML новой сцены
            FXMLLoader loader = new FXMLLoader(getClass().getResource("employerOrderForm.fxml"));
            Parent root = loader.load();


            // создаем новую сцену
            Scene newScene = new Scene(root);

            // устанавливаем новую сцену в объект Stage
            newStage.setScene(newScene);

            // отображаем новую сцену
            newStage.show();

            // закрываем главную сцену
            primaryStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert employerForm != null : "fx:id=\"employerForm\" was not injected: check your FXML file 'waitingForm.fxml'.";
        assert testlabel != null : "fx:id=\"testlabel\" was not injected: check your FXML file 'waitingForm.fxml'.";

    }

}
