/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.antiquestore.dao;


import com.mycompany.antiquestore.database.MySqlConnect;
import com.mycompany.antiquestore.model.Registration_Model;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author user
 */
public class AuthDAOC extends MySqlConnect {

    public boolean register(Registration_Model registerPage){
        try{
            PreparedStatement ps= null;
            Connection conn = openConnection();
            
            String sql = "INSERT INTO users(email,password) VALUES(?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString (1,registerPage.getEmail());
            ps.setString(2,registerPage.getPassword());
//            ps.setString(3,registerPage.getConfirmPassword());
            
            int result = ps.executeUpdate();
           
            if (result == -1){
                return false;
            }else{
                return true;
            }
        }catch(Exception e){
//            System.out.println(e);
            return false;
        }
//        return false;
    }
}