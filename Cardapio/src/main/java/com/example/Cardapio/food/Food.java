package com.example.Cardapio.food;

import jakarta.persistence.*;

//Indicando e entidade do banco que usaremos
@Table(name = "foods")
@Entity(name = "foods" )
public class Food {

   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String name;
    private Integer price;
}
