/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.antiquestore.model;

/**
 *
 * @author user
 */
public class Registration_Model {
    private String email;
    private String password;

   
    public Registration_Model(String email, String password){
        this.email = email;
        this.password=password;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPassword(){
        return this.password;
    }
}
