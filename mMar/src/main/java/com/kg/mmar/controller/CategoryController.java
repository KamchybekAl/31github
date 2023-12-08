package com.kg.mmar.controller;

import com.kg.mmar.dto.CategoryDto;
import com.kg.mmar.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/category")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @PostMapping("save")
    public CategoryDto saveCategory(@RequestBody CategoryDto categoryDto) {
        return categoryService.saveCategory(categoryDto);
    }

    @GetMapping("/findById")
    public CategoryDto findById(@RequestParam Long id){
        return categoryService.findByIdCategory(id);
    }

    @GetMapping("findAll")
    public List<CategoryDto> findAll(){
        return categoryService.findAllCategory();
    }
    @PutMapping("/update")
    public CategoryDto updateCategory(@RequestBody CategoryDto categoryDto){
        return categoryService.updateCategory(categoryDto);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam Long id){
        categoryService.deleteCategory(id);
    }

}
