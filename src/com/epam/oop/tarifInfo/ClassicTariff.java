package com.epam.oop.tarifInfo;

import com.epam.oop.tariffModule.CallerPackage;

public class ClassicTariff extends Tariff {
    private String name = "Classic";
    private double subscriptionFee = 50;
    private String description = "Classic tariff is for people who like to talk" +
                                                         " and funds are limited";
    private int smsCount;

    public ClassicTariff(CallerPackage callerPackage, int smsCount) {
        super(callerPackage);
        this.smsCount = smsCount;
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

    public int getSmsCount() {
        return smsCount;
    }

    public void setSmsCount(int freeSMS) {
        this.smsCount = freeSMS;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", smsCount=" + smsCount +
                '}';
    }
}
