package com.kg.mmar.controller;

import com.kg.mmar.dto.OrderDto;
import com.kg.mmar.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;
    @PostMapping("save")
    public OrderDto saveOrder(@RequestBody OrderDto orderDto) {
        return orderService.saveOrder(orderDto);
    }

    @GetMapping("/findById")
    public OrderDto findById(@RequestParam Long id){
        return orderService.findByIdOrder(id);
    }

    @GetMapping("findAll")
    public List<OrderDto> findAll(){
        return orderService.findAllOrder();
    }
    @PutMapping("/update")
    public OrderDto updateOrder(@RequestBody OrderDto orderDto){
        return orderService.updateOrder(orderDto);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam Long id){
        orderService.deleteOrder(id);
    }

}
