/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.pidev.persistance.dao;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class DataSource {

 
    
    private String url = "jdbc:mysql://localhost:3306/freelance";
    private String user = "root";
    private String password = "";
    private Connection connection = null;
    
     private static DataSource instance;  
    
    
    private  DataSource() {  
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DataSource.class.getName()).log(Level.SEVERE, null, ex);
            }
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("connection established");
        } catch (SQLException ex) {
            Logger.getLogger(DataSource.class.getName()).log(Level.SEVERE, null, ex);
        }
             
    }

    public static DataSource getInstance() {
        if(instance==null){
            instance = new DataSource();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
