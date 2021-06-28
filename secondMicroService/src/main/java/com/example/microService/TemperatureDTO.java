package com.example.microService;

public class TemperatureDTO {

    private int temperature;
    private String units;

    public TemperatureDTO(){}

    public TemperatureDTO(int temperature, String units) {
        this.temperature = temperature;
        this.units = units;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }
}
