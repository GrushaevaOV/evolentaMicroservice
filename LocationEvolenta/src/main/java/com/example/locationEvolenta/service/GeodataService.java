package com.example.locationEvolenta.service;

import com.example.locationEvolenta.model.Geodata;
import com.example.locationEvolenta.repository.GeodataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Service
public class GeodataService {
    @Autowired
    private GeodataRepository geodataRepository;

    public Iterable<Geodata> findAll() {
        return geodataRepository.findAll();
    }

    public Optional<Geodata> findId(int idGeo) {
        return geodataRepository.findById(idGeo);
    }

    public Geodata save(Geodata geodata) {
        return geodataRepository.save(geodata);
    }

    public void deleteGeo(int idGeo) {
        geodataRepository.deleteById(idGeo);
    }

    public Geodata update(int idGeo, Geodata geodata) {
        Optional<Geodata> foundGeodata = geodataRepository.findById(idGeo);
        if (foundGeodata.isPresent()) {
            geodata.setId(idGeo);
        }
        return geodataRepository.save(geodata);
    }

    public Optional<Geodata> getLocation(String location) {
        return geodataRepository.findByName(location);
    }

}
