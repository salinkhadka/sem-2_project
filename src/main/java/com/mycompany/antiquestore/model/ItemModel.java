    package com.mycompany.antiquestore.model;

public class ItemModel {
    private int id;
    private int price;
    private int stock;
    private String itemName;

    public ItemModel() {
    }

    public ItemModel(int id, int price, int stock, String itemName) {
        this.id = id;
        this.price = price;
        this.stock = stock;
        this.itemName = itemName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

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
