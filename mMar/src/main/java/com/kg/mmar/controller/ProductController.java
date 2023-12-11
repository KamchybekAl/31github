package com.kg.mmar.controller;

import com.kg.mmar.dto.ProductDto;
import com.kg.mmar.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping("save")
    public ProductDto saveProduct(@RequestBody ProductDto productDto) {
        return productService.saveProduct(productDto);
    }

    @GetMapping("/findById")
    public ProductDto findById(@RequestParam Long id) {
        return productService.findByIdProduct(id);
    }

    @GetMapping("findAll")
    public List<ProductDto> findAll() {
        return productService.findAllProduct();
    }

    @PutMapping("/update")
    public ProductDto updateProduct(@RequestBody ProductDto productDto) {
        return productService.updateProduct(productDto);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam Long id) {
        productService.deleteProduct(id);
    }

}
