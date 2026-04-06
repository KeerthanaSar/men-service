package com.textile.men_service.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

public class ProductRequestDTO {

    @NotBlank(message = "Product type cannot be empty")
    private String productType;

    @NotBlank(message = "Category cannot be empty")
    private String category;

    @Positive(message = "Price must be greater than zero")
    private double price;

    @PositiveOrZero(message = "Quantity cannot be negative")
    private int quantity;

    // getters and setters
}