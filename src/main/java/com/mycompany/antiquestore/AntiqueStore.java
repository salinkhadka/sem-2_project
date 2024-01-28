/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.antiquestore;
//import com.mycompany.antiquestore.dao.AuthDAOC;
//
//import com.mycompany.antiquestore.model.RegisterPage;
import com.mycompany.antiquestore.view.Homepage;
import com.mycompany.antiquestore.view.LoginScreen;
import com.mycompany.antiquestore.view.SalesReport;
import com.mycompany.antiquestore.view.PendingOrders;
import com.mycompany.antiquestore.view.ProductManagement;
import com.mycompany.antiquestore.view.AddItem;
import com.mycompany.antiquestore.view.UpdateItem;

import java.sql.SQLException;
//import com.mycompany.antiquestore.view.RegistrationScreen;
/**
 *
 * @author user
 */
public class AntiqueStore {

    public static void main(String[] args) throws SQLException {
        System.out.println("Hello World!");
//        System.out.println("Hello World!");
//        LoginScreen log = new LoginScreen();
//        log.setVisible(true);
//        log.pack();
//        log.setLocationRelativeTo(null);
        
//        PendingOrder po=new PendingOrder();
//        po.setVisible(true);
//        
//        SalesReport sr=new SalesReport();
//        sr.setVisible(true);
//        
//        PendingOrders obj=new PendingOrders();
//        obj.setVisible(true);
Homepage sr=new Homepage();
sr.setVisible(true);
        
        
    }
}
