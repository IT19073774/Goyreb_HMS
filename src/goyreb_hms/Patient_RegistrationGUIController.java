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
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

/**
 *
 * @author Thushan
 */
public class Patient_RegistrationGUIController implements Initializable{
    
    
        @FXML
    private ComboBox Gender;
    @FXML
    private ComboBox BloodGroup;
    @FXML
    private ComboBox Gender2;
    @FXML
    private ComboBox BloodGroup2;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
                ObservableList<String> list = FXCollections.observableArrayList("Male","Female"); 
        Gender.setItems(list);
        ObservableList<String> Bglist = FXCollections.observableArrayList("A","A-","B","B-","AB","AB-","O","O-"); 
        BloodGroup.setItems(Bglist);
         ObservableList<String> list1 = FXCollections.observableArrayList("Male","Female"); 
        Gender2.setItems(list1);
        ObservableList<String> Bglist1 = FXCollections.observableArrayList("A","A-","B","B-","AB","AB-","O","O-"); 
        BloodGroup2.setItems(Bglist1); //To change body of generated methods, choose Tools | Templates.
    }
    
}
