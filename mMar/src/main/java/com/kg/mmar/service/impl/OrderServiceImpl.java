package com.kg.mmar.service.impl;

import com.kg.mmar.dto.OrderDto;
import com.kg.mmar.entity.Order;
import com.kg.mmar.mapper.OrderMapper;
import com.kg.mmar.repository.OrderRepo;
import com.kg.mmar.service.BasketService;
import com.kg.mmar.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional

public class OrderServiceImpl implements OrderService {
    private final OrderRepo orderRepo;
    private final OrderMapper orderMapper;
    private final BasketService basketService;
    @Override
    public OrderDto saveOrder(OrderDto orderDto) {
        Order order = orderMapper.toEntity(orderDto);
        order.setBasket(basketService.findByIdBasket(order.getBasket().getId()));
        Order save = orderRepo.save(order);
        return orderMapper.toDto(save);
    }

    @Override
    public OrderDto findByIdOrder(Long id) {
        return orderMapper.toDto(orderRepo.findById(id).get());
    }

    @Override
    public List<OrderDto> findAllOrder() {
        return orderMapper.toDtoList(orderRepo.findAll());
    }



    @Override
    public OrderDto updateOrder(OrderDto orderDto) {
        Order updateOrderOr = orderRepo.findById(orderDto.getId()).get();
        updateOrderOr.setTotalPrice(orderDto.getTotalPrice());
        updateOrderOr.setIsPaid(orderDto.getIsPaid());
        return orderMapper.toDto(updateOrderOr);
    }

    @Override
    public void deleteOrder(Long id) {
        Order deleteOrder = orderRepo.findById(id).get();
        orderRepo.delete(deleteOrder);

    }
}
