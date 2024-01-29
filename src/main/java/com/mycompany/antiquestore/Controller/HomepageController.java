/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.antiquestore.controller;

import com.mycompany.antiquestore.dao.HomepageDao;
import com.mycompany.antiquestore.model.ItemModel;
import java.awt.List;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author acer
 */
public class HomepageController {
    final HomepageDao hp = new HomepageDao();
    public ArrayList<ItemModel> ItemList = new ArrayList<>();
    
   public HomepageController() throws SQLException{
       ItemList = hp.getData();
    }
}