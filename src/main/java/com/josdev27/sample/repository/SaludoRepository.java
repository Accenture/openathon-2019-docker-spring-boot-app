package com.josdev27.sample.repository;

import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.josdev27.sample.domain.Saludo;

@Repository
@Profile("db")
public interface SaludoRepository extends CrudRepository<Saludo, Integer> {
   
    List<Saludo> findAll();
    
}
