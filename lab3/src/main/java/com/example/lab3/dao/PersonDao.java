package com.example.lab3.dao;

import java.util.List;

import com.example.lab3.entities.Client;

public interface PersonDao<T, I> {
    
    void createPerson(T I);

    void deletePerson(T I);

    void updatePerson(T I);

    List findAllPersons();

    Client findPersonById(Long id);

    Client findPersonByName(String name);

    
}