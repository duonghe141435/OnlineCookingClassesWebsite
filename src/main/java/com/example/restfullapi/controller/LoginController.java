package com.example.restfullapi.controller;

import com.example.restfullapi.entity.Food;
import com.example.restfullapi.service.FoodSeviceImpl;
import com.example.restfullapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;
    @Autowired
    private FoodSeviceImpl foodSevice;

    @GetMapping("/login")
    public String Login(Model model) {
        return "login";
    }

    @PostMapping("checkLogin")
    public String checkLogin(Model model, @RequestParam("userName") String userName,
                             @RequestParam String password, HttpSession session){
        if(userService.checkLogin(userName, password)){
            session.setAttribute("username",userName);
            List<Food> mainFood = foodSevice.getListMainFood();
            List<Food> dessert = foodSevice.getListDessertFood();
            List<Food> souces = foodSevice.getListSoucesFood();
            List<Food> drink = foodSevice.getListDrinkFood();
            List<Food> topMainFood = foodSevice.getTopMainFoods();
            model.addAttribute("topMainFood",topMainFood);
            model.addAttribute("mainFood",mainFood);
            model.addAttribute("dessert",dessert);
            model.addAttribute("souces",souces);
            model.addAttribute("drink",drink);
            if (!topMainFood.isEmpty()) {
                String imageUrl = topMainFood.get(0).getImageUrl();
                model.addAttribute("imageUrl", imageUrl);
            }
            return "home";
        }else{
            model.addAttribute("ERR", "Username or password is not exist");
        }
        return "login";
    }

    @PostMapping("logout")
    public String logOut(Model model,HttpSession session){
        session.removeAttribute("username");
        return "login";
    }
}
