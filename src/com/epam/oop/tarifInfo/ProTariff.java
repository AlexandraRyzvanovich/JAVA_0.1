package com.epam.oop.tarifInfo;

import com.epam.oop.tariffModule.CallerPackage;
import com.epam.oop.tariffModule.InternetPackage;
import com.epam.oop.tariffModule.TVPackage;

public class ProTariff extends Tariff {
    private String name = "PRO";
    private String description = "PRO tariff is for people who like to talk" +
            " and watch TV";
    private TVPackage tvPackage;
    private InternetPackage internet;

    public ProTariff(CallerPackage callerPackage, double subscriptionFee, InternetPackage internet, TVPackage tvPackage) {
        super(callerPackage, subscriptionFee);
        this.internet = internet;
        this.tvPackage = tvPackage;
    }

    @Override
    public void setName(String name) {
        this.name = name;
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

    public InternetPackage getInternet() {
        return internet;
    }

    public void setInternet(InternetPackage internet) {
        this.internet = internet;
    }
    @Override
    public String toString() {
        return super.toString() +
                "tvPackage=" + tvPackage +
                '}';
    }
}
