package com.mycompany.antiquestore.dao;

import com.mycompany.antiquestore.database.MySqlConnect;
import com.mycompany.antiquestore.model.ItemModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class HomepageDao extends MySqlConnect {

    public ArrayList<ItemModel> getData() throws SQLException {
        PreparedStatement ps = null;
        Connection conn = openConnection(); // Call the instance method using 'this'
        String sql = "Select * from item where Stock!=0";
        ps = conn.prepareStatement(sql);
        var result = ps.executeQuery();
         System.out.println(result);
          
        ArrayList<ItemModel> list = new ArrayList<>();
        while (result.next()) {
                list.add(new ItemModel(result));
        }
        result.close();
        
            
       
        
        
        
        
        closeConnection(conn);

        // Return the ArrayList
        return list;
    }

    // Additional methods specific to HomepageDao can go here
}
