package com.example.WeatherService.infra.repository.weatherlog;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "WEATHER_LOG", schema = "dbo")
public class WeatherLogEntity implements Serializable{

    private static final long serialVersionUID = -7909095508389167546L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "RESPONSE_ID")
    private String responseId;

    @Column(name = "LOCATION")
    private String location;

    @Column(name = "ACTUAL_WEATHER")
    private String actualWeather;

    @Column(name = "TEMPERATURE")
    private String temperature;

    @Column(name = "DATETIME_INSERTED")
    private LocalDateTime timeInserted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResponseId() {
        return responseId;
    }

    public void setResponseId(String responseId) {
        this.responseId = responseId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getActualWeather() {
        return actualWeather;
    }

    public void setActualWeather(String actualWeather) {
        this.actualWeather = actualWeather;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public LocalDateTime getTimeInserted() {
        return timeInserted;
    }

    public void setTimeInserted(LocalDateTime timeInserted) {
        this.timeInserted = timeInserted;
    }

    @Override
    public String toString() {
        return "WeatherLogEntity{" +
                "id=" + id +
                ", responseId='" + responseId + '\'' +
                ", location='" + location + '\'' +
                ", actualWeather='" + actualWeather + '\'' +
                ", temperature='" + temperature + '\'' +
                ", timeInserted=" + timeInserted +
                '}';
    }
}
