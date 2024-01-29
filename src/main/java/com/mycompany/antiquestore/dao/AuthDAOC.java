/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.antiquestore.dao;

import com.mycompany.antiquestore.view.CurrentUser;
import com.mycompany.antiquestore.database.MySqlConnect;
import com.mycompany.antiquestore.model.LoginPage;
import com.mycompany.antiquestore.model.Registration_Model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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

            System.out.println(e);
            return false;
        }
//        return false;
    }

    public boolean login(LoginPage lp) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
           try{
            PreparedStatement ps= null;
            Connection conn = openConnection();
            
            String sql = "Select * from user where email = ? and password = ?";
            ps = conn.prepareStatement(sql);
            
            ps.setString (1,lp.getEmail());
            ps.setString(2,lp.getPassword());
            
           
            var result = ps.executeQuery();
            
            if(result.next()){
                CurrentUser.id=result.getInt("id");
                return true;
            }
            else {
                return false;
            }
        }catch(Exception e){
            System.out.println(e);

            return false;
        }
//        return false;
    }
    
    
}