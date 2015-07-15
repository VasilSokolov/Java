/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 123
 */
public class DBConnection {

    private Connection DBConnection;

    public Connection connect(){    
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connection success");
        }catch(ClassNotFoundException cnfe){
                System.out.println("Connection Fail" + cnfe);
        }
        String url = "jdbc:mysql://localhost:3306/javaapp";
        try {
            DBConnection = DriverManager.getConnection(url, "root", "");
            System.out.println("Database Connected");
        } catch (SQLException ee) {
            System.out.println("No database " + ee);
        }
        return DBConnection;
    }
}
