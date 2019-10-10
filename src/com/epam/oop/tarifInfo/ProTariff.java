package com.epam.oop.tarifInfo;

import com.epam.oop.tariffModules.TVPackage;

public class ProTariff extends Tariff {
    private long staticIp;
    private TVPackage tvPackage;

    public long getStaticIp() {
        return staticIp;
    }

    public void setStaticIp(long staticIp) {
        this.staticIp = staticIp;
    }

    public TVPackage getTvPackage() {
        return tvPackage;
    }

    public void setTvPackage(TVPackage tvPackage) {
        this.tvPackage = tvPackage;
    }
}
