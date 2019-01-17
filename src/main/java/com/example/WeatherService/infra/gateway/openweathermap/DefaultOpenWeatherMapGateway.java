package com.example.WeatherService.infra.gateway.openweathermap;

import com.example.WeatherService.core.dto.WeatherDto;
import com.example.WeatherService.infra.connection.openweathermap.OpenWeatherMapConnection;
import com.example.WeatherService.infra.dto.openweathermap.OpenWeatherMapResponseDTO;
import com.example.WeatherService.infra.dto.openweathermap.WeatherDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DefaultOpenWeatherMapGateway implements OpenWeatherMapGateway{

    private static final String WEATHER_DELIMETER = "/";

    OpenWeatherMapConnection openWeatherMapConnection;

    @Autowired
    public DefaultOpenWeatherMapGateway(OpenWeatherMapConnection openWeatherMapConnection) {
        this.openWeatherMapConnection = openWeatherMapConnection;
    }

    @Override
    public WeatherDto getWeatherByCityName(String cityName) {
        WeatherDto weatherDto = new WeatherDto();
        OpenWeatherMapResponseDTO weatherByCityName = openWeatherMapConnection.getWeatherByCityName(cityName);
        weatherDto.setLocation(weatherByCityName.getName());
        weatherDto.setWeather(getWeather(weatherByCityName.getWeather()));
        weatherDto.setTemperature(weatherByCityName.getMain().getTemp());
        return weatherDto;
    }

    private String getWeather(List<WeatherDTO> weatherDTOList) {
        String weather = "";
        for (WeatherDTO weatherDTO : weatherDTOList) {
            weather+=weatherDTO.getDescription() + WEATHER_DELIMETER;
        }
        return weather.substring(0,weather.length()-1);
    }
}
