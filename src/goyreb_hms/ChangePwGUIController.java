/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goyreb_hms;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author thanuripiyaratne
 */
public class ChangePwGUIController implements Initializable {

    @FXML
    private Button btnReset;
    
    
    @FXML
    private void handleDialog (ActionEvent e){
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setHeaderText("Password Changed!!!");
        alert.showAndWait();
        
        
    }
    
    @FXML
    private void handleLink (ActionEvent e){
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setHeaderText("Recovery link has been sent . Please check your email !!!");
        alert.showAndWait();
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
