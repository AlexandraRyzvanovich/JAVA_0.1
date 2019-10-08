package com.epam.oop.tarifInfo;

import com.epam.oop.tariffModules.InternetModule;
import com.epam.oop.tariffModules.UserType;

public class Tariff {
    private String name;
    private UserType userType;
    private int discount;
    private double price;
    private InternetModule internetModule;
    private boolean roaming;



    public UserType getUserType(){
        return userType ;
    }

    public String getName() {
        return name;
    }
}
