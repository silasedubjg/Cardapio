package com.example.Cardapio.food;

import java.math.BigInteger;

public record FoodResponseDTO(BigInteger id, String name, String title, Integer price){
    public FoodResponseDTO(Food food){
        this(food.getId(),
        food.getName(),
        food.getTitle(),
        food.getPrice());
    }
}
