package com.example.restfullapi.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private int user_id;
    private String username;
    private String name;
    private String address;
    private String email;
    private String phone_number;
    private String age;
    private String gender;
}
