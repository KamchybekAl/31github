package com.kg.mmar.mapper;

import com.kg.mmar.dto.CategoryDto;
import com.kg.mmar.entity.Category;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {
    CategoryDto toDto(Category category);
    Category toEntity(CategoryDto categoryDto);
    List<CategoryDto> toDtoList (List<Category>categoryList);
    List<Category> toEntityList(List<CategoryDto>categoryDtoList);


}
