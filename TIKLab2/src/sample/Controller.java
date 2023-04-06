/**
 * Sample Skeleton for 'mainpage.fxml' Controller Class
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
import javafx.stage.Stage;

public class Controller {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="buttonToForm"
    private Button buttonToForm; // Value injected by FXMLLoader

    @FXML
    void btn_ToForm(ActionEvent event) {
        Stage primaryStage = (Stage) buttonToForm.getScene().getWindow();

// создаем новый объект Stage для новой сцены
        Stage newStage = new Stage();

        try {
            // загружаем файл FXML новой сцены
            FXMLLoader loader = new FXMLLoader(getClass().getResource("formOrder.fxml"));
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
        assert buttonToForm != null : "fx:id=\"buttonToForm\" was not injected: check your FXML file 'mainpage.fxml'.";

    }

}
