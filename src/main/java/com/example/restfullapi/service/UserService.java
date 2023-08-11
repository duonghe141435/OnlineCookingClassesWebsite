package com.example.restfullapi.service;

import com.example.restfullapi.entity.User;
import com.example.restfullapi.model.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    public List<UserDto> searchUser(String keyword);

    public List<User> getListUsers();

    public User getUserById(int id);
    public Optional<User> getUserByUserName(String userName);

    public boolean checkLogin(String userName,String password);
}
