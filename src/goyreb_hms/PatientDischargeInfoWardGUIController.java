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
//import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
//import javafx.scene.control.Label;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;

/**
 *
 * @author thanuripiyaratne
 */
public class PatientDischargeInfoWardGUIController implements Initializable {
    

    ObservableList list= FXCollections.observableArrayList("Surgical Ward","Medical Ward","Gynecology","Pediatric","Other");
    
    
    @FXML
    private ChoiceBox WardType;
    @FXML
    private ComboBox<?> Wardtypebox;
    
        @FXML
    private void handleDialog (ActionEvent e){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("All details Saved Successfully");
        alert.showAndWait();
        
        
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
  
        
        WardType.setValue("choose");
        WardType.setItems(list);
    
    }
}
