package com.epam.oop.tariff;

public enum  Regions {
    ASIA("Asia"), EUROPE("Europe"), AMERICA("America");
    String region;

    Regions(String region) {
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    @Override
    public String toString() {
        return Regions.AMERICA.name()+ ", " +
                Regions.ASIA.name() + ", " +
                Regions.EUROPE.name();
    }
}
