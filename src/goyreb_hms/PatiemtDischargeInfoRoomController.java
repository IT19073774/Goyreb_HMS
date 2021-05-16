/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goyreb_hms;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

/**
 *
 * @author thanuripiyaratne
 */
public class PatiemtDischargeInfoRoomController implements Initializable {
    
    ObservableList list= FXCollections.observableArrayList("AC Room","Non-AC Room");

    
   
    
    @FXML
    private ChoiceBox roomType;

       @FXML
    private void handleDialog (ActionEvent e){
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setHeaderText("All Details Saved Successfully");
        alert.showAndWait();
        
        
    }
  
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        roomType.setValue("choose");
        roomType.setItems(list);
       
   
    }    

   

    
}
