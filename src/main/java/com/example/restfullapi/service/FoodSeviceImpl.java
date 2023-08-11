package com.example.restfullapi.service;

import com.example.restfullapi.entity.Food;
import com.example.restfullapi.repository.FoodRepository;
import com.example.restfullapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class FoodSeviceImpl implements FoodSevice {
    @Autowired
    FoodRepository foodRepository;
    @Override
    public List<Food> getListMainFood() {
        List<Food> result = foodRepository.findAllByFoodType("mainFood");
        return result;
    }

    @Override
    public List<Food> getListDessertFood() {
        List<Food> result = foodRepository.findAllByFoodType("dessert");
        return result;
    }

    @Override
    public List<Food> getListSoucesFood() {
        List<Food> result = foodRepository.findAllByFoodType("souces");
        return result;
    }

    @Override
    public List<Food> getListDrinkFood() {
        List<Food> result = foodRepository.findAllByFoodType("drink");
        return result;
    }

    @Override
    public List<Food> getTopMainFoods() {
        List<Food> topFood = foodRepository.findTop3ByOrderByLikeDesc();
        return topFood != null ? topFood : Collections.emptyList();
    }


    @Override
    public List<Food> getSpacialDrink() {
        return null;
    }
}
