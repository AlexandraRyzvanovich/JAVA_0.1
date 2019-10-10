package com.epam.oop.tarifInfo;

import com.epam.oop.tariffModule.CallerPackage;
import com.epam.oop.tariffModule.TVPackage;

public class ProTariff extends Tariff {
    private String name = "PRO";
    private double subscriptionFee = 100;
    private String description = "PRO tariff is for people who like to talk" +
            " and watch TV";
    private TVPackage tvPackage;

    public ProTariff(CallerPackage callerPackage, TVPackage tvPackage) {
        super(callerPackage);
        this.tvPackage = tvPackage;
    }

    @Override
    public void setName(String name) {
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

    public TVPackage getTvPackage() {
        return tvPackage;
    }

    public void setTvPackage(TVPackage tvPackage) {
        this.tvPackage = tvPackage;
    }

    @Override
    public String toString() {
        return super.toString() +
                "tvPackage=" + tvPackage +
                '}';
    }
}
