package com.epam.oop.entity;

public enum TVPackage {
    MOBILE("Mobile"), SATELLITE("Satellite"), DIGITAL("Digital");
    private final String packageName;

    TVPackage(String packageName) {
        this.packageName = packageName;
    }

}
