package com.epam.oop.tariff;

public enum TVPackage {
    MOBILE_TV("Mobile TV"), SATELLITE_TV("Satellite TV"), DIGITAL_TV("Digital TV");
    String packageName;

    TVPackage(String packageName) {
        this.packageName = packageName;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
