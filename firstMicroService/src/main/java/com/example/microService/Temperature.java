package com.example.microService;


public class Temperature {
    private int temperature;
    private String units;
    private String date;

    public Temperature(int temperature, String units, String date) {
        this.temperature = temperature;
        this.units = units;
        this.date = date;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
