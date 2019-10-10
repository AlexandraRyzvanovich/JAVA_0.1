package com.epam.oop.tarifInfo;

import com.epam.oop.tariffModule.CallerPackage;
import com.epam.oop.tariffModule.Regions;

public class TouristTariff extends Tariff {
    private String name = "Tourist";
    private double subscriptionFee = 500;
    private String description = "Tourist tariff is for people who like to travel";

    private String regions = Regions.values().toString();

    public TouristTariff(CallerPackage callerPackage) {
        super(callerPackage);
    }

    @Override
    protected void setName(String name) {
        this.name = name;
    }

    @Override
    protected void setSubscriptionFee(double subscriptionFee) {
        this.subscriptionFee = subscriptionFee;
    }

    @Override
    protected void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return super.toString() +
                "regions='" + regions + '\'' +
                '}';
    }
}
