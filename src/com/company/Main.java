package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	Product meat = new Product("Meat", 350, 2);
    Customer customer = new Customer("Ivan", "Saratov","+7987");
    Seller seller = new Seller("Petr","Saratov", "+987");
    Order order = new Order(meat, customer,seller, 1);
        System.out.println(order);


    }
}
