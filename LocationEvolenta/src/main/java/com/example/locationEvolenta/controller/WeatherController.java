package com.example.locationEvolenta.controller;


import com.example.locationEvolenta.model.Geodata;
import com.example.locationEvolenta.model.Weather;
import com.example.locationEvolenta.service.GeodataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WeatherController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private GeodataService geodataService;

    @Value("${weather.url}")
    String weatherUrl;

    @GetMapping("/weather")
    public Weather redirectRequestWeather(@RequestParam String location) {
        Geodata geodata = geodataService.getLocation(location).get();
        String url = String.format("http://%s/?lat=%s&lon=%s",weatherUrl, geodata.getLat(), geodata.getLon());
        return restTemplate.getForObject(url, Weather.class);
    }

}
