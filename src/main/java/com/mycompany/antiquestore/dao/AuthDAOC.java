/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.antiquestore.dao;


import com.mycompany.antiquestore.database.MySqlConnect;
import com.mycompany.antiquestore.model.LoginPage;
import com.mycompany.antiquestore.model.RegisterPage;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author user
 */
public class AuthDAOC extends MySqlConnect {

    /**
     *
     * @param registerPage
     * @return
     */
    public boolean register(RegisterPage registerPage){
        try{
            PreparedStatement ps= null;
            Connection conn = openConnection();
            
            String sql = "INSERT INTO users(username,password,email) VALUES(?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString (1,registerPage.getUsername());
            ps.setString(2,registerPage.getPassword());
            ps.setString(3,registerPage.getEmail());
            
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
            
            String sql = "Select * from users where email = ? and password = ?";
            ps = conn.prepareStatement(sql);
            ps.setString (1,lp.getEmail());
            ps.setString(2,lp.getPassword());
           
            var result = ps.executeQuery();
               System.out.println(result);
            if(result.next()){
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