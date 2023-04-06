/**
 * Sample Skeleton for 'formOrder.fxml' Controller Class
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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.appfolder.Client;

public class FormOrderController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="confirmOrder"
    private Button confirmOrder; // Value injected by FXMLLoader

    @FXML // fx:id="nameText"
    private TextField nameText; // Value injected by FXMLLoader

    @FXML // fx:id="numberPhoneText"
    private TextField numberPhoneText; // Value injected by FXMLLoader

    @FXML // fx:id="problemText"
    private TextArea problemText; // Value injected by FXMLLoader

    @FXML // fx:id="surnameText"
    private TextField surnameText; // Value injected by FXMLLoader
    Client client = new Client();


    @FXML
    void btn_confirm(ActionEvent event) {
        String surname = surnameText.getText();
        String name = nameText.getText();
        String phoneNumber = numberPhoneText.getText();
        String problem= problemText.getText();
        client = new Client(surname,name,phoneNumber,problem);

        System.out.println(client.toString());
        Stage primaryStage = (Stage) confirmOrder.getScene().getWindow();

// создаем новый объект Stage для новой сцены
        Stage newStage = new Stage();


        try {
            // загружаем файл FXML новой сцены
            FXMLLoader loader = new FXMLLoader(getClass().getResource("waitingForm.fxml"));
            Parent root = loader.load();

            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("employerOrderForm.fxml"));
            EmployerOrderController employerOrderController = loader1.getController();

            employerOrderController.setData(problemText.getText());
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
        assert confirmOrder != null : "fx:id=\"confirmOrder\" was not injected: check your FXML file 'formOrder.fxml'.";
        assert nameText != null : "fx:id=\"nameText\" was not injected: check your FXML file 'formOrder.fxml'.";
        assert numberPhoneText != null : "fx:id=\"numberPhoneText\" was not injected: check your FXML file 'formOrder.fxml'.";
        assert problemText != null : "fx:id=\"problemText\" was not injected: check your FXML file 'formOrder.fxml'.";
        assert surnameText != null : "fx:id=\"surnameText\" was not injected: check your FXML file 'formOrder.fxml'.";

    }

}
