package com.epam.oop.tarifInfo;

import com.epam.oop.tariffModules.TVModule;

public class ProTariff extends Tariff {
    private long staticIp;
    private TVModule tvModule;

    public long getStaticIp() {
        return staticIp;
    }

    public void setStaticIp(long staticIp) {
        this.staticIp = staticIp;
    }

    public TVModule getTvModule() {
        return tvModule;
    }

    public void setTvModule(TVModule tvModule) {
        this.tvModule = tvModule;
    }
}
