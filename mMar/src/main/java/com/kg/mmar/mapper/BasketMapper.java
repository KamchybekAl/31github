package com.kg.mmar.mapper;

import com.kg.mmar.dto.BasketDto;
import com.kg.mmar.entity.Basket;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper
public interface BasketMapper {
//    BasketMapper INSTANCE = Mappers.getMapper(BasketMapper.class);
    BasketDto toDto(Basket basket);
    Basket toEntity(BasketDto basketDto);
    List<BasketDto> toDtoList (List<Basket>basketList);
    List<Basket> toEntityList(List<BasketDto>basketDtoList);
}
