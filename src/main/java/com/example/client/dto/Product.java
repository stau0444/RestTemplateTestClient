package com.example.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Product {

    @JsonProperty("product_name")
    private String productName;

    private String price;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}

