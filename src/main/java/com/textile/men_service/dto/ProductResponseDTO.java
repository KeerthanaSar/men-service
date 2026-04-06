package com.textile.men_service.dto;

public class ProductResponseDTO {

    private Long id;
    private String productType;
    private String category;
    private double price;
    private int quantity;

    public Long getId() {
        return id;
    }

    public String getProductType() {
        return productType;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}