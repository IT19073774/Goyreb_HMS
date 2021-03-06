/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goyreb_hms;

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
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ashvinn Kanagar
 */
public class LoginGUIController implements Initializable {
    
    @FXML
    public Button loginBtn;
    
    @FXML
    public void login(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MainGUI.fxml"));
        Scene scene = new Scene(root);
        Stage stagePrev = (Stage) loginBtn.getScene().getWindow();
        // do what you have to do
        stagePrev.close();
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Hospital Management System");
        stage.getIcons().add(new Image("file:C:\\Users\\Ahvinn Kanagar\\Documents\\NetBeansProjects\\Goyreb_HMS\\src\\goyreb_hms\\image\\appicon.png"));
        stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
