package com.luandev.application;

import com.luandev.entities.ImportedProduct;
import com.luandev.entities.Product;


public class Program {
    public static void main(String[] args) {
        Product p = new Product("Tablet", 280.00);
        System.out.println(p);
        ImportedProduct ip = new ImportedProduct("Tablet", 260.00, 20.00);
        System.out.println(ip);
    }
}
