package com.projetoweb.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoweb.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
