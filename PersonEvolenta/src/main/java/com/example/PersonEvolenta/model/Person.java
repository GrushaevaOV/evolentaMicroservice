package com.example.PersonEvolenta.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Data
public class Person {
    @Id
    @GeneratedValue
    private int id;

    @NonNull
    private String name;
    @NonNull
    private String location;

}
