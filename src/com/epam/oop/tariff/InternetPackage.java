package com.epam.oop.tariff;

public enum InternetPackage {
    UNLIMITED("Unlimited"), LIMITED("Limited"), UNLIMITED_4G("Unlimited 4G");
    String packageName;

    InternetPackage(String packageName) {
        this.packageName = packageName;
    }

    public String getPackageName() {
        return packageName;
    }
}
