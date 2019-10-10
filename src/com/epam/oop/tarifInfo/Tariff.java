package com.epam.oop.tarifInfo;

import com.epam.oop.tariffModule.CallerPackage;

public class Tariff implements Comparable<Tariff>{
    private String name;
    private double subscriptionFee;
    private CallerPackage callerPackage;
    private String description;

    public Tariff(){};

    public Tariff(CallerPackage callerPackage) {
        this.callerPackage = callerPackage;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public double getSubscriptionFee() {
        return subscriptionFee;
    }

    protected void setSubscriptionFee(double subscriptionFee) {
        this.subscriptionFee = subscriptionFee;
    }

    public CallerPackage getCallerPackage() {
        return callerPackage;
    }

    public void setCallerPackage(CallerPackage callerPackage) {
        this.callerPackage = callerPackage;
    }

    public String getDescription() {
        return description;
    }

    protected void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Tariff{" +
                "name= '" + name + '\'' +
                ", subscriptionFee= " + subscriptionFee +
                ", minutesPackage= " + callerPackage +
                ", description= '" + description + '\''
                ;
    }

    @Override
    public int compareTo(Tariff x  ) {
        return (int)(this.subscriptionFee-x.getSubscriptionFee());
    }
}