package com.example.lab3.dao.impl;

import java.util.List;

import javax.persistence.*;
import javax.transaction.Transactional;

import com.example.lab3.dao.ShipDao;
import com.example.lab3.entities.Ship;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class ShipDaoImpl implements ShipDao {
    
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Ship findShipById(Long id) {

        return entityManager.find(Ship.class, id);
    }


    @Override
    public List findAllShips() {

        return entityManager.createQuery("select sh from Ship sh").getResultList();
    }

    @Override
    public void createShip(Ship ship) {

        entityManager.persist(ship);
    }

    @Override
    public void updateShip(Ship ship) {

        entityManager.merge(ship);

    }

    @Override
    public void deleteShip(Ship ship) {

        if(entityManager.contains(ship))
            entityManager.remove(ship);
        else
            entityManager.remove(entityManager.merge(ship));


    }
    
}
