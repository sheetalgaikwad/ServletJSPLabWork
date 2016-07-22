package com.mantiso.model;

/**
 * Created by shgaikwa on 7/21/2016.
 */
public class Product {

    String name;
    String desc;
    int quantity;
    int price;

    public Product() {

    }

    public Product(String name, int price, int quantity, String desc) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.desc = desc;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
