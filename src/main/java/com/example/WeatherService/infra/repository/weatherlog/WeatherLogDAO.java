package com.example.WeatherService.infra.repository.weatherlog;

import com.example.WeatherService.core.dto.WeatherDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.UUID;

@Component
public class WeatherLogDAO {

    WeatherLogDefaultRepository weatherLogDefaultRepository;

    @Autowired
    public WeatherLogDAO(WeatherLogDefaultRepository weatherLogDefaultRepository) {
        this.weatherLogDefaultRepository = weatherLogDefaultRepository;
    }

    public void saveWeatherInfo(WeatherDto weatherDto)
    {
        WeatherLogEntity entity = convertToEntity(weatherDto);
        weatherLogDefaultRepository.save(entity);
    }

    public void saveUniqueWeatherInfo(WeatherDto dto) {
        String weather = dto.getWeather();
        String temperature = dto.getTemperature();
        String location = dto.getLocation();

        WeatherLogEntity entity = weatherLogDefaultRepository.findFirstByLocationOrderByTimeInsertedAsc(location);
        entity.setResponseId(UUID.randomUUID().toString());
        entity.setLocation(location);
        entity.setActualWeather(weather);
        entity.setTemperature(temperature);
        entity.setTimeInserted(LocalDateTime.now());
        weatherLogDefaultRepository.save(entity);
    }

    private WeatherLogEntity convertToEntity(WeatherDto weatherDto) {
        WeatherLogEntity entity = new WeatherLogEntity();
        entity.setLocation(weatherDto.getLocation());
        entity.setActualWeather(weatherDto.getWeather());
        entity.setTemperature(weatherDto.getTemperature());
        entity.setTimeInserted(LocalDateTime.now());
        entity.setResponseId( UUID.randomUUID().toString());
        return entity;
    }

    public long countByLocationAndTemperatureAndWeather(String location, String temperature, String weather) {
        return weatherLogDefaultRepository.countByLocationAndTemperatureAndActualWeather(location,temperature,weather);
    }

    public long countByLocation(String location) {
        return weatherLogDefaultRepository.countByLocation(location);
    }
}
