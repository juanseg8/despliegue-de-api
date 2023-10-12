package com.desafio.desafio3.Models.Repositories;

import com.desafio.desafio3.Models.Entities.AdressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdressRepository extends JpaRepository<AdressEntity, Integer> {
}
