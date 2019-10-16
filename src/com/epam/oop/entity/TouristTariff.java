package com.epam.oop.entity;

public class TouristTariff extends Tariff {
    private Regions regions;

    public TouristTariff() { }

    public TouristTariff(String name, double subscriptionFee, CallerPackage callerPackage,
                         String description, int clientsCount, Regions regions) {
        super(name, subscriptionFee, callerPackage, description, clientsCount);
        this.regions = regions;
    }

    public Regions getRegions() {
        return regions;
    }

    @Override
    public String toString() {
        return super.toString() +
                "regions='" + regions + '\'' +
                '}';
    }
}
