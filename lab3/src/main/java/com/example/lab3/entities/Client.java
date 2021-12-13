package com.example.lab3.entities;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Client {
    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY )
    @Getter
    protected Long id;
    @Getter
    @Setter
    protected String username;
    @Getter
    @Setter
    protected String firstName;
    @Getter
    @Setter
    private String lastName;

  
  
    public Client(String username,String firstName, String lastName){
      this.username=username;
      this.firstName=firstName;
      this.lastName=lastName;
    }
    
}
