package com.kg.mmar.controller;

import com.kg.mmar.dto.PriceDto;
import com.kg.mmar.service.PriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/price")
@RequiredArgsConstructor

public class PriceController {
    private final PriceService priceService;

    @PostMapping("save")
    public PriceDto savePrice(@RequestBody PriceDto priceDto) {
        return priceService.savePrice(priceDto);
    }

    @GetMapping("/findById")
    public PriceDto findById(@RequestParam Long id){
        return priceService.findByIdPrice(id);
    }

    @GetMapping("findAll")
    public List<PriceDto> findAll(){
        return priceService.findAllPrice();
    }
    @PutMapping("/update")
    public PriceDto updatePrice(@RequestBody PriceDto priceDto){
        return priceService.updatePrice(priceDto);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam Long id){
        priceService.deletePrice(id);
    }


}
