package com.luandev.entities;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String name;
    private double price;
    public Product(){}

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void priceTag(){
        System.out.println(toString());
    }

    public String toString() {
        return name +" "+ "$"+ " "+ price;
    }
}