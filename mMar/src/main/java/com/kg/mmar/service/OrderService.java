package com.kg.mmar.service;

import com.kg.mmar.dto.OrderDto;

import java.util.List;

public interface OrderService {
    OrderDto saveOrder (OrderDto orderDto);
    OrderDto findByIdOrder(Long id);
    List<OrderDto>findAllOrder();
    OrderDto updateOrder(OrderDto orderDto);
    void deleteOrder(Long id);

}
