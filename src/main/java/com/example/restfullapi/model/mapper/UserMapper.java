package com.example.restfullapi.model.mapper;

import com.example.restfullapi.entity.User;
import com.example.restfullapi.model.dto.UserDto;

public class UserMapper {
    public static UserDto toUserDto(User user){
        UserDto tmp = new UserDto();
        tmp.setUser_id(user.getUser_id());
        tmp.setName(user.getName());
        tmp.setEmail(user.getEmail());
        tmp.setPhone_number(user.getPhone_number());
        tmp.setAddress(user.getAddress());
        tmp.setGender(user.getGender());
        tmp.setUsername(user.getUsername());
        return tmp;
    }
}
