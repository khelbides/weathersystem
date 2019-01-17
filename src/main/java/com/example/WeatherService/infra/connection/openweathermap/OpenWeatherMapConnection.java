package com.example.WeatherService.infra.connection.openweathermap;

import com.example.WeatherService.infra.dto.openweathermap.OpenWeatherMapResponseDTO;

public interface OpenWeatherMapConnection {
    OpenWeatherMapResponseDTO getWeatherByCityName(String cityName);
}
