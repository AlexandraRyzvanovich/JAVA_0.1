package com.epam.oop.entity;

public enum CallerPackage {
    INTERNAL("Internal"), EXTERNAL("External"), FULL("Full");
    private final String packageName;

    CallerPackage(String packageName) {
        this.packageName = packageName;
    }

}
