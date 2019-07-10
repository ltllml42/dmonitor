package com.capinfo.dcxm.dmonitor.enums;

public enum NoticeInfoTypeEnum {

    TYPE1("NA5-1","同意结案"),
    TYPE2("NA5-2","不同意结案"),
    TYPE3("NA5-3","同意回退"),
    TYPE4("NA5-4","不同意回退"),
    TYPE5("NA5-5","同意延期"),
    TYPE6("NA5-6","不同意延期");

    NoticeInfoTypeEnum(String noticeInfoType, String remarks) {
        this.noticeInfoType = noticeInfoType;
        this.remarks = remarks;
    }

    private String noticeInfoType;

    private String remarks;

    public String getNoticeInfoType() {
        return noticeInfoType;
    }

    public void setNoticeInfoType(String noticeInfoType) {
        this.noticeInfoType = noticeInfoType;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
