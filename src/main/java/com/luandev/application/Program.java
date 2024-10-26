package com.luandev.application;

import com.luandev.entities.ImportedProduct;
import com.luandev.entities.Product;
import com.luandev.entities.Usedproduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products:");
        int n = sc.nextInt();

        List<Product> products = new ArrayList<Product>();

        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i + 1) + ":");
            System.out.print("Common, used or imported (c/u/i)?");
            char type = sc.next().charAt(0);
            if (type == 'c') {
                System.out.print("Enter product name: ");
                String name = sc.next();
                System.out.print("Enter product price: ");
                double price = sc.nextDouble();
                Product product = new Product(name, price);
                products.add(product);
            } else if (type == 'u') {
                System.out.print("Enter product name: ");
                String name = sc.next();
                System.out.print("Enter product price: ");
                double price = sc.nextDouble();
                System.out.print("Enter manufacture date (dd/MM/yyyy): ");
                Date manufactureDate = sdf.parse(sc.next());
                Product usedproduct = new Usedproduct(name, price, manufactureDate);
                products.add(usedproduct);
            } else if (type == 'i') {
                System.out.print("Enter product name: ");
                String name = sc.next();
                System.out.print("Enter product price: ");
                double price = sc.nextDouble();
                System.out.print("Enter customs fee: ");
                double customsFee = sc.nextDouble();
                Product importedProduct = new ImportedProduct(name, price, customsFee);
                products.add(importedProduct);
            } else{
                System.out.print("Invalid product type. Please try again.");
            }
        }

        System.out.println("\nPRICE TAGS:");
        for (Product product : products){
            product.priceTag();
        }
        sc.close();
    }
}
