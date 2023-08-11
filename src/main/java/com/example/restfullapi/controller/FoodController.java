package com.example.restfullapi.controller;

import com.example.restfullapi.entity.Food;
import com.example.restfullapi.service.FoodSeviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class FoodController {
    @Autowired
    private FoodSeviceImpl foodSevice;
    @GetMapping("/home")
    public String Home(Model model, HttpSession session) {
        if(session.getAttribute("") != null){
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
        }
        return "login";
    }

    @GetMapping("/shop")
    public String Shop(Model model) {
        return "shop";
    }

    @GetMapping("/register")
    public String Register(Model model) {
        return "registration";
    }
}
