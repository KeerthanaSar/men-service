package com.textile.men_service.service;

import com.textile.men_service.dto.ProductRequestDTO;
import com.textile.men_service.dto.ProductResponseDTO;

import java.util.List;

public interface ProductService {

    ProductResponseDTO addProduct(ProductRequestDTO requestDTO);

    List<ProductResponseDTO> getAllProducts();

    ProductResponseDTO getProductById(Long id);

    ProductResponseDTO updateProduct(Long id, ProductRequestDTO requestDTO);

    void deleteProduct(Long id);

    List<ProductResponseDTO> getProductsByCategory(String category);
}