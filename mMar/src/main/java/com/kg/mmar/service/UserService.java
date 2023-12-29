package com.kg.mmar.service;

import com.kg.mmar.dto.UserBasketDTO;
import com.kg.mmar.dto.UserDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {
    UserDto saveUser(UserDto userDto);

    UserDto findByIdUser(Long id);

    List<UserDto> findAllUser();

    UserDto updateUser(UserDto userDto);

    void deleteUser(Long id);
    ResponseEntity<?> saveUserAndBasket(UserBasketDTO dto);
}
