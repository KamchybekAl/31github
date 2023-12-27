package com.kg.mmar.service.impl;

import com.kg.mmar.dto.ProductDto;
import com.kg.mmar.entity.Product;
import com.kg.mmar.mapper.ProductMapper;
import com.kg.mmar.repository.ProductRepo;
import com.kg.mmar.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional

public class ProductServiceImpl implements ProductService {
    private final ProductRepo productRepo;
    private final ProductMapper productMapper;

    @Override
    public ProductDto saveProduct(ProductDto productDto) {
        Product product = productMapper.toEntity(productDto);
        Product save = productRepo.save(product);
        return productMapper.toDto(save);
    }

    @Override
    public ProductDto findByIdProduct(Long id) {
        return productMapper.toDto(productRepo.findById(id).get());
    }

    @Override
    public List<ProductDto> findAllProduct() {
        return productMapper.toDtoList(productRepo.findAll());
    }

    @Override
    public ProductDto updateProduct(ProductDto productDto) {
        Product updateProductPr = productRepo.findById(productDto.getId()).get();
//        updateProductPr.setQuantity(productDto.getQuantity());
        updateProductPr.setWeight(productDto.getWeight());
        return productMapper.toDto(updateProductPr);
    }

    @Override
    public void deleteProduct(Long id) {
        Product deleteProduct = productRepo.findById(id).get();
        productRepo.delete(deleteProduct);

    }

    @Override
    public List<ProductDto> getProductCategory(String ProductCategory) {
        return productMapper.toDtoList(productRepo.getProductCategory(ProductCategory));
    }
}
