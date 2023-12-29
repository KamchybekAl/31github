package com.kg.mmar.controller;

import com.kg.mmar.dto.UserBasketDTO;
import com.kg.mmar.dto.UserDto;
import com.kg.mmar.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @PostMapping("save")
    public UserDto saveUser(@RequestBody UserDto userDto) {
        return userService.saveUser(userDto);
    }

    @GetMapping("/findById")
    public UserDto findById(@RequestParam Long id) {
        return userService.findByIdUser(id);
    }

    @GetMapping("findAll")
    public List<UserDto> findAll() {
        return userService.findAllUser();
    }

    @PutMapping("/update")
    public UserDto updateUser(@RequestBody UserDto userDto) {
        return userService.updateUser(userDto);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam Long id) {
        userService.deleteUser(id);
    }

    @PostMapping("/saveUserAndBasket")
    public ResponseEntity<?> saveUserAndBasket(@RequestBody UserBasketDTO dto) {
        return userService.saveUserAndBasket(dto);
    }
}
