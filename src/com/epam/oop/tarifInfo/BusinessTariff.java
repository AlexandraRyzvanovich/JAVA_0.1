package com.epam.oop.tarifInfo;

import com.epam.oop.tariffModule.CallerPackage;
import com.epam.oop.tariffModule.InternetPackage;

public class BusinessTariff extends Tariff {
    private String name = "Business";
    private double subscriptionFee = 200;
    private String description = "Business tariff is for people who like to talk" +
            " and watch TV";
    private InternetPackage internet;

    public BusinessTariff(CallerPackage callerPackage, InternetPackage internet) {
        super(callerPackage);
        this.internet = internet;
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
                "internet=" + internet +
                '}';
    }
}
