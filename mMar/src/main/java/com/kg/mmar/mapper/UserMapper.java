package com.kg.mmar.mapper;

import com.kg.mmar.dto.UserDto;
import com.kg.mmar.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    UserDto toDto(User user);
    User toEntity(UserDto userDto);
    List<UserDto> toDtoList (List<User>userList);
    List<User> toEntityList(List<UserDto>userDtoList);
}
