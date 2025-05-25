package com.projetoweb.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoweb.demo.entities.OrderItem;
import com.projetoweb.demo.entities.pk.OrderItemPK;


//Nesse caso, já existe uma implementação padrão para o JpaRepository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
    
}
