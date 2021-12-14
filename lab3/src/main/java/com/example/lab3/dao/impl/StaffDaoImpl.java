package com.example.lab3.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.example.lab3.dao.PersonDao;
import com.example.lab3.entities.Staff;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class StaffDaoImpl implements PersonDao<Staff,Long> {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void createPerson(Staff staff) {
        entityManager.persist(staff);
    }

    @Override
    public void deletePerson(Staff staff) {

        if(entityManager.contains(staff))
            entityManager.remove(staff);
        else
            entityManager.remove(entityManager.merge(staff));

    }

    @Override
    public void updatePerson(Staff staff) {

        entityManager.merge(staff);

    }

    @Override
    public List<Staff> findAllPersons() {

        return entityManager.createQuery("select st from staff st").getResultList();
    }

    
}
