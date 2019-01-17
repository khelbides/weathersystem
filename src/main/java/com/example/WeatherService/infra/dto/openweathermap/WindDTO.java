package com.example.WeatherService.infra.dto.openweathermap;

public class WindDTO {
    String speed;
    String deg;

    @Override
    public String toString() {
        return "WindDTO{" +
                "speed='" + speed + '\'' +
                ", deg='" + deg + '\'' +
                '}';
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getDeg() {
        return deg;
    }

    public void setDeg(String deg) {
        this.deg = deg;
    }
}
