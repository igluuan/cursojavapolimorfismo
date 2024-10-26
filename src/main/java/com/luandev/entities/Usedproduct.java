package com.luandev.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Usedproduct extends Product {
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date manufactureDate;

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

    @Override
    public void priceTag() {
        System.out.println(toString() + " " + "(Manufacture date: " + sdf.format(getManufactureDate()) + ")");
    }

    @Override
    public String toString() {
        return super.getName() + " (used)" + " " + "$" + super.getPrice();
    }
}