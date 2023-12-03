package com.kg.mmar.mapper;

import com.kg.mmar.dto.ProductDto;
import com.kg.mmar.entity.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    ProductDto toDto(Product product);
    Product toEntity(ProductDto productDto);
    List<ProductDto> toDtoList (List<Product>productList);
    List<Product> toEntityList(List<ProductDto>productDtoList);
}
