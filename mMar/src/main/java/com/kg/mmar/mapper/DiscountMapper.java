package com.kg.mmar.mapper;

import com.kg.mmar.dto.DiscountDto;
import com.kg.mmar.entity.Discount;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface DiscountMapper {
    DiscountDto toDto(Discount discount);

    Discount toEntity(DiscountDto discountDto);

    List<DiscountDto> toDtoList(List<Discount> discountList);

    List<Discount> toEntityList(List<DiscountDto> discountDtoList);
}
