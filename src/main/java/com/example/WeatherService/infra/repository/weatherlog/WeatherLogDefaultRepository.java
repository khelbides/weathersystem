package com.example.WeatherService.infra.repository.weatherlog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherLogDefaultRepository extends JpaRepository<WeatherLogEntity, Long>{

    long countByLocationAndTemperatureAndActualWeather(String location, String temperature, String weather);

    WeatherLogEntity findFirstByLocationOrderByTimeInsertedAsc(String location);

    long countByLocation(String location);
}
