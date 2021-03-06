package com.space.service;



import com.space.controller.ShipOrder;
import com.space.model.Ship;
import com.space.model.ShipType;

import java.util.List;

public interface ShipService {
    /*1. получать список всех существующих кораблей;
    2. создавать новый корабль;
    3. редактировать характеристики существующего корабля;
    4. удалять корабль;
    5. получать корабль по id;
    6. получать отфильтрованный список кораблей в соответствии с переданными
    фильтрами;
    7. получать количество кораблей, которые соответствуют фильтрам.*/

    List<Ship> getSortAllShips(String name, String planet, ShipType shipType,
                               Long after, Long before, Boolean isUsed,
                               Double minSpeed, Double maxSpeed, Integer minCrewSize,
                               Integer maxCrewSize, Double miRating, Double maxRating);
    List<Ship> getShipsForPage(List<Ship> sortAllShips, ShipOrder shipOrder,
                               Integer pageNumber, Integer pageSize);
    Ship createNewShip(Ship newShip);
    Ship editShip(Ship newEditShip, Long id);
    void deleteShipById(Long id);
    Ship getShipById(Long id);
}