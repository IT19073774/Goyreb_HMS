/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goyreb_hms;

import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.input.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ashvinn Kanagar
 */
public class MainGUIController implements Initializable {
    
    @FXML
    private ImageView profileIcon;

    @FXML
    private Pane profilePanel;
    
    @FXML
    private javafx.scene.control.Button logoutbtn;
    
    @FXML
    private ComboBox admitCombo;
    
    @FXML
    private ComboBox dischargeCombo;
    
    @FXML
    void displayProfilePanel(MouseEvent event) {
        profilePanel.setVisible(true);
    }
    
    @FXML
    void noDisplayProfilePanel(MouseEvent event) {
        profilePanel.setVisible(false);
    }
    
    @FXML
    void logout(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("LoginGUI.fxml"));
        Scene scene = new Scene(root);
        Stage stagePrev = (Stage) logoutbtn.getScene().getWindow();
        // do what you have to do
        stagePrev.close();
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Hospital Management System");
        stage.getIcons().add(new Image("file:C:\\Users\\Ahvinn Kanagar\\Documents\\NetBeansProjects\\Goyreb_HMS\\src\\goyreb_hms\\image\\appicon.png"));
        stage.show();
    }
    
    @FXML
    void billingOnClick(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("BillingGUI.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Hospital Management System");
        stage.getIcons().add(new Image("file:C:\\Users\\Ahvinn Kanagar\\Documents\\NetBeansProjects\\Goyreb_HMS\\src\\goyreb_hms\\image\\appicon.png"));
        stage.show();
    }
    
    @FXML
    void PatientRegOnClick(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Patient_RegistrationGUI.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Hospital Management System");
        stage.getIcons().add(new Image("file:C:\\Users\\Ahvinn Kanagar\\Documents\\NetBeansProjects\\Goyreb_HMS\\src\\goyreb_hms\\image\\appicon.png"));
        stage.show();
    }
    
    @FXML
    void DoctorRegOnClick(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("DoctorGUI.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Hospital Management System");
        stage.getIcons().add(new Image("file:C:\\Users\\Ahvinn Kanagar\\Documents\\NetBeansProjects\\Goyreb_HMS\\src\\goyreb_hms\\image\\appicon.png"));
        stage.show();
    }
    
    @FXML
    void UserRegOnClick(MouseEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("User_RegistrationGUI.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Hospital Management System");
        stage.getIcons().add(new Image("file:C:\\Users\\Ahvinn Kanagar\\Documents\\NetBeansProjects\\Goyreb_HMS\\src\\goyreb_hms\\image\\appicon.png"));
        stage.show();
    }
    
    @FXML
    void WardMasterOnClick(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("ward.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Hospital Management System");
        stage.getIcons().add(new Image("file:C:\\Users\\Ahvinn Kanagar\\Documents\\NetBeansProjects\\Goyreb_HMS\\src\\goyreb_hms\\image\\appicon.png"));
        stage.show();
    }
    
    @FXML
    void NurseMasterOnClick(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Nurse.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Hospital Management System");
        stage.getIcons().add(new Image("file:C:\\Users\\Ahvinn Kanagar\\Documents\\NetBeansProjects\\Goyreb_HMS\\src\\goyreb_hms\\image\\appicon.png"));
        stage.show();
    }
    
    @FXML
    void RoomMasterOnClick(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Room.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Hospital Management System");
        stage.getIcons().add(new Image("file:C:\\Users\\Ahvinn Kanagar\\Documents\\NetBeansProjects\\Goyreb_HMS\\src\\goyreb_hms\\image\\appicon.png"));
        stage.show();
    }
    
    @FXML
    void ServicesOnClick(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("service.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Hospital Management System");
        stage.getIcons().add(new Image("file:C:\\Users\\Ahvinn Kanagar\\Documents\\NetBeansProjects\\Goyreb_HMS\\src\\goyreb_hms\\image\\appicon.png"));
        stage.show();
    }
    
    @FXML
    void AdmitOnClick(ActionEvent event) throws Exception{
        if (admitCombo.getValue().toString() == "Room") {
            Parent root = FXMLLoader.load(getClass().getResource("AdmitRoomGUI.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Hospital Management System");
            stage.getIcons().add(new Image("file:C:\\Users\\Ahvinn Kanagar\\Documents\\NetBeansProjects\\Goyreb_HMS\\src\\goyreb_hms\\image\\appicon.png"));
            stage.show();
        } else if (admitCombo.getValue().toString() == "Ward") {
            Parent root = FXMLLoader.load(getClass().getResource("AdmitWardGUI.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Hospital Management System");
            stage.getIcons().add(new Image("file:C:\\Users\\Ahvinn Kanagar\\Documents\\NetBeansProjects\\Goyreb_HMS\\src\\goyreb_hms\\image\\appicon.png"));
            stage.show();
        }
        
    }
    
    @FXML
    void DischargeOnClick(ActionEvent event) throws Exception{
        if (dischargeCombo.getValue().toString() == "Room") {
            Parent root = FXMLLoader.load(getClass().getResource("PatientDischargeInfoRoom.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Hospital Management System");
            stage.getIcons().add(new Image("file:C:\\Users\\Ahvinn Kanagar\\Documents\\NetBeansProjects\\Goyreb_HMS\\src\\goyreb_hms\\image\\appicon.png"));
            stage.show();
        } else if (dischargeCombo.getValue().toString() == "Ward") {
            Parent root = FXMLLoader.load(getClass().getResource("PatientDischargeInfoWardGUI.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Hospital Management System");
            stage.getIcons().add(new Image("file:C:\\Users\\Ahvinn Kanagar\\Documents\\NetBeansProjects\\Goyreb_HMS\\src\\goyreb_hms\\image\\appicon.png"));
            stage.show();
        }
        
    }
    
    @FXML
    void LoginDetOnClick(MouseEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("LoginDetailsGUI.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Hospital Management System");
        stage.getIcons().add(new Image("file:C:\\Users\\Ahvinn Kanagar\\Documents\\NetBeansProjects\\Goyreb_HMS\\src\\goyreb_hms\\image\\appicon.png"));
        stage.show();
    }
    
    @FXML
    void ChangePWOnClick(MouseEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("ChangePwGUI.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Hospital Management System");
        stage.getIcons().add(new Image("file:C:\\Users\\Ahvinn Kanagar\\Documents\\NetBeansProjects\\Goyreb_HMS\\src\\goyreb_hms\\image\\appicon.png"));
        stage.show();
    }
    
    @FXML
    void ContactOnClick(MouseEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("contact.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Hospital Management System");
        stage.getIcons().add(new Image("file:C:\\Users\\Ahvinn Kanagar\\Documents\\NetBeansProjects\\Goyreb_HMS\\src\\goyreb_hms\\image\\appicon.png"));
        stage.show();
    }
    
    @FXML
    void AboutOnClick(MouseEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("about.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Hospital Management System");
        stage.getIcons().add(new Image("file:C:\\Users\\Ahvinn Kanagar\\Documents\\NetBeansProjects\\Goyreb_HMS\\src\\goyreb_hms\\image\\appicon.png"));
        stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        ObservableList<String> list = FXCollections.observableArrayList("Room","Ward");
        admitCombo.setItems(list);
        dischargeCombo.setItems(list);
        
    }    
    
}
