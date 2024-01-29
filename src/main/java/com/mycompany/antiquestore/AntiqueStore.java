/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.antiquestore;
//import com.mycompany.antiquestore.dao.AuthDAOC;
//
//import com.mycompany.antiquestore.model.RegisterPage;
import com.mycompany.antiquestore.dao.AuthDAOC;
import com.mycompany.antiquestore.model.Registration_Model;
import com.mycompany.antiquestore.view.Login_Page;
//import com.mycompany.antiquestore.view.RegistrationScreen;

/**
 *
 * @author user
 */
public class AntiqueStore {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Login_Page log = new Login_Page();
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        
        AuthDAOC auth = new AuthDAOC();
        String username = "username";
        String password = "password";
        Registration_Model rm = new Registration_Model(
            password,username
        );
        boolean result = auth.register(rm);
        if(result == true){
            System.out.println("Created user");
        }else{
            System.out.println("Error");
        }
        
    }
}
