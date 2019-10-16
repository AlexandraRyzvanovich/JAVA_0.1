package com.epam.oop.tariff;

public class Tariff {
    private String name;
    private double subscriptionFee;
    private CallerPackage callerPackage;
    private String description;
    private int clientsCount;

    public Tariff() { }

    public Tariff(String name, double subscriptionFee, CallerPackage callerPackage, String description, int clientsCount) {
        this.name = name;
        this.subscriptionFee = subscriptionFee;
        this.callerPackage = callerPackage;
        this.description = description;
        this.clientsCount = clientsCount;
    }

    public String getName() {
        return name;
    }

    public double getSubscriptionFee() {
        return subscriptionFee;
    }

    public CallerPackage getCallerPackage() {
        return callerPackage;
    }

    public String getDescription() {
        return description;
    }

    public int getClientsCount() {
        return clientsCount;
    }

    @Override
    public String toString() {
        return "Tariff{" +
                "name= '" + name + '\'' +
                ", subscriptionFee= " + subscriptionFee +
                ", minutesPackage= " + callerPackage +
                ", description= '" + description +
                ", clients count= '" + description + '\'';
    }
}
