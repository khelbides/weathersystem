package com.example.WeatherService.core.service;

import com.example.WeatherService.core.dto.WeatherDto;

import java.util.List;

public interface WeatherService {
    List<WeatherDto> getWeatherInfoByCityNames(List<String> cityNameList);

    List<WeatherDto> getWeatherInfoOfLondonPragueSanFrancisco();

    WeatherDto getWeatherInfoByCityName(String cityName);
}
