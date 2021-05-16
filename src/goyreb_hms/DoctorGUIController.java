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
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author Thushan
 */
public class DoctorGUIController implements Initializable {

    private ComboBox Gender;
    private ComboBox BloodGroup;
    private ComboBox Gender1;
    private ComboBox BloodGroup1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> list = FXCollections.observableArrayList("Male","Female"); 
        Gender.setItems(list);
        ObservableList<String> Bglist = FXCollections.observableArrayList("A","A-","B","B-","AB","AB-","O","O-"); 
        BloodGroup.setItems(Bglist);
         ObservableList<String> list1 = FXCollections.observableArrayList("Male","Female"); 
        Gender1.setItems(list1);
        ObservableList<String> Bglist1 = FXCollections.observableArrayList("A","A-","B","B-","AB","AB-","O","O-"); 
        BloodGroup1.setItems(Bglist1);
    }    
    
}
