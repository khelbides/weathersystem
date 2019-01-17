package com.example.WeatherService.infra.dto.openweathermap;

public class SysDTO {
    String type;
    String id;
    String message;
    String country;
    String sunrise;
    String sunset;

    @Override
    public String toString() {
        return "SysDTO{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", message='" + message + '\'' +
                ", country='" + country + '\'' +
                ", sunrise='" + sunrise + '\'' +
                ", sunset='" + sunset + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }
}
