package com.projetoweb.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoweb.demo.entities.Order;


//Nesse caso, já existe uma implementação padrão para o JpaRepository
public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
