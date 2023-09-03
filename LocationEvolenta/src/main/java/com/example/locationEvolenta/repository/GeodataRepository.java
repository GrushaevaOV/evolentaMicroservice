package com.example.locationEvolenta.repository;

import com.example.locationEvolenta.model.Geodata;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GeodataRepository extends CrudRepository<Geodata,Integer> {
    Optional<Geodata> findByName(String name);
}
