package com.example.weatherEvolenta.controller;

import com.example.weatherEvolenta.model.Main;
import com.example.weatherEvolenta.model.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
//@EnableScheduling
public class WeatherController {

    @Autowired
    private  RestTemplate restTemplate;
    @Value("${appid}")
    private String appId;
    @Value("${url.weather}")
    private String urlWeather;

    @GetMapping
   // @Cacheable(value = "weather")
    public Main getWeather(@RequestParam String lat, @RequestParam String lon) {
        String request = String.format("%s?lat=%s&lon=%s&units=metric&appid=%s",
                urlWeather, lat, lon, appId);
        return restTemplate.getForObject(request, Root.class).getMain();
    }


   /* @CacheEvict(value = "weather",allEntries = true)
    @Scheduled(fixedRate = 60000L)
    public void evict() {
    }*/
}

