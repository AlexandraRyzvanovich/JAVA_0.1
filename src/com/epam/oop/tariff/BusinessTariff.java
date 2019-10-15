package com.epam.oop.tariff;

public class BusinessTariff extends Tariff {
    private InternetPackage internet;
    private int corporationSize;

    public BusinessTariff() { }

    public BusinessTariff(String name, double subscriptionFee, CallerPackage callerPackage,
                          String description, int clientsCount, InternetPackage internet, int corporationSize ) {
        super(name, subscriptionFee, callerPackage, description, clientsCount);
        this.internet = internet;
        this.corporationSize = corporationSize;
    }

    public InternetPackage getInternet() {
        return internet;
    }

    public int getCorporationSize() {
        return corporationSize;
    }

    @Override
    public String toString() {
        return super.toString() +
                "internet=" + internet +
                "corporation size =" + corporationSize +
                '}';
    }
}
