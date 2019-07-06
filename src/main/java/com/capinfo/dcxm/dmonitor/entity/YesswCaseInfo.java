package com.capinfo.dcxm.dmonitor.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "YESSW_CASE_INFO")
public class YesswCaseInfo {

    private String id;
    private String yesswNumber;
    private String yesswCreatetime;
    private String yesswSendarea;
    private String yesswStatus;
    private String recordNumber;
    private String recordCreatetime;
    private String recordStatus;
    private String recordTaskStatus;
    private String cityNumber;
    private String cityStatus;
    private String createTime;
    private String content;
    private String recordDeadtime;

    //查询条件  案件时间起
    private String yesswCreatetimeStart;
    //查询条件  案件时间止
    private String yesswCreatetimeEnd;




    @Id
    @Column(name = "id", nullable = false, length = 64)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "yessw_number", nullable = true, length = 100)
    public String getYesswNumber() {
        return yesswNumber;
    }

    public void setYesswNumber(String yesswNumber) {
        this.yesswNumber = yesswNumber;
    }

    @Basic
    @Column(name = "yessw_createtime", nullable = true)
    public String getYesswCreatetime() {
        return yesswCreatetime;
    }

    public void setYesswCreatetime(String yesswCreatetime) {
        this.yesswCreatetime = yesswCreatetime;
    }

    @Basic
    @Column(name = "yessw_sendarea", nullable = true, length = 100)
    public String getYesswSendarea() {
        return yesswSendarea;
    }

    public void setYesswSendarea(String yesswSendarea) {
        this.yesswSendarea = yesswSendarea;
    }

    @Basic
    @Column(name = "yessw_status", nullable = true, length = 50)
    public String getYesswStatus() {
        return yesswStatus;
    }

    public void setYesswStatus(String yesswStatus) {
        this.yesswStatus = yesswStatus;
    }

    @Basic
    @Column(name = "record_number", nullable = true, length = 100)
    public String getRecordNumber() {
        return recordNumber;
    }

    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }

    @Basic
    @Column(name = "record_createtime", nullable = true)
    public String getRecordCreatetime() {
        return recordCreatetime;
    }

    public void setRecordCreatetime(String recordCreatetime) {
        this.recordCreatetime = recordCreatetime;
    }

    @Basic
    @Column(name = "record_status", nullable = true, length = 50)
    public String getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus;
    }

    @Basic
    @Column(name = "record_task_status", nullable = true, length = 50)
    public String getRecordTaskStatus() {
        return recordTaskStatus;
    }

    public void setRecordTaskStatus(String recordTaskStatus) {
        this.recordTaskStatus = recordTaskStatus;
    }

    @Basic
    @Column(name = "record_deadtime", nullable = true)
    public String getRecordDeadtime() {
        return recordDeadtime;
    }

    public void setRecordDeadtime(String recordDeadtime) {
        this.recordDeadtime = recordDeadtime;
    }

    @Basic
    @Column(name = "city_number", nullable = true, length = 100)
    public String getCityNumber() {
        return cityNumber;
    }

    public void setCityNumber(String cityNumber) {
        this.cityNumber = cityNumber;
    }

    @Basic
    @Column(name = "city_status", nullable = true, length = 50)
    public String getCityStatus() {
        return cityStatus;
    }

    public void setCityStatus(String cityStatus) {
        this.cityStatus = cityStatus;
    }

    @Basic
    @Column(name = "create_time", nullable = true)
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "content", nullable = true)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Transient
    public String getYesswCreatetimeStart() {
        return yesswCreatetimeStart;
    }

    public void setYesswCreatetimeStart(String yesswCreatetimeStart) {
        this.yesswCreatetimeStart = yesswCreatetimeStart;
    }
    @Transient
    public String getYesswCreatetimeEnd() {
        return yesswCreatetimeEnd;
    }

    public void setYesswCreatetimeEnd(String yesswCreatetimeEnd) {
        this.yesswCreatetimeEnd = yesswCreatetimeEnd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        YesswCaseInfo that = (YesswCaseInfo) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(yesswNumber, that.yesswNumber) &&
                Objects.equals(yesswCreatetime, that.yesswCreatetime) &&
                Objects.equals(yesswSendarea, that.yesswSendarea) &&
                Objects.equals(yesswStatus, that.yesswStatus) &&
                Objects.equals(recordNumber, that.recordNumber) &&
                Objects.equals(recordCreatetime, that.recordCreatetime) &&
                Objects.equals(recordStatus, that.recordStatus) &&
                Objects.equals(cityNumber, that.cityNumber) &&
                Objects.equals(cityStatus, that.cityStatus) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, yesswNumber, yesswCreatetime, yesswSendarea, yesswStatus, recordNumber, recordCreatetime, recordStatus, cityNumber, cityStatus, createTime);
    }

}
