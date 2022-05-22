package Dao;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import view.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author NGUYEN DUC CUONG
 */
public class DBConnection {
    public static Connection getConnection(){
        Connection connection = null;
        try {  
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            String url = "jdbc:sqlserver://localhost:1433; databaseName=JavaSwing";
//            String user = "sa";
//            String pass = "cuong123";
            final String url = "jdbc:sqlserver://localhost:1433;databaseName=QuanLiDsSinhVien";
            final String user = "sa";
            final String pass = "123";
            connection = DriverManager.getConnection(url, user, pass);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return connection;
    }
    
    
    public static void closeConnection(Connection con){
        if(con != null){
            try {
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    
}
