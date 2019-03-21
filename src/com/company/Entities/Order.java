package com.company.Entities;

import java.util.Date;

public class Order {
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
        return "Order: " +
                ", \nDate: " + date +
                ", \nCustomer: " + customer.getCustomerName() +", "+customer.getCustomerAddress()+", "+customer.getCustomerTelephone()+
                ", \nSeller: " + seller.getSellerName() +", "+seller.getSellerAddress()+", "+seller.getSellerTelephone()+
                ", \nProduct: "+ product.getProductName() +":; Price: "+ product.getPrice() +
                "; Quantity: " + quantityOrderedProducts +
                "; Sum: " + (quantityOrderedProducts*product.getPrice());
    }
}
