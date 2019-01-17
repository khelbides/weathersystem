package com.example.WeatherService.core.service;

import com.example.WeatherService.core.dto.WeatherDto;
import com.example.WeatherService.infra.gateway.openweathermap.OpenWeatherMapGateway;
import com.example.WeatherService.infra.repository.weatherlog.WeatherLogDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class WeatherServiceImpl implements  WeatherService{

    private static final int MAX_ENTRY = 5;
    private OpenWeatherMapGateway openWeatherMapGateway;
    private WeatherLogDAO weatherLogDAO;

    @Autowired
    public WeatherServiceImpl(OpenWeatherMapGateway openWeatherMapGateway, WeatherLogDAO weatherLogDAO) {
        this.openWeatherMapGateway = openWeatherMapGateway;
        this.weatherLogDAO = weatherLogDAO;
    }

    @Override
    public WeatherDto getWeatherInfoByCityName(String cityName) {
        return openWeatherMapGateway.getWeatherByCityName(cityName);
    }

    @Override
    public List<WeatherDto> getWeatherInfoByCityNames(List<String> cityNameList) {
        return cityNameList.stream().map(this::getWeatherInfoByCityName).collect(Collectors.toList());
    }

    @Override
    public List<WeatherDto> getWeatherInfoOfLondonPragueSanFrancisco() {
        List<String> cityNames = new ArrayList<>(Arrays.asList("London", "Prague", "San Francisco"));
        List<WeatherDto> weatherDtoList = getWeatherInfoByCityNames(cityNames);
        weatherDtoList.forEach(this::saveWeatherInfo);

        return weatherDtoList;
    }

    private void saveWeatherInfo(WeatherDto dto) {
        String location = dto.getLocation();
        String temperature = dto.getTemperature();
        String weather = dto.getWeather();

        if( weatherLogDAO.countByLocation(location) < MAX_ENTRY)
            weatherLogDAO.saveWeatherInfo(dto);
        else if( weatherLogDAO.countByLocationAndTemperatureAndWeather(location, temperature, weather) < 1 )
            weatherLogDAO.saveUniqueWeatherInfo(dto);
    }
}
