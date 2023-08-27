package com.example.Cardapio.controller;

import com.example.Cardapio.food.Food;
import com.example.Cardapio.food.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Indicando ao Spring que esta classe é um controlle
@RestController
//Indicando o endpoint que esa classe é responsável
@RequestMapping("foods")
public class FoodController {

    @Autowired
    private FoodRepository repository;


    //Indicando ao spring quando o endpoint for chamado com o método get esta função é executada
    @GetMapping
    public List getAll(){

        List<Food> foodList = repository.findAll();
        return foodList;

    }
}
