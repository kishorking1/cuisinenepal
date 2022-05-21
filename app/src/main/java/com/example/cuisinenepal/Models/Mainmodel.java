package com.example.cuisinenepal.Models;

public class Mainmodel {
    int image;
    String name, price, despriction;
    int numberInCart;

    public int getNumberInCart() {
        return numberInCart;
    }

    public Mainmodel(int numberInCart) {
        this.numberInCart = numberInCart;
    }

    public void setNumberInCart(int numberInCart) {
        this.numberInCart = numberInCart;
    }

    public Mainmodel(int image, String name, String price, String despriction) {
        this.image = image;
        this.name = name;
        this.price = price;
        this.despriction = despriction;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDespriction() {
        return despriction;
    }

    public void setDespriction(String despriction) {
        this.despriction = despriction;
    }
}
