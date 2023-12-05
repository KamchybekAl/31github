package com.kg.mmar.service;

import com.kg.mmar.dto.CategoryDto;

import java.util.List;

public interface CategoryService {
    CategoryDto saveCategory (CategoryDto categoryDto);
    CategoryDto findByIdCategory(Long id);
    List<CategoryDto>findAllCategory();
    CategoryDto updateCategory(CategoryDto categoryDto);
    void deleteCategory(Long id);
}
