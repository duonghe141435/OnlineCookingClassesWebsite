package com.example.restfullapi.controller;

import com.example.restfullapi.entity.Food;
import com.example.restfullapi.entity.User;
import com.example.restfullapi.service.FoodSeviceImpl;
import com.example.restfullapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
//@RequestMapping("/users")
public class Mycontroller {
//    @RequestMapping(value={"/hello-world","/hello"}, method = RequestMethod.GET)
//    public User helloWorld(){
//        User user = new User(1,"aa");
//        return user;
//    }

    @Autowired
    private UserService userService;



//    @GetMapping("/search")
//    public ResponseEntity<?> searchUser(@RequestParam(name = "name", required = false, defaultValue = "") String name){
//        List<UserDto> users = userService.searchUser(name);
//        return ResponseEntity.ok(users);
//    }
//    @GetMapping("")
//    public ResponseEntity<?> getListUser(){
//        List<UserDto> users = userService.getListUsers();
//        return ResponseEntity.ok(users);
//    }

//    @GetMapping("/{id}")
//    public ResponseEntity<?> getUser(@PathVariable int id){
//        UserDto user = userService.getUserById(id);
//        return ResponseEntity.ok(user);
//    }
//    @PostMapping("")
//    public ResponseEntity<?> createUser(){
//        return null;
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<?> updateUser(){
//        return null;
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<?> deleteUser(){
//        return null;
//    }

//    @GetMapping("/")
//    public String showUsers(Model model) {
//        List<UserDto> users = userService.getListUsers();
//        model.addAttribute("users", users);
//        return "a";
//    }

    @GetMapping("/")
    public String showHomePage(Model model) {
        List<User> user = userService.getListUsers();
        System.out.println(user);
        model.addAttribute("users", user);
        model.addAttribute("saveUser", new User());
        return "index";
    }




//    @PostMapping("checkLogin")
//    public String logOut(){
//        return "login";
//    }


}
