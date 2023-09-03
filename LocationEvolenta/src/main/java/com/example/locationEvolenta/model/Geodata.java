package com.example.locationEvolenta.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class Geodata {
    @Id
    @GeneratedValue
    int id;
    @NonNull
    private double lon;
    @NonNull
    private double lat;
    @NonNull
    private String name;
}
