/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Asel Pathirawasam
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////// Nurse Interface //////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @FXML
    private TextField Emailfeild;
    @FXML
    private Button updatebtn;
    @FXML
    private Button getdatabtn;
    @FXML
    private Button newbtn;
    @FXML
    private TextField ContactnoFeild;
    @FXML
    private TextField nurseID;
    @FXML
    private Button searchbtn;
    @FXML
    private TextField Addressfeild;
    @FXML
    private TextArea QualificationFeild;
    @FXML
    private Button deletebtn;
    @FXML
    private TextField namefeild;
    @FXML
    private Button Backbtn;
    @FXML
    private Button savebtn;
    @FXML
    private SplitMenuButton bloodGroup ;
    
    
  
    
    @FXML
    void backToHome(ActionEvent event) throws IOException {
        Stage stage =  (Stage) Backbtn.getScene().getWindow();// getting the current open window using button
        stage.close();// closing current window
//        Stage primeryStage = new Stage();//new stage obj
//        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));// getting parent object and givig it what to open(openning file name)
//        primeryStage.setTitle("Home");
//        primeryStage.setScene(new Scene(root,600,400));
//        primeryStage.show();// showing the new window

    }
        
    @FXML
    void selectBloodGroup(ActionEvent event) {

        bloodGroup = new SplitMenuButton();
        bloodGroup.setText("Shutdown");
        bloodGroup.getItems().addAll(new MenuItem("Logout"), new MenuItem("Sleep"));
    }
    
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////    Home Interface //////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    @FXML
    private Button n_btn;

    

    @FXML
    private Button r_btn;

    @FXML
    private Button w_btn;

    @FXML
    void openNurse(ActionEvent event) throws IOException {
        Stage stage =  (Stage) n_btn.getScene().getWindow();// getting the current open window using button
        Stage primeryStage = new Stage();//new stage obj
        Parent root = FXMLLoader.load(getClass().getResource("Nurse.fxml"));// getting parent object and givig it what to open(openning file name)
        primeryStage.setTitle("Nurse Interace");
        primeryStage.setScene(new Scene(root,863,800));
        primeryStage.show();// showing the new window

    }

    @FXML
    void openRoom(ActionEvent event) throws IOException {
         Stage stage =  (Stage) r_btn.getScene().getWindow();// getting the current open window using button
        Stage primeryStage = new Stage();//new stage obj
        Parent root = FXMLLoader.load(getClass().getResource("Room.fxml"));// getting parent object and givig it what to open(openning file name)
        primeryStage.setTitle("Room");
        primeryStage.setScene(new Scene(root,850,850));
        primeryStage.show();// showing the new window

    }

    @FXML
    void openWard(ActionEvent event) throws IOException {
        Stage stage =  (Stage) w_btn.getScene().getWindow();// getting the current open window using button
        Stage primeryStage = new Stage();//new stage obj
        Parent root = FXMLLoader.load(getClass().getResource("ward.fxml"));// getting parent object and givig it what to open(openning file name)
        primeryStage.setTitle("Ward");
        primeryStage.setScene(new Scene(root,850,850));
        primeryStage.show();// showing the new window

    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////    Room Interface //////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    @FXML
    private Button Room_Back_btn;

    @FXML
    void Room_Back(ActionEvent event) {
        Stage stage =  (Stage) Room_Back_btn.getScene().getWindow();// getting the current open window using button
        stage.close();// closing current window

    }
    
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////    ward Interface //////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
    
    @FXML
    private Button Ward_Back_btn;

    @FXML
    void Ward_Back(ActionEvent event) {
        Stage stage =  (Stage) Ward_Back_btn.getScene().getWindow();// getting the current open window using button
        stage.close();// closing current window
    }
}
