/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.antiquestore;
//import com.mycompany.antiquestore.dao.AuthDAOC;
//
//import com.mycompany.antiquestore.model.RegisterPage;
import com.mycompany.antiquestore.view.LoginScreen;
//import com.mycompany.antiquestore.view.RegistrationScreen;

/**
 *
 * @author user
 */
public class AntiqueStore {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        LoginScreen log = new LoginScreen();
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        
        
//        RegistrationScreen rs= new RegistrationScreen();
//        rs.setVisible(true);
        
//        AuthDAOC auth = new AuthDAOC();
//        String email = "test@test.com";
//        String username = "username123";
//        String password = "password";
//        RegisterPage rm = new RegisterPage(
//           email, password, username
//        );
//        
//        boolean result = auth.register(rm);
//        if(result == true){
//            System.out.println("Created user");
//        }else{
//            System.out.println("Error");
//        }
    }
}
