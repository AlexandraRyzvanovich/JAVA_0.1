package com.epam.oop.tarifInfo;

import com.epam.oop.tariffModules.UserType;

public class BusinessTariff extends Tariff {
    private String name = "BusinessTariff";
    private UserType userType = UserType.ENTITY;
    private int discount;



    public String getName(){
        return this.name;
    }

    public UserType getUserType(){
        return this.userType;
    }







}
