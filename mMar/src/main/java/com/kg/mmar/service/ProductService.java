package com.kg.mmar.service;

import com.kg.mmar.dto.ProductDto;

import java.util.List;

public interface ProductService {
    ProductDto saveProduct (ProductDto productDto);
    ProductDto findByIdProduct(Long id);
    List<ProductDto>findAllProduct();
    ProductDto updateProduct (ProductDto productDto);
    void deleteProduct(Long id);

}
