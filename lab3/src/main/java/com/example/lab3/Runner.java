package com.example.lab3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



import com.example.lab3.dao.impl.ClientDaoImpl;
import com.example.lab3.dao.impl.ShipDaoImpl;
import com.example.lab3.entities.Client;



@Component
public class Runner implements CommandLineRunner {
    @Autowired //
    private ClientDaoImpl dao;
    @Autowired
    private ShipDaoImpl shipdao;


    @Override
    public void run(String...args) throws Exception {
        System.out.println("\n----- List of existing clients -----\n");
       
        dao.findAllPersons().forEach(System.out::println);

        Client cl1 = new Client("last-dance", "Adam", "Driver");
        dao.createPerson(cl1);
        Client cl2 = new Client("3roberto3", "Robert", "Deniro");
        dao.createPerson(cl2);
        Client cl3 = new Client("lil-friend", "Al", "Pachino");
        dao.createPerson(cl3);
        System.out.println("\n----- Added 3 new clients to the system -----\n");
    
        dao.findAllPersons().forEach(System.out::println);

        dao.deletePerson(cl1);

        cl2.setUsername("roberto_the_best");;
        dao.updatePerson(cl2);

        System.out.println("\n----- Deleted Adam and changed Robert's username -----\n");
        
        dao.findAllPersons().forEach(System.out::println);
        System.out.println();


        System.out.println("\n----- List of existing ships -----\n");
        shipdao.findAllShips().forEach(System.out::println);

    }
}