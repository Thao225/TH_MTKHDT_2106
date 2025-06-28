/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thao225.utils.theme;

import com.thao225.quizapp.App;
import javafx.scene.Scene;

/**
 *
 * @author admin
 */
public class ThemeManager {
    private static ThemeFactory themeFactory=new DarkThemeFactory();

    /**
     * @param aThemFactory the themFactory to set
     */
    public static void setThemFactory(ThemeFactory ThemFactory) {
        themeFactory = ThemFactory;
    }
    
    public static void applyTheme(Scene scene){
        scene.getRoot().getStylesheets().clear();
        scene.getRoot().getStylesheets().add(themeFactory.getStyleSheet());   
    }
}
