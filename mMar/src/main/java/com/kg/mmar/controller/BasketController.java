package com.kg.mmar.controller;

import com.kg.mmar.dto.BasketDto;
import com.kg.mmar.entity.Basket;
import com.kg.mmar.service.BasketService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/basket")
@RequiredArgsConstructor
public class BasketController {
    private final BasketService basketService;

    @PostMapping("save")
    public BasketDto saveBasket(@RequestBody BasketDto basketDto) {
        return basketService.saveBasket(basketDto);
    }

    @GetMapping("/findById")
    public Basket findById(@RequestParam Long id){
        return basketService.findByIdBasket(id);
    }

    @GetMapping("findAll")
    public List<BasketDto>findAll(){
        return basketService.findAllBasket();
    }
    @PutMapping("/update")
    public BasketDto updateBasket(@RequestBody BasketDto basketDto){
        return basketService.updateBasket(basketDto);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam Long id){
        basketService.deleteBasket(id);
    }

}
