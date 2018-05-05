package com.helloweather.abdullah.helloweather.Common;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Common {

    public static String API_KEY = "508589a5c9041f60db25e2c258252525";
    public static String API_LINK = "http://api.openweathermap.org/data/2.5/weather";

    public static String apiRequest(String lat, String lng){
        StringBuilder ab = new StringBuilder(API_LINK);
        ab.append(String.format("?lat=%s&lon=%s&APPID=%s&units=metrics",lat,lng,API_KEY));
        return ab.toString();

    }

    public static String unixTimeStampToDateTime(double unixTimeStamp){

        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        date.setTime((long)unixTimeStamp*1000);
        return dateFormat.format(date);
    }

    public static String getImage(String icon)    {

        return String.format("http://openweathermap.org/img/w/" + icon + ".png");
    }

    public static String getDateNow(){

        DateFormat dateFormat = new SimpleDateFormat("DD MMMM yyyy HH:mm");
        Date date = new Date();
        return dateFormat.format(date);
    }

}
