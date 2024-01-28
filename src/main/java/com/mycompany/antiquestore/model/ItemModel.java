    package com.mycompany.antiquestore.model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ItemModel {
    public int id;
    public int price;
    public int stock;
    public String itemName;

    public ItemModel(){
        
    }

    public ItemModel(int id, int price, int stock, String itemName) {
        this.id = id;
        this.price = price;
        this.stock = stock;
        this.itemName = itemName;
    }

    public ItemModel(ResultSet result) throws SQLException {
        this.id=result.getInt("ID");
        this.price=result.getInt("price");
        this.stock=result.getInt("Stock");
        this.itemName=result.getString("ItemName");
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

   

    public void setId(int id) {
        this.id = id;
    }

//    public int getPrice() {
//        return price;
//    }

    public void setPrice(int price) {
        this.price = price;
    }

//    public int getStock() {
//        return stock;
//    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}

