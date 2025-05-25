package com.projetoweb.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoweb.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
