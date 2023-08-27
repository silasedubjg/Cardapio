package com.example.Cardapio.food;

import jakarta.persistence.*;

//Indicando e entidade do banco que usaremos
@Table(name = "foods")
@Entity(name = "foods" )
public class Food {

    @Id
    public Integer id;
    public String title;
    public String name;
    public Integer price;
}
