package com.example.lab3.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.example.lab3.dao.PersonDao;
import com.example.lab3.entities.Client;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class ClientDaoImpl implements PersonDao<Client, Long> {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void createPerson(Client client) {
        entityManager.persist(client);
    }

    @Override
    public void deletePerson(Client client) {

        if(entityManager.contains(client))
            entityManager.remove(client);
        else
            entityManager.remove(entityManager.merge(client));

    }

    @Override
    public void updatePerson(Client client) {

        entityManager.merge(client);

    }

    @Override
    public List findAllPersons() {

        return entityManager.createQuery("select c from Client c").getResultList();
    }

    @Override
    public Client findPersonById(Long id) {

        return entityManager.find(Client.class, id);
    }

    @Override
    public Client findPersonByName(String firstName) {
        return entityManager.find(Client.class, firstName);
    }
 
}
