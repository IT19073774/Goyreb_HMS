/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goyreb_hms;

//import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

/**
 *
 * @author Admin
 */
public class LoginDetailsGUIController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private Pane loginNotifi;
    
    @FXML
    private Button editButton;
    @FXML
    private Button disableButton;
    @FXML
    private Button suspendButton;
    @FXML
    private Button removeButton;
    
    @FXML
    private void enableActions(MouseEvent event){
        editButton.setDisable(false);
        disableButton.setDisable(false);
        suspendButton.setDisable(false);
        removeButton.setDisable(false);
    }
    
    @FXML
    private void removeNewUser(ActionEvent event){
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Please confirm!");
        alert.setHeaderText("Please consider and confirm the removal of the user");
        alert.setContentText("Are you sure, you want to remove this user?");
        alert.showAndWait();
    }
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @FXML
    private void lgNotificationDisplay(MouseEvent event) {
        loginNotifi.setVisible(true);
    }
    
        @FXML
    private void lgNotificationExit(MouseEvent event) {
        loginNotifi.setVisible(false);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    @FXML
    private void close(MouseEvent event){
        System.exit(0);
    }
    
}
