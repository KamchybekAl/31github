package com.kg.mmar.dto;

import com.kg.mmar.entity.Basket;
import com.kg.mmar.entity.User;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class UserBasketDTO {
    private User user;
    private Basket basket;

}
