package com.epam.oop.tarifInfo;

import com.epam.oop.tariffModules.InternetPackage;
import com.epam.oop.tariffModules.MinutesPackage;

public class Tariff {

    private double price;
    private InternetPackage internet;
    private MinutesPackage minutesPackage;
    private String manager;
    private static int counter;

    public Tariff(){};

    public Tariff(double price, InternetPackage internet, MinutesPackage minutesPackage, String manager) {
        this.price = price;
        this.internet = internet;
        this.minutesPackage = minutesPackage;
        this.manager = manager;
    }

    public double getPrice() {
        return price;
    }

    public InternetPackage getInternet() {
        return internet;
    }

    public MinutesPackage getMinutesPackage() {
        return minutesPackage;
    }

    public String getManager() {
        return manager;
    }

    public static void setCounter(int counter) {
        Tariff.counter = counter;
    }

    public int getCounter() {
        return counter;
    }
}