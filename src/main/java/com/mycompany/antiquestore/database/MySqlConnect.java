/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.antiquestore.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class MySqlConnect implements DatabaseConnect {

    @Override
    public Connection openConnection() {
                try{
            String username = "root";
            String password = "password";
            String database = "swing34";
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection;
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/"+database,username,password
                );
            if(connection!= null){
                System.out.println("Connection to database");
            }else{
                System.out.println("Connection failed");
            }
            return connection;
        }catch(ClassNotFoundException | SQLException e){
                    System.out.println("dsadssda");
            return null;
        } 
    }

    @Override
    public void closeConnection(Connection conn) {
               try{
            if (conn!= null&& !conn.isClosed()){
                conn.close();
                System.out.println("Connnection Closed");
            }
        }catch(SQLException e){
            System.out.println(e);
        } 
    }

    @Override
    public ResultSet runQuery(Connection conn, String query) {
                try{
            Statement statement =conn.createStatement();
            ResultSet rs= statement.executeQuery(query);
            return rs;
            
        }catch(SQLException e){
            return null;
        }
    }

    @Override
    public int executeUpdate(Connection conn, String query) {
                try{
            Statement statement = conn.createStatement();
            return statement.executeUpdate(query);
        }catch(SQLException e){
            return -1;
        }
        
    
    }
    
}
