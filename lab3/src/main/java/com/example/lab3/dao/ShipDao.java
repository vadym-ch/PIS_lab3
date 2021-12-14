package com.example.lab3.dao;

import java.util.List;

import com.example.lab3.entities.Ship;

public interface ShipDao {
    void createShip(Ship ship);

    void deleteShip(Ship ship);

    void updateShip(Ship ship);

    List<Ship> findAllShips();

    Ship  findShipById(Long id);

}
