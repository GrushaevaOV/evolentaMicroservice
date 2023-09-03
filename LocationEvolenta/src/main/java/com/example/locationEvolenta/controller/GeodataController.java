package com.example.locationEvolenta.controller;

import com.example.locationEvolenta.model.Geodata;
import com.example.locationEvolenta.repository.GeodataRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/location")
public class GeodataController {

    @Autowired
    private GeodataRepository geodataRepository;

    @GetMapping
    public Iterable<Geodata> findAll() {
        return geodataRepository.findAll();
    }

    @GetMapping("/{idGeo}")
    public Optional<Geodata> findById(@PathVariable int idGeo) {
        return geodataRepository.findById(idGeo);
    }

    @PostMapping
    public Geodata save(@RequestBody Geodata geodata) {
        return geodataRepository.save(geodata);
    }

    @DeleteMapping ("/{idGeo}")
    public void deleteGeo(@PathVariable int idGeo){
        geodataRepository.deleteById(idGeo);
    }

    @PutMapping("/{idGeo}")
    public Geodata update (@PathVariable int idGeo, @RequestBody Geodata geodata){
        Geodata foundGeodata = geodataRepository.findById(idGeo).get();
        foundGeodata.setId(idGeo);
        return geodataRepository.save(geodata);
    }

}
