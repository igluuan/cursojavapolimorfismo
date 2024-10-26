package com.luandev.entities;

public class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct(String name, double price, double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice() {
        return getPrice() + customsFee;
    }

    @Override
    public void priceTag(){
        System.out.println(toString() + " (Customs fee: " + customsFee + ")");
    }

    @Override
    public String toString(){
        return getName()+ " " + "$" + " " + (totalPrice());
    }
}
