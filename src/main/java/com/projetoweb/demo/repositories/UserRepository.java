package com.projetoweb.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoweb.demo.entities.User;

//Nesse caso, já existe uma implementação padrão para o JpaRepository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
