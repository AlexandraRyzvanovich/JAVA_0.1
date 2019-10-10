package com.epam.oop.tariffModule;

public enum InternetPackage {
    UNLIMITED("Unlimited"), LIMITED("Limited"), UNLIMITED_4G("Unlimited 4G");

    InternetPackage(String s) {
    }

    @Override
    public String toString() {
        return "InternetPackage{}";
    }

}
