package com.example.demo.utils;

import java.util.Calendar;

/**
 * @author:yangtao
 * @date:2019/5/16
 * @description:
 */
public class DateMillisecond {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2019, 5, 15, 0, 0, 0);
        System.out.println("换算的毫秒值为"+calendar.getTimeInMillis());
    }
}
