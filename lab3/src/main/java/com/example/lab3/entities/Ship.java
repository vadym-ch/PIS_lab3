package com.example.lab3.entities;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Ship {
    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY )
    protected Long id;
    protected String sobriquet;
    protected Integer passCapacity;
    
    public Ship(String sobriquet, Integer passCapacity){
        this.sobriquet=sobriquet;
       this.passCapacity= passCapacity;
      }
      
    
}
