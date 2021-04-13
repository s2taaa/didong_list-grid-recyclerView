package com.example.lab4b;

public class Goods {
    private String name;
    private String shopName;
    private int img;

    public Goods(String name, String shopName, int img) {
        this.name = name;
        this.shopName = shopName;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
