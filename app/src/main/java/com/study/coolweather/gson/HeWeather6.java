package com.study.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HeWeather6 {

    public Basic basic;
    public Update update;
    public String status;
    public Now now;
    public AirNowCity air_now_city;

    @SerializedName("lifestyle")
    public List<Lifestyle> lifestyleList;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
