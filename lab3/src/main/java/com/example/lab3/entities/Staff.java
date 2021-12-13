package com.example.lab3.entities;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Staff {
    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY )
    @Getter
    protected Long id;

    @Getter
    @Setter
    private Long ship_id;

    @Getter
    @Setter
    protected String name;
    
    @Getter
    @Setter
    protected String duty;
   
  
  
    public Staff(String name,String duty){
     this.name=name;
     this.duty=duty;
    }
}