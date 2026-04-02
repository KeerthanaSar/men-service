package com.textile.men_service.service;

import com.textile.men_service.entity.Product;

import java.util.List;

public interface ProductService {

    Product addProduct(Product product);

    List<Product> getAllProducts();

    Product getProductById(Long id);

    Product updateProduct(Long id, Product product);

    void deleteProduct(Long id);

    List<Product> getProductsByCategory(String category);
}