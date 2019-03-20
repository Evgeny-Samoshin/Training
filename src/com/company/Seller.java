package com.company;

public class Seller {
    private int sellerID;
    private String sellerName;
    private String sellerAddress;
    private String sellerTelephone;

    Seller(){}

    public Seller(String sellerName, String sellerAddress, String sellerTelephone) {
        this.sellerName = sellerName;
        this.sellerAddress = sellerAddress;
        this.sellerTelephone = sellerTelephone;
    }

    public int getSellerID() {
        return sellerID;
    }

    public void setSellerID(int sellerID) {
        this.sellerID = sellerID;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerAddress() {
        return sellerAddress;
    }

    public void setSellerAddress(String sellerAddress) {
        this.sellerAddress = sellerAddress;
    }

    public String getSellerTelephone() {
        return sellerTelephone;
    }

    public void setSellerTelephone(String sellerTelephone) {
        this.sellerTelephone = sellerTelephone;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "sellerID=" + sellerID +
                ", sellerName='" + sellerName + '\'' +
                ", sellerAddress='" + sellerAddress + '\'' +
                ", sellerTelephone='" + sellerTelephone + '\'' +
                '}';
    }
}
