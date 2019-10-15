package com.epam.oop.tariff;

public class ProTariff extends Tariff {
    private TVPackage tvPackage;
    private InternetPackage internet;

    public ProTariff() { }

    public ProTariff(String name, double subscriptionFee, CallerPackage callerPackage,
                     String description, int clientsCount, TVPackage tvPackage, InternetPackage internet) {
        super(name, subscriptionFee, callerPackage, description, clientsCount);
        this.tvPackage = tvPackage;
        this.internet = internet;
    }

    public TVPackage getTvPackage() {
        return tvPackage;
    }

    public InternetPackage getInternet() {
        return internet;
    }

    @Override
    public String toString() {
        return super.toString() +
                "tvPackage=" + tvPackage +
                '}';
    }
}
