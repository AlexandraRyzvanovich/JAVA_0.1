package com.epam.oop.tariff;

public class ClassicTariff extends Tariff {
    private int smsCount;

    public ClassicTariff(String name, double subscriptionFee, CallerPackage callerPackage,
                         String description, int clientsCount, int smsCount) {
        super(name, subscriptionFee, callerPackage, description, clientsCount);
        this.smsCount = smsCount;
    }

    public int getSmsCount() {
        return smsCount;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", smsCount=" + smsCount +
                '}';
    }
}
