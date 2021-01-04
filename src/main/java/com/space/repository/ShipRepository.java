package com.space.repository;


import com.space.model.Ship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/* Интерфейс JPARepository предоставляет framework "Spring Data".
    Spring Data используется для упрощения взаимодействия приложения с
    базами данных. Запись / получение данных. Как SQL, так и noSQL.
    (То есть это круче, чем прослойка JDBC как я понял)

    JpaRepository – это интерфейс фреймворка Spring Data предоставляющий
    набор стандартных методов JPA для работы с БД. В данном случае с MySQL.*/

public interface ShipRepository extends JpaRepository<Ship, Long> {
}


