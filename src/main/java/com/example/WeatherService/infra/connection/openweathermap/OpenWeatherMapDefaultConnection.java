package com.example.WeatherService.infra.connection.openweathermap;

import com.example.WeatherService.infra.dto.openweathermap.OpenWeatherMapResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class OpenWeatherMapDefaultConnection implements  OpenWeatherMapConnection{

    private final String URL_BY_CITY_NAME = "https://api.openweathermap" +
            ".org/data/2.5/weather?q=%s&appid=f5b1328a1670ee8563fc32dbf1b574ef";

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public OpenWeatherMapResponseDTO getWeatherByCityName(String cityName) {
        return restTemplate.getForEntity(String.format(URL_BY_CITY_NAME, cityName), OpenWeatherMapResponseDTO.class).getBody();
    }
}
