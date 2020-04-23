package com.intelixence.lastfm1.Utils;

public class CustomTime {

    public static String minutes_seconds(int miliseconds){
        long minutes = (miliseconds / 1000)  / 60;
        int seconds = (int)((miliseconds / 1000) % 60);
        return minutes+":"+seconds;
    }
}
