package com.example.telemedicineSystem.utils;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeConverter {
    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static final DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("HH:mm:ss");

    public static String dateFormatToString(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().format(DATE_FORMAT);
    }

    public static String timeFormatToString(LocalTime time) {
        if(time != null){
            return time.format(TIME_FORMAT);
        } else{
            return "";
        }
    }

    public static Date stringToDateFormat(String date) {
        LocalDate localDate = LocalDate.parse(date, DATE_FORMAT);
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    public static LocalTime stringToTimeFormat(String time) {
        return LocalTime.parse(time, TIME_FORMAT);
    }
}
