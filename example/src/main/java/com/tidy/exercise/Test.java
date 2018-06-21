package com.tidy.exercise;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Test {

    public static void main(String[] args) {

        Integer integer = new Integer(1);
        System.out.println("result:" + integer.equals(1));// true

        Date date = new Date();
        System.out.println(date + "," + date.getTime()); // ms数

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime:" + localDateTime);
        System.out.println("new:" + localDateTime.toLocalDate() + " " + localDateTime.toLocalTime());

        localDateTimeToUdate();
    }


    public static void localDateTimeToUdate() {
        System.out.println("----------");
        LocalDateTime localDateTime = LocalDateTime.now().withNano(0);
        System.out.println("LocalDateTime is:" + localDateTime);
        ZoneId zone = ZoneId.systemDefault();
        Instant instant = localDateTime.atZone(zone).toInstant();
        java.util.Date date = Date.from(instant);
        System.out.println("date is:" + date);//Wed Jun 13 16:27:06 CST 2018

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(date.toString(), formatter);

//        SimpleDateFormat sdm = new  SimpleDateFormat(LocalDateTimeUtils.LONG_DATE_FORMAT);
//
//        return LocalDateTime.parse(sdm.format(date), LocalDateTimeUtils.LONG_DATE_FORMATTER);


    }
}
