package com.epam.oop.tariff;

public enum TVPackage {
    MOBILE("Mobile"), SATELLITE("Satellite"), DIGITAL("Digital");
    String packageName;

    TVPackage(String packageName) {
        this.packageName = packageName;
    }

}
