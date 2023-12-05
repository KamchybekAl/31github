package com.kg.mmar.service;

import com.kg.mmar.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto saveUser(UserDto userDto);

    UserDto findByIdUser(Long id);

    List<UserDto> findAllUser();

    UserDto updateUser(UserDto userDto);

    void deleteUser(Long id);
}
