package com.kg.mmar.service.impl;

import com.kg.mmar.dto.UserDto;
import com.kg.mmar.entity.User;
import com.kg.mmar.mapper.UserMapper;
import com.kg.mmar.repository.UserRepo;
import com.kg.mmar.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional

public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;
    private final UserMapper userMapper;
    @Override
    public UserDto saveUser(UserDto userDto) {
        User user = userMapper.toEntity(userDto);
        User save = userRepo.save(user);
        return userMapper.toDto(save);
    }

    @Override
    public UserDto findByIdUser(Long id) {
        return userMapper.toDto(userRepo.findById(id).get());
    }

    @Override
    public List<UserDto> findAllUser() {
        return userMapper.toDtoList(userRepo.findAll());
    }

    @Override
    public UserDto updateUser(UserDto userDto) {
        User updateUserUr = userRepo.findById(userDto.getId()).get();
        updateUserUr.setFirstName(userDto.getFirstName());
        updateUserUr.setLastName(userDto.getLastName());
        updateUserUr.setEmail(userDto.getEmail());
        return userMapper.toDto(updateUserUr);
    }

    @Override
    public void deleteUser(Long id) {
        User deleteUser = userRepo.findById(id).get();
        userRepo.delete(deleteUser);

    }
}
