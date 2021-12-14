package com.example.lab3.dao;

import java.util.List;


public interface PersonDao<T, I> {
    
    void createPerson(T I);

    void deletePerson(T I);

    void updatePerson(T I);

    List<T> findAllPersons();

    
}