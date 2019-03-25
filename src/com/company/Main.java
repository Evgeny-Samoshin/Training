package com.company;

import com.company.Entities.Customer;
import com.company.Entities.Order;
import com.company.Entities.Product;
import com.company.Entities.Seller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static java.sql.DriverManager.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//	Product meat = new Product("Meat", 350, 2);
//    Customer customer = new Customer("Ivan", "Saratov","+7987");
//    Seller seller = new Seller("Petr","Saratov", "+987");
//    Order order = new Order(meat, customer,seller, 1);
//        System.out.println(order);


        Class.forName("org.sqlite.JDBC");

        Connection connection = getConnection("jdbc:sqlite:myDb.db");
        System.out.println("Connected");




    }
}
