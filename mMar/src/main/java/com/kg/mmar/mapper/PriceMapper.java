package com.kg.mmar.mapper;

import com.kg.mmar.dto.PriceDto;
import com.kg.mmar.entity.Price;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface PriceMapper {
    PriceDto toDto(Price price);
    Price toEntity(PriceDto priceDto);
    List<PriceDto> toDtoList (List<Price>priceList);
    List<Price> toEntityList(List<PriceDto>priceDtoList);
}
