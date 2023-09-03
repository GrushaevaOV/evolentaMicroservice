package com.example.weatherEvolenta.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Sys{
    private String country;
    private int sunrise;
    private int sunset;
}
