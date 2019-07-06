package com.capinfo.dcxm.dmonitor.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "CAP_OBTAIN_RECORD")
public class CapObtainRecord {
    private String id;
    private Integer count;
    private Timestamp createTime;
    private String dispatchUnit;
    private String dispatchUnitName;
    private Timestamp obtainTime;

    @Id
    @Column(name = "ID", nullable = false, length = 20)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "COUNT", nullable = true, precision = 0)
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Basic
    @Column(name = "CREATE_TIME", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "DISPATCH_UNIT", nullable = true, length = 20)
    public String getDispatchUnit() {
        return dispatchUnit;
    }

    public void setDispatchUnit(String dispatchUnit) {
        this.dispatchUnit = dispatchUnit;
    }

    @Basic
    @Column(name = "DISPATCH_UNIT_NAME", nullable = true, length = 20)
    public String getDispatchUnitName() {
        return dispatchUnitName;
    }

    public void setDispatchUnitName(String dispatchUnitName) {
        this.dispatchUnitName = dispatchUnitName;
    }

    @Basic
    @Column(name = "OBTAIN_TIME", nullable = true)
    public Timestamp getObtainTime() {
        return obtainTime;
    }

    public void setObtainTime(Timestamp obtainTime) {
        this.obtainTime = obtainTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CapObtainRecord that = (CapObtainRecord) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(count, that.count) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(dispatchUnit, that.dispatchUnit) &&
                Objects.equals(dispatchUnitName, that.dispatchUnitName) &&
                Objects.equals(obtainTime, that.obtainTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, count, createTime, dispatchUnit, dispatchUnitName, obtainTime);
    }
}
