package com.example.weatherEvolenta.model;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Weather{
    private int id;
    private String main;
    private String description;
    private String icon;
}
