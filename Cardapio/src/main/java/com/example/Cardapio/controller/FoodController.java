package com.example.Cardapio.controller;

import com.example.Cardapio.food.Food;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Indicando ao Spring que esta classe é um controlle
@RestController
//Indicando o endpoint que esa classe é responsável
@RequestMapping("food")
public class FoodController {

    //Indicando ao spring quando o endpoint for chamado com o método get esta função é executada
    public void getAll(){

        Food food;
    }
}
