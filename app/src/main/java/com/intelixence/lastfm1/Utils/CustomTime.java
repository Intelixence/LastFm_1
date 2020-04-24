package com.intelixence.lastfm1.Utils;

public class CustomTime {

    public static String minutes_seconds(int seconds){
        long long_minutes = seconds/60;
        int int_seconds = seconds%60;
        return long_minutes+":"+int_seconds;
    }
}
