package com.kg.mmar.mapper;

import com.kg.mmar.dto.OrderDto;
import com.kg.mmar.entity.Order;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
    OrderDto toDto(Order order);
    Order toEntity(OrderDto orderDto);
    List<OrderDto> toDtoList (List<Order>orderList);
    List<Order> toEntityList(List<OrderDto>orderDtoList);
}
