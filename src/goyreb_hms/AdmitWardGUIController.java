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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

/**
 *
 * @author Admin
 */
public class AdmitWardGUIController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private Label timeStamp;
    
    @FXML
    private ImageView qrCodeGen;
    
    @FXML
    private ComboBox comb;
    
    @FXML
    private Pane hiddenPane_Notification;
    
    @FXML
    private Pane addPatientPane;
    
    @FXML
    private Button discardButton;
    
   // @FXML
   // private Button getBedAction;
    @FXML
    private Pane savePane;
    
    @FXML
    private void successSaving(ActionEvent event){
        savePane.setVisible(true);
    }
    
    @FXML
    private void okButton(ActionEvent event){
        savePane.setVisible(false);
    }
    
    @FXML
    private void getBedAction(ActionEvent event){
        timeStamp.setVisible(true);
        qrCodeGen.setVisible(true);
    }
    
    @FXML
    private void displayNotification(MouseEvent event){
        hiddenPane_Notification.setVisible(true);
    }
    
    @FXML
    private void hideNotification(MouseEvent event){
        hiddenPane_Notification.setVisible(false);
    }
    
    @FXML
    private void dispalyAddPane(MouseEvent event){
        addPatientPane.setVisible(true);
    }
    
    @FXML
    private void exitAddPane(MouseEvent event){
        addPatientPane.setVisible(false);
    }
    
     @FXML
    private void keepDisplaying(MouseEvent event){
        addPatientPane.setVisible(true);
    }
    
     @FXML
    private void exitDisplaying(MouseEvent event){
        addPatientPane.setVisible(false);
    }
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @FXML
    private void confirmDiscard(ActionEvent event) {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Please Confirm");
        alert.setHeaderText("Please consider before discarding!");
        alert.setContentText("Do you wish to discard this ward administration information ? ");
        alert.showAndWait();
    }
   
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        ObservableList<String> list = FXCollections.observableArrayList("Intensive Care Unit (ICU)","Pediatrics", "Maternity", "Geriatrics", "Psychiatric", "Frossad", "Victoria",
                                        "Kenalpha", "De Soloman", "Merlin", "Benadics", "Mc Wilson");
        comb.setItems(list);
    }    
    
}
