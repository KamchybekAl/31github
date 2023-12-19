package com.kg.mmar.controller;

import com.kg.mmar.dto.DiscountDto;
import com.kg.mmar.service.DiscountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/discount")
@RequiredArgsConstructor
public class DiscountController {
    private final DiscountService discountService;

    @PostMapping("save")
    public DiscountDto savePrice(@RequestBody DiscountDto discountDto) {
        return discountService.saveDiscount(discountDto);
    }

    @GetMapping("/findById")
    public DiscountDto findById(@RequestParam Long id) {
        return discountService.findByIdDiscount(id);
    }

    @GetMapping("findAll")
    public List<DiscountDto> findAll() {
        return discountService.findAllDiscount();
    }

    @PutMapping("/update")
    public DiscountDto updateDiscount(@RequestBody DiscountDto discountDto) {
        return discountService.updateDiscount(discountDto);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam Long id) {
        discountService.deleteDiscount(id);
    }


}
