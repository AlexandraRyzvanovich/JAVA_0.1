package com.epam.oop.tariffModule;

public enum  Regions {
    ASIA("Asia"), EUROPE("Europe"), AMERICA("America");

    Regions() {
    }

    Regions(String region) {
    }

    @Override
    public String toString() {
        return Regions.AMERICA.name()+ ", " +
                Regions.ASIA.name() + ", " +
                Regions.EUROPE.name();
    }
}
