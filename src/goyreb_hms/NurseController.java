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
import javafx.scene.control.Button;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Paradox
 */
public class NurseController implements Initializable {

    @FXML
    private TextField nurseID;
    @FXML
    private Button searchbtn;
    @FXML
    private Button newbtn;
    @FXML
    private Button savebtn;
    @FXML
    private Button deletebtn;
    @FXML
    private Button updatebtn;
    @FXML
    private Button getdatabtn;
    @FXML
    private TextField namefeild;
    @FXML
    private TextField Addressfeild;
    @FXML
    private TextField Emailfeild;
    @FXML
    private TextField ContactnoFeild;
    @FXML
    private TextArea QualificationFeild;
    @FXML
    private SplitMenuButton bloodGroup;
    @FXML
    private Button Backbtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backToHome(ActionEvent event) {
    }
    
}
