package com.company.Entities;

public class Customer {
    private String customerName;
    private String customerAddress;
    private String customerTelephone;

    public Customer() {
    }

    public Customer(String customerName, String customerAddress, String customerTelephone) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerTelephone = customerTelephone;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerTelephone() {
        return customerTelephone;
    }

    public void setCustomerTelephone(String customerTelephone) {
        this.customerTelephone = customerTelephone;
    }

    @Override
    public String toString() {
        return "Customer{" +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerTelephone='" + customerTelephone + '\'' +
                '}';
    }
}
