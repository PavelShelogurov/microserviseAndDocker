package com.example.microService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@CrossOrigin("*")
public class Service {

    @GetMapping("/api/temp")
    public TemperatureDTO getTemperature(){
        Random randomTemperature = new Random();
        return new TemperatureDTO(randomTemperature.nextInt(35), "Цельсия");
    }

}
