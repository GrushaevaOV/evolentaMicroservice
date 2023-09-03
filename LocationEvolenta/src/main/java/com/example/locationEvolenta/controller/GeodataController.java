package com.example.locationEvolenta.controller;

import com.example.locationEvolenta.model.Geodata;
import com.example.locationEvolenta.service.GeodataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/location")
public class GeodataController {

    @Autowired
    private GeodataService geodataService;

    @GetMapping
    public Iterable<Geodata> findAll() {
        return geodataService.findAll();
    }

    @GetMapping("/{idGeo}")
    public Optional<Geodata> findById(@PathVariable int idGeo) {
        return geodataService.findId(idGeo);
    }

    @PostMapping
    public Geodata save(@RequestBody Geodata geodata) {
        return geodataService.save(geodata);
    }

    @DeleteMapping("/{idGeo}")
    public void deleteGeo(@PathVariable int idGeo) {
        geodataService.deleteGeo(idGeo);
    }

    @PutMapping("/{idGeo}")
    public Geodata update(@PathVariable int idGeo, @RequestBody Geodata geodata) {
        return geodataService.update(idGeo, geodata);
    }

    @GetMapping("/find-location")
    public Optional<Geodata> getLocation(@RequestParam String location) {
        return geodataService.getLocation(location);
    }
}
