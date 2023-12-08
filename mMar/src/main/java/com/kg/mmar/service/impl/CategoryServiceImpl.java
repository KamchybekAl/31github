package com.kg.mmar.service.impl;

import com.kg.mmar.dto.CategoryDto;
import com.kg.mmar.entity.Category;
import com.kg.mmar.mapper.CategoryMapper;
import com.kg.mmar.repository.CategoryRepo;
import com.kg.mmar.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@RequiredArgsConstructor
@Transactional

public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepo categoryRepo;
    private final CategoryMapper categoryMapper;
    @Override
    public CategoryDto saveCategory(CategoryDto categoryDto) {
        Category category = categoryMapper.toEntity(categoryDto);
        Category save = categoryRepo.save(category);
        return categoryMapper.toDto(save);
    }

    @Override
    public CategoryDto findByIdCategory(Long id) {
        return categoryMapper.toDto(categoryRepo.findById(id).get());
    }

    @Override
    public List<CategoryDto> findAllCategory() {
        return categoryMapper.toDtoList(categoryRepo.findAll());
    }

    @Override
    public CategoryDto updateCategory(CategoryDto categoryDto) {
        Category updateCategoryCat = categoryRepo.findById(categoryDto.getId()).get();
        updateCategoryCat.setName(categoryDto.getName());
        return categoryMapper.toDto(updateCategoryCat);
    }

    @Override
    public void deleteCategory(Long id) {
        Category deleteCategory = categoryRepo.findById(id).get();
        categoryRepo.delete(deleteCategory);

    }
}
