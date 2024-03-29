package com.epam.oop.entity;

public enum InternetPackage {
    UNLIMITED("Unlimited"), LIMITED("Limited");
    private final String packageName;

    InternetPackage(String packageName) {
        this.packageName = packageName;
    }

    public String getPackageName() {
        return packageName;
    }

}
