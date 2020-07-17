package com.cuahang.smartphone.login;

import java.io.Serializable;

public class SmartPhone implements Serializable {
    private int id;
    private String productName;
    private String description;
    private String manufacturur;
    private int avatar;
    private int price;
    private int number;
    private int soluong;

    public SmartPhone() {
    }

    public SmartPhone(int id, String productName, String description, String manufacturur, int avatar, int price, int number, int soluong) {
        this.id = id;
        this.productName = productName;
        this.description = description;
        this.manufacturur = manufacturur;
        this.avatar = avatar;
        this.price = price;
        this.number = number;
        this.soluong = soluong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacturur() {
        return manufacturur;
    }

    public void setManufacturur(String manufacturur) {
        this.manufacturur = manufacturur;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public int getSoluong(){
        return soluong;
    }
    public void setSoluong(int soluong){
        this.soluong = soluong;
    }
}