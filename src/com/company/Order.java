package com.company;

import java.time.LocalDateTime;
import java.util.Date;

public class Order {
    private int orderID;
    private Product product;
    private Customer customer;
    private Seller seller;
    private Date date = new Date();
    private int quantityOrderedProducts;

    public Order(Product product, Customer customer, Seller seller, int quantityOrderedProducts) {
        this.product = product;
        this.customer = customer;
        this.seller = seller;
        this.quantityOrderedProducts = quantityOrderedProducts;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", product=" + product.getProductName() +" "+ product.getPrice() +
                ", customer=" + customer +
                ", seller=" + seller +
                ", date=" + date +
                ", quantityOrderedProducts=" + quantityOrderedProducts +
                '}';
    }
}
