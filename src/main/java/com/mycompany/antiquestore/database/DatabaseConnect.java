/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.antiquestore.database;

import java.sql.Connection;
import java.sql.ResultSet;


/**
 *
 * @author user
 */
public interface DatabaseConnect {
    Connection openConnection();
    void closeConnection(Connection conn);
    ResultSet runQuery (Connection conn,String query);
    int executeUpdate(Connection conn,String query);
}
