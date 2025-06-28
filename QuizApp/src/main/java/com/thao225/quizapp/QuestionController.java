/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.thao225.quizapp;

import com.thao225.pojo.Category;
import com.thao225.pojo.Level;
import com.thao225.services.CategoryServices;
import com.thao225.services.LevelServices;
import com.thao225.utils.JdbcConnector;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author admin
 */
public class QuestionController implements Initializable {
    @FXML private ComboBox<Category> cbCates;    
    @FXML private ComboBox<Level> cbLevels;

    private static final CategoryServices cateServices=new CategoryServices();
    private static final LevelServices levelServices=new LevelServices();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            this.cbCates.setItems(FXCollections.observableList(cateServices.getCase()));
            this.cbLevels.setItems(FXCollections.observableList(levelServices.getLevel()));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }    
    
}
