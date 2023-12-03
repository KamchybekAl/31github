package com.kg.mmar.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data

public class UserDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private LocalDateTime dateTimeFrom;
    private LocalDateTime dateTimeTo;
}
