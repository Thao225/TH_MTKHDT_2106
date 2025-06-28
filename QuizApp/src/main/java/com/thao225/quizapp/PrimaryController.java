package com.thao225.quizapp;

import com.thao225.utils.MyAlert;
import com.thao225.utils.MyStage;
import com.thao225.utils.theme.DarkThemeFactory;
import com.thao225.utils.theme.Theme;
import static com.thao225.utils.theme.Theme.DARK;
import com.thao225.utils.theme.ThemeManager;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;


public class PrimaryController implements Initializable{
    @FXML private ComboBox<Theme> cbThemes;
    public void changeTheme(ActionEvent event){
        this.cbThemes.getSelectionModel().getSelectedItem().updateThem(this.cbThemes.getScene());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbThemes.setItems(FXCollections.observableArrayList(Theme.values()));
    }
    
    public void handleQuestionMannagement(ActionEvent event) throws IOException{
        MyStage.getInstance().showStage("question.fxml");
    }
    public void handlePractice(ActionEvent event){
        MyAlert.getInstance().showMsg("Coming soon....");
    }

}
