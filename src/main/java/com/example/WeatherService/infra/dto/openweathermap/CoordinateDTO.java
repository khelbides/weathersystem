package com.example.WeatherService.infra.dto.openweathermap;

public class CoordinateDTO {
    String lon;
    String lat;

    @Override
    public String toString() {
        return "CoordinateDTO{" +
                "lon='" + lon + '\'' +
                ", lat='" + lat + '\'' +
                '}';
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }
}
