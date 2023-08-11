package com.example.restfullapi.service;

import com.example.restfullapi.entity.Food;
import com.example.restfullapi.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface FoodSevice {
    public List<Food> getListMainFood();
    public List<Food> getListDessertFood();
    public List<Food> getListSoucesFood();
    public List<Food> getListDrinkFood();
    public List<Food> getTopMainFoods();
    public List<Food> getSpacialDrink();

}
