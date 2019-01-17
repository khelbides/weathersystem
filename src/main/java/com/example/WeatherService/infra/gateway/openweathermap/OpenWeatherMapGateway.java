package com.example.WeatherService.infra.gateway.openweathermap;

import com.example.WeatherService.core.dto.WeatherDto;

public interface OpenWeatherMapGateway {

    WeatherDto getWeatherByCityName(String cityName);
}
