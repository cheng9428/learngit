package com.example.yly.util;

import android.text.TextUtils;

import com.example.yly.gson.County;
import com.example.yly.gson.Weather;
import com.example.yly.mainActivity;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Utility
{
    /**
     * 解析和处理服务器返回的县级数据
     */
    public static County handleCountyResponse(String response, String county)
    {

        if (!TextUtils.isEmpty(response))
        {
            try
            {
                JSONArray allCounties = new JSONArray(response);

                for (int i = 0; i < allCounties.length(); i++)
                {
                    JSONObject countyObject = allCounties.getJSONObject(i);
                    if(countyObject.getString("name").equals(county))
                    {
                        String countyContent = countyObject.toString();
                        return new Gson().fromJson(countyContent, County.class);
                    }
                }

                //如果没有搜索到对应的区，返回第一个区
                JSONObject countyObject = allCounties.getJSONObject(0);
                String countyContent = countyObject.toString();
                return new Gson().fromJson(countyContent, County.class);

            } catch (JSONException e) { e.printStackTrace();}
        }

        return null;
    }


    public static Weather handleWeatherResponse(String response)
    {
        try
        {
            JSONObject jsonObject = new JSONObject(response);
            JSONArray  jsonArray  = jsonObject.getJSONArray("HeWeather");
            String weatherContent = jsonArray.getJSONObject(0).toString();
            return new Gson().fromJson(weatherContent, Weather.class);
        }
        catch (Exception e){e.printStackTrace();}

        return null;
    }

}

