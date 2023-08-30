package com.example.Cardapio.controller;

import com.example.Cardapio.food.Food;
import com.example.Cardapio.food.FoodRepository;
import com.example.Cardapio.food.FoodRequestDTO;
import com.example.Cardapio.food.FoodResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.lang.model.util.Elements;
import java.util.List;

//Indicando ao Spring que esta classe é um controlle
@RestController
//Indicando o endpoint que esa classe é responsável
@RequestMapping("foods")
public class FoodController {

    @Autowired
    private FoodRepository repository;

    @CrossOrigin(origins = "*",allowedHeaders = "*")
    //Indicando ao spring quando o endpoint for chamado com o método get esta função é executada
    @GetMapping
    public List getAll(){
        List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodList;
    }

    @CrossOrigin(origins = "*",allowedHeaders = "*")
    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data){
        Food foodData = new Food(data);
        repository.save(foodData);
        return;

    }
}
