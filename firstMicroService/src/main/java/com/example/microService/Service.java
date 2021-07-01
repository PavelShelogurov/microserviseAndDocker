package com.example.microService;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@CrossOrigin("*")
public class Service {

    @Value("${TEMPERATURE-SERVICE-URL}")
    private String secondServiceURL;

    @PostMapping("/api/now")
    public Temperature getTemperature(@RequestBody UserRequest userRequest){
        RestTemplate restTemplate = new RestTemplate();
        TemperatureDTO response = restTemplate.getForObject(secondServiceURL, TemperatureDTO.class);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy-hh.mm.ss");
        return new Temperature(userRequest.getCity(), response.getTemperature(), response.getUnits(),  simpleDateFormat.format(new Date()));
    }
}
