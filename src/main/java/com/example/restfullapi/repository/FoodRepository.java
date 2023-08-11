package com.example.restfullapi.repository;

import com.example.restfullapi.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;


@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {
    List<Food> findAllByFoodType(String foodType);
//    @Query("SELECT f FROM Food f ORDER BY f.like DESC")
    List<Food> findTop3ByOrderByLikeDesc();}