package com.example.restfullapi.service;

import com.example.restfullapi.entity.User;
import com.example.restfullapi.model.dto.UserDto;
import com.example.restfullapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserSeviceImpl implements UserService{
//    private static ArrayList<User> users = new ArrayList<User>();
    @Autowired
    UserRepository userRepository;
    @Override
    public List<UserDto> searchUser(String keyword) {
//        List<UserDto> resuilt = new ArrayList<>();
//        for (User user : users){
//            if(user.getName().toLowerCase().contains(keyword.toLowerCase())){
//                resuilt.add(UserMapper.toUserDto(user));
//            }
//        }
//        return resuilt;
        return null;
    }

    @Override
    public List<User> getListUsers() {
        List<User> result = userRepository.findAll();

        return result;
    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public Optional<User> getUserByUserName(String userName) {
        return userRepository.findByUsername(userName);
    }


    @Override
    public boolean checkLogin(String userName, String password) {
        Optional<User> optionalUser = getUserByUserName(userName);
        if(optionalUser.isPresent()&& optionalUser.get().getPassword().equals(password)){
            return true;
        }
        return false;
    }


}
