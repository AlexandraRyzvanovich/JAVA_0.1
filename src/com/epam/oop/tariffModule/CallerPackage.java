package com.epam.oop.tariffModule;

import java.util.stream.Stream;

public enum CallerPackage {
    INTERNAL("Internal"), EXTERNAL("External"), ALL("All");
    private String packageName;

    CallerPackage(String packageName) {
        this.packageName = packageName;
    }

    public String getPackageName() {
        return packageName;
    }

    public boolean equalsValues(String value , boolean result){
        return true;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
