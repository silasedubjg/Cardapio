package com.example.Cardapio.food;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

//Indicando e entidade do banco que usaremos
@Table(name = "foods")
@Entity(name = "foods" )
@Getter //Gera em runtime todos os métodos de Get para cada uma das propiedades da entidade (Lib Lombok)
@NoArgsConstructor // Declara um construtor sem nenhum argumento
@AllArgsConstructor // Declara um construtor com todos os argumentos
@EqualsAndHashCode(of = "id")
public class Food {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public BigInteger id;
    public String title;
    public String name;
    public Integer price;


}
