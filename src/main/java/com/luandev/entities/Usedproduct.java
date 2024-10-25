package com.luandev.entities;

import java.util.Date;

public class Usedproduct extends Product {
    private Date manufactureDate;

    public Usedproduct(String name, Date manufactureDate) {
        super(name);
        this.manufactureDate = manufactureDate;
    }

    public Usedproduct(String name, double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {

        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

}