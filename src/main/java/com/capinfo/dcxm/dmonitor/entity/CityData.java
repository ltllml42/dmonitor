package com.capinfo.dcxm.dmonitor.entity;

import java.util.ArrayList;
import java.util.List;

public class CityData {
    private List<DataInfo> info=new ArrayList<>();

    public List<DataInfo> getInfo() {
        return info;
    }

    public void setInfo(List<DataInfo> info) {
        this.info = info;
    }
}
