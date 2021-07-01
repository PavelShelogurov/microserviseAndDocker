package com.example.microService;


public class Temperature {
    private String city;
    private int temperature;
    private String units;
    private String date;

    public Temperature(String city, int temperature, String units, String date) {
        this.city = city;
        this.temperature = temperature;
        this.units = units;
        this.date = date;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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
