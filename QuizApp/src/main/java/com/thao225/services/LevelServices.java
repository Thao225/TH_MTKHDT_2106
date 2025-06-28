/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thao225.services;

import com.thao225.pojo.Level;
import com.thao225.utils.JdbcConnector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class LevelServices {
     public List<Level> getLevel() throws SQLException{
        Connection conn=JdbcConnector.getInstance().connect();
        Statement stm =conn.createStatement();
        ResultSet rs= stm.executeQuery("SELECT * FROM category");
            
        List<Level> levels=new ArrayList<>();
        while(rs.next()){
            int id=rs.getInt("id");
            String name=rs.getString("name");
            String note=rs.getString("note");
                
            Level c= new Level(id,name,note);
            levels.add(c);
        }
        return levels;  
    }
}
