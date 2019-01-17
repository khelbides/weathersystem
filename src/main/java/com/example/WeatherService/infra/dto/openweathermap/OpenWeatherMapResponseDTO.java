package com.example.WeatherService.infra.dto.openweathermap;

import java.util.List;

public class OpenWeatherMapResponseDTO {
    CoordinateDTO coord;
    List<WeatherDTO> weather;
    String base;
    MainDTO main;
    WindDTO wind;
    String visibility;
    CloudsDTO clouds;
    RainDTO rain;
    String dt;
    SysDTO sys;
    String id;
    String name;
    String cod;

    public CoordinateDTO getCoord() {
        return coord;
    }

    public void setCoord(CoordinateDTO coord) {
        this.coord = coord;
    }

    public List<WeatherDTO> getWeather() {
        return weather;
    }

    public void setWeather(List<WeatherDTO> weather) {
        this.weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public MainDTO getMain() {
        return main;
    }

    public void setMain(MainDTO main) {
        this.main = main;
    }

    public WindDTO getWind() {
        return wind;
    }

    public void setWind(WindDTO wind) {
        this.wind = wind;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public CloudsDTO getClouds() {
        return clouds;
    }

    public void setClouds(CloudsDTO clouds) {
        this.clouds = clouds;
    }

    public RainDTO getRain() {
        return rain;
    }

    public void setRain(RainDTO rain) {
        this.rain = rain;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public SysDTO getSys() {
        return sys;
    }

    public void setSys(SysDTO sys) {
        this.sys = sys;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }


}
