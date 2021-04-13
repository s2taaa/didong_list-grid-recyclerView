package com.example.lab4b2;

public class ElectricThings {
    private String name;
    private int rate;
    private int newPrice;
    private  int peopleRate;
    private int img;
    private int reducePersent;

    public ElectricThings(String name, int rate, int newPrice, int peopleRate, int img, int reducePersent) {
        this.name = name;
        this.rate = rate;
        this.newPrice = newPrice;
        this.peopleRate = peopleRate;
        this.img = img;
        this.reducePersent = reducePersent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(int newPrice) {
        this.newPrice = newPrice;
    }

    public int getPeopleRate() {
        return peopleRate;
    }

    public void setPeopleRate(int peopleRate) {
        this.peopleRate = peopleRate;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getReducePersent() {
        return reducePersent;
    }

    public void setReducePersent(int reducePersent) {
        this.reducePersent = reducePersent;
    }
}
