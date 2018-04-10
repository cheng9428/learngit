package com.example.yly.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class County
{
    @SerializedName("id")
    public String countId;

    @SerializedName("name")
    public String countyName;

    @SerializedName("weather_id")
    public String weatherId;
}
