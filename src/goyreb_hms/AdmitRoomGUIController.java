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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

/**
 *
 * @author Admin
 */
public class AdmitRoomGUIController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private ComboBox comb;
    
    @FXML
    private Label Lb1;
    @FXML
    private Label Lb1_1;
    @FXML
    private Label Lb2;
    @FXML
    private TextField Lb2_1;
    @FXML
    private Label Lb3;
    @FXML
    private Label Lb3_1;
    @FXML
    private Label Lb4;
    @FXML
    private Label Lb4_1;
    @FXML
    private Label Lb5;
    @FXML
    private Label Lb5_1;
    
    @FXML
    private Label R_time;
    @FXML
    private ImageView QR_Code;
    
    @FXML
    private Pane notification;
    
    @FXML
    private Pane addNewPatients;
    
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
    private void showAddNew(MouseEvent event){
        addNewPatients.setVisible(true);
    }
    @FXML
    private void hideAddNew(MouseEvent event){
        addNewPatients.setVisible(false);
    }
    @FXML
    private void keepDisplay(MouseEvent event){
        addNewPatients.setVisible(true);
    }
    @FXML
    private void exitDisplay(MouseEvent event){
        addNewPatients.setVisible(false);
    }
     
    
    @FXML
    private void showNotification(MouseEvent event){
        notification.setVisible(true);
    }
    @FXML
    private void hideNotification(MouseEvent event){
        notification.setVisible(false);
    }
    
    
    @FXML
    private void getRoomInfo(ActionEvent event){
        Lb1.setVisible(true);
         Lb1_1.setVisible(true);
          Lb2.setVisible(true);
           Lb2_1.setVisible(true);
            Lb3.setVisible(true);
             Lb3_1.setVisible(true);
              Lb4.setVisible(true);
               Lb4_1.setVisible(true);
                Lb5.setVisible(true);
                 Lb5_1.setVisible(true);
            
    }
    
    @FXML
    private void getBed(ActionEvent event){
        R_time.setVisible(true);
        QR_Code.setVisible(true);
            
    }
    
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
     @FXML
    private void discardInfo(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Please Confirm");
        alert.setHeaderText("Please consider before discarding!");
        alert.setContentText("Do you wish to discard this ward administration information ? ");
        alert.showAndWait();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        ObservableList<String> list = FXCollections.observableArrayList("Premium Twin Sharing Room","Premium Deluxe Room", 
                                        "Deluxe Room", "Suite");
        comb.setItems(list);
    }    
    
}
