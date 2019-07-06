package com.capinfo.dcxm.dmonitor.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "CAP_NOTICE_YERSSW", schema = "HOLLYCC", catalog = "")
public class CapNoticeYerssw {
    private String capNoticeId;
    private String a5NoticeInfoTypeId;
    private String a5ProcessInfoId;
    private String a5ProcessState;
    private String deadLine;
    private String deadLineTime;
    private String finishTime;
    private String isInTime;
    private String noticeId;
    private String orderId;
    private String reason;
    private String recordId;
    private String relay;
    private String isSend;
    private Integer sendTimes;

    @Id
    @Column(name = "CAP_NOTICE_ID", nullable = false, length = 20)
    public String getCapNoticeId() {
        return capNoticeId;
    }

    public void setCapNoticeId(String capNoticeId) {
        this.capNoticeId = capNoticeId;
    }

    @Basic
    @Column(name = "A5_NOTICE_INFO_TYPE_ID", nullable = true, length = 20)
    public String getA5NoticeInfoTypeId() {
        return a5NoticeInfoTypeId;
    }

    public void setA5NoticeInfoTypeId(String a5NoticeInfoTypeId) {
        this.a5NoticeInfoTypeId = a5NoticeInfoTypeId;
    }

    @Basic
    @Column(name = "A5_PROCESS_INFO_ID", nullable = true, length = 20)
    public String getA5ProcessInfoId() {
        return a5ProcessInfoId;
    }

    public void setA5ProcessInfoId(String a5ProcessInfoId) {
        this.a5ProcessInfoId = a5ProcessInfoId;
    }

    @Basic
    @Column(name = "A5PROCESS_STATE", nullable = true, length = 20)
    public String getA5ProcessState() {
        return a5ProcessState;
    }

    public void setA5ProcessState(String a5ProcessState) {
        this.a5ProcessState = a5ProcessState;
    }

    @Basic
    @Column(name = "DEAD_LINE", nullable = true, length = 20)
    public String getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(String deadLine) {
        this.deadLine = deadLine;
    }

    @Basic
    @Column(name = "DEAD_LINE_TIME", nullable = true, length = 20)
    public String getDeadLineTime() {
        return deadLineTime;
    }

    public void setDeadLineTime(String deadLineTime) {
        this.deadLineTime = deadLineTime;
    }

    @Basic
    @Column(name = "FINISH_TIME", nullable = true, length = 20)
    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    @Basic
    @Column(name = "IS_IN_TIME", nullable = true, length = 20)
    public String getIsInTime() {
        return isInTime;
    }

    public void setIsInTime(String isInTime) {
        this.isInTime = isInTime;
    }

    @Basic
    @Column(name = "NOTICE_ID", nullable = true, length = 20)
    public String getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(String noticeId) {
        this.noticeId = noticeId;
    }

    @Basic
    @Column(name = "ORDER_ID", nullable = true, length = 20)
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "REASON", nullable = true, length = 500)
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Basic
    @Column(name = "RECORD_ID", nullable = true, length = 20)
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    @Basic
    @Column(name = "RELAY", nullable = true, length = 20)
    public String getRelay() {
        return relay;
    }

    public void setRelay(String relay) {
        this.relay = relay;
    }

    @Basic
    @Column(name = "IS_SEND", nullable = true, length = 1)
    public String getIsSend() {
        return isSend;
    }

    public void setIsSend(String isSend) {
        this.isSend = isSend;
    }

    @Basic
    @Column(name = "SEND_TIMES", nullable = true, precision = 0)
    public Integer getSendTimes() {
        return sendTimes;
    }

    public void setSendTimes(Integer sendTimes) {
        this.sendTimes = sendTimes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CapNoticeYerssw that = (CapNoticeYerssw) o;
        return Objects.equals(capNoticeId, that.capNoticeId) &&
                Objects.equals(a5NoticeInfoTypeId, that.a5NoticeInfoTypeId) &&
                Objects.equals(a5ProcessInfoId, that.a5ProcessInfoId) &&
                Objects.equals(a5ProcessState, that.a5ProcessState) &&
                Objects.equals(deadLine, that.deadLine) &&
                Objects.equals(deadLineTime, that.deadLineTime) &&
                Objects.equals(finishTime, that.finishTime) &&
                Objects.equals(isInTime, that.isInTime) &&
                Objects.equals(noticeId, that.noticeId) &&
                Objects.equals(orderId, that.orderId) &&
                Objects.equals(reason, that.reason) &&
                Objects.equals(recordId, that.recordId) &&
                Objects.equals(relay, that.relay) &&
                Objects.equals(isSend, that.isSend) &&
                Objects.equals(sendTimes, that.sendTimes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capNoticeId, a5NoticeInfoTypeId, a5ProcessInfoId, a5ProcessState, deadLine, deadLineTime, finishTime, isInTime, noticeId, orderId, reason, recordId, relay, isSend, sendTimes);
    }
}
