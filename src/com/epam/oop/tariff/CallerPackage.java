package com.epam.oop.tariff;

public enum CallerPackage {
    INTERNAL("Internal"), EXTERNAL("External"), FULL("Full");
    private String packageName;

    CallerPackage(String packageName) {
        this.packageName = packageName;
    }

    public String getPackageName() {
        return packageName;
    }

}