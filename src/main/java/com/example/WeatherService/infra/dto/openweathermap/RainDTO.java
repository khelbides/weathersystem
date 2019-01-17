package com.example.WeatherService.infra.dto.openweathermap;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RainDTO {

    @Override
    public String toString() {
        return "RainDTO{" +
                "_3h='" + _3h + '\'' +
                '}';
    }

    public String get_3h() {
        return _3h;
    }

    public void set_3h(String _3h) {
        this._3h = _3h;
    }

    @JsonProperty(value = "3h")
    String _3h;
}
