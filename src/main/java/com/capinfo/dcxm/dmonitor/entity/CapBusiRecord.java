package com.capinfo.dcxm.dmonitor.entity;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "CAP_BUSI_RECORD")
public class CapBusiRecord {
    private String recordId;
    private String serviceId;
    private String callid;
    private String customerName;
    private String fax;
    private String telephone;
    private String email;
    private String customerAddress;
    private String region;
    private String address;
    private String classCode;
    private String smallclass1;
    private String smallclass2;
    private String smallclass3;
    private String smallclass4;
    private String smallclass5;
    private String individaulAtt1;
    private String individaulAtt2;
    private String individaulAtt3;
    private String individaulAtt4;
    private String individaulAtt5;
    private Time overTime;
    private String miGridding;
    private String huGridding;
    private String callPhone;
    private String community;
    private Date gatheringTime;
    private String handlePlatform;
    private Time happenDate;
    private String infoGathering;
    private String sourceMethods;
    private String street;
    private String agentDn;
    private String processInstanceId;
    private String caseNumber;
    private String gridcode;
    private String griddingPerson;
    private String nowState;
    private String taskId;
    private String taskStatus;
    private String called;
    private String userId;
    private String recordType;
    private String sourceType;
    private String answerType;
    private String customerSex;
    private String isAnswer;
    private String isError;
    private String isHidden;
    private String isOver;
    private String isRemind;
    private String isSupervise;
    private String isVisible;
    private String isVisit;
    private String urgencyGrade;
    private String dispatchDept;
    private String recordNumber;
    private String coordX;
    private String coordY;
    private String coordZ;
    private String dispatchId;
    private String overId;
    private String processId;
    private String reviewId;
    private String citygridcode;
    private String communityName;
    private String sociologygridcode;
    private String streetName;
    private String deptName;
    private String feedId;
    private String addressname;
    private String classLinkId;
    private String infoGatheringId;
    private String disparchId;
    private String componentCentreId;
    private String handlingSuggestion;
    private String nowComponentCentre;
    private String assigneeName;
    private String orderType;
    private String infoId;
    private String limitTime;
    private String tempsuggestion;
    private Date deadLineTime;
    private String yesswOrderId;
    private String yesswOrderState;
    private String yesswClaimUser;
    private String cjslClaimUser;
    private String zfhfLetTitle;
    private String yesswBoHuiClaimUserId;
    private String contactInfo;
    private String probDesc;
    private String lanePhone;
    private String uplane;
    private String laneCode;
    private String huituiContent;
    private String yesswBoHuiReason;
    private String isComplain;
    private Time pushTime;
    private String sendStatus;
    private String processPerson;
    private String appTypeId;
    private String cellName;
    private String laTitude;
    private String longTitude;
    private String publicOpinionContent;
    private String ublicOpinionContent;
    private String probSort;
    private String isWebSend;
    private String dispatchUnit;
    private String orderUnitid;
    private String orderunitid;
    private String dispatchUnitName;
    private String yessStartTime;

    @Id
    @Column(name = "RECORD_ID", nullable = false, length = 20)
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    @Basic
    @Column(name = "SERVICE_ID", nullable = true, length = 20)
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    @Basic
    @Column(name = "CALLID", nullable = true, length = 20)
    public String getCallid() {
        return callid;
    }

    public void setCallid(String callid) {
        this.callid = callid;
    }

    @Basic
    @Column(name = "CUSTOMER_NAME", nullable = true, length = 500)
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Basic
    @Column(name = "FAX", nullable = true, length = 20)
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Basic
    @Column(name = "TELEPHONE", nullable = true, length = 100)
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Basic
    @Column(name = "EMAIL", nullable = true, length = 100)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "CUSTOMER_ADDRESS", nullable = true, length = 500)
    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    @Basic
    @Column(name = "REGION", nullable = true, length = 100)
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Basic
    @Column(name = "ADDRESS", nullable = true, length = 400)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "CLASS_CODE", nullable = true, length = 100)
    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    @Basic
    @Column(name = "SMALLCLASS1", nullable = true, length = 100)
    public String getSmallclass1() {
        return smallclass1;
    }

    public void setSmallclass1(String smallclass1) {
        this.smallclass1 = smallclass1;
    }

    @Basic
    @Column(name = "SMALLCLASS2", nullable = true, length = 100)
    public String getSmallclass2() {
        return smallclass2;
    }

    public void setSmallclass2(String smallclass2) {
        this.smallclass2 = smallclass2;
    }

    @Basic
    @Column(name = "SMALLCLASS3", nullable = true, length = 100)
    public String getSmallclass3() {
        return smallclass3;
    }

    public void setSmallclass3(String smallclass3) {
        this.smallclass3 = smallclass3;
    }

    @Basic
    @Column(name = "SMALLCLASS4", nullable = true, length = 100)
    public String getSmallclass4() {
        return smallclass4;
    }

    public void setSmallclass4(String smallclass4) {
        this.smallclass4 = smallclass4;
    }

    @Basic
    @Column(name = "SMALLCLASS5", nullable = true, length = 100)
    public String getSmallclass5() {
        return smallclass5;
    }

    public void setSmallclass5(String smallclass5) {
        this.smallclass5 = smallclass5;
    }

    @Basic
    @Column(name = "INDIVIDAUL_ATT1", nullable = true, length = 1000)
    public String getIndividaulAtt1() {
        return individaulAtt1;
    }

    public void setIndividaulAtt1(String individaulAtt1) {
        this.individaulAtt1 = individaulAtt1;
    }

    @Basic
    @Column(name = "INDIVIDAUL_ATT2", nullable = true, length = 1000)
    public String getIndividaulAtt2() {
        return individaulAtt2;
    }

    public void setIndividaulAtt2(String individaulAtt2) {
        this.individaulAtt2 = individaulAtt2;
    }

    @Basic
    @Column(name = "INDIVIDAUL_ATT3", nullable = true, length = 1000)
    public String getIndividaulAtt3() {
        return individaulAtt3;
    }

    public void setIndividaulAtt3(String individaulAtt3) {
        this.individaulAtt3 = individaulAtt3;
    }

    @Basic
    @Column(name = "INDIVIDAUL_ATT4", nullable = true, length = 1000)
    public String getIndividaulAtt4() {
        return individaulAtt4;
    }

    public void setIndividaulAtt4(String individaulAtt4) {
        this.individaulAtt4 = individaulAtt4;
    }

    @Basic
    @Column(name = "INDIVIDAUL_ATT5", nullable = true, length = 1000)
    public String getIndividaulAtt5() {
        return individaulAtt5;
    }

    public void setIndividaulAtt5(String individaulAtt5) {
        this.individaulAtt5 = individaulAtt5;
    }

    @Basic
    @Column(name = "OVER_TIME", nullable = true)
    public Time getOverTime() {
        return overTime;
    }

    public void setOverTime(Time overTime) {
        this.overTime = overTime;
    }

    @Basic
    @Column(name = "MI_GRIDDING", nullable = true, length = 100)
    public String getMiGridding() {
        return miGridding;
    }

    public void setMiGridding(String miGridding) {
        this.miGridding = miGridding;
    }

    @Basic
    @Column(name = "HU_GRIDDING", nullable = true, length = 100)
    public String getHuGridding() {
        return huGridding;
    }

    public void setHuGridding(String huGridding) {
        this.huGridding = huGridding;
    }

    @Basic
    @Column(name = "CALL_PHONE", nullable = true, length = 100)
    public String getCallPhone() {
        return callPhone;
    }

    public void setCallPhone(String callPhone) {
        this.callPhone = callPhone;
    }

    @Basic
    @Column(name = "COMMUNITY", nullable = true, length = 50)
    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    @Basic
    @Column(name = "GATHERING_TIME", nullable = true)
    public Date getGatheringTime() {
        return gatheringTime;
    }

    public void setGatheringTime(Date gatheringTime) {
        this.gatheringTime = gatheringTime;
    }

    @Basic
    @Column(name = "HANDLE_PLATFORM", nullable = true, length = 30)
    public String getHandlePlatform() {
        return handlePlatform;
    }

    public void setHandlePlatform(String handlePlatform) {
        this.handlePlatform = handlePlatform;
    }

    @Basic
    @Column(name = "HAPPEN_DATE", nullable = true)
    public Time getHappenDate() {
        return happenDate;
    }

    public void setHappenDate(Time happenDate) {
        this.happenDate = happenDate;
    }

    @Basic
    @Column(name = "INFO_GATHERING", nullable = true, length = 50)
    public String getInfoGathering() {
        return infoGathering;
    }

    public void setInfoGathering(String infoGathering) {
        this.infoGathering = infoGathering;
    }

    @Basic
    @Column(name = "SOURCE_METHODS", nullable = true, length = 50)
    public String getSourceMethods() {
        return sourceMethods;
    }

    public void setSourceMethods(String sourceMethods) {
        this.sourceMethods = sourceMethods;
    }

    @Basic
    @Column(name = "STREET", nullable = true, length = 50)
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Basic
    @Column(name = "AGENT_DN", nullable = true, length = 50)
    public String getAgentDn() {
        return agentDn;
    }

    public void setAgentDn(String agentDn) {
        this.agentDn = agentDn;
    }

    @Basic
    @Column(name = "PROCESS_INSTANCE_ID", nullable = true, length = 255)
    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    @Basic
    @Column(name = "CASE_NUMBER", nullable = true, length = 50)
    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    @Basic
    @Column(name = "GRIDCODE", nullable = true, length = 50)
    public String getGridcode() {
        return gridcode;
    }

    public void setGridcode(String gridcode) {
        this.gridcode = gridcode;
    }

    @Basic
    @Column(name = "GRIDDING_PERSON", nullable = true, length = 50)
    public String getGriddingPerson() {
        return griddingPerson;
    }

    public void setGriddingPerson(String griddingPerson) {
        this.griddingPerson = griddingPerson;
    }

    @Basic
    @Column(name = "NOW_STATE", nullable = true, length = 50)
    public String getNowState() {
        return nowState;
    }

    public void setNowState(String nowState) {
        this.nowState = nowState;
    }

    @Basic
    @Column(name = "TASK_ID", nullable = true, length = 50)
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    @Basic
    @Column(name = "TASK_STATUS", nullable = true, length = 50)
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    @Basic
    @Column(name = "CALLED", nullable = true, length = 50)
    public String getCalled() {
        return called;
    }

    public void setCalled(String called) {
        this.called = called;
    }

    @Basic
    @Column(name = "USER_ID", nullable = true, length = 50)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "RECORD_TYPE", nullable = true, length = 50)
    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    @Basic
    @Column(name = "SOURCE_TYPE", nullable = true, length = 50)
    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    @Basic
    @Column(name = "ANSWER_TYPE", nullable = true, length = 50)
    public String getAnswerType() {
        return answerType;
    }

    public void setAnswerType(String answerType) {
        this.answerType = answerType;
    }

    @Basic
    @Column(name = "CUSTOMER_SEX", nullable = true, length = 50)
    public String getCustomerSex() {
        return customerSex;
    }

    public void setCustomerSex(String customerSex) {
        this.customerSex = customerSex;
    }

    @Basic
    @Column(name = "IS_ANSWER", nullable = true, length = 50)
    public String getIsAnswer() {
        return isAnswer;
    }

    public void setIsAnswer(String isAnswer) {
        this.isAnswer = isAnswer;
    }

    @Basic
    @Column(name = "IS_ERROR", nullable = true, length = 50)
    public String getIsError() {
        return isError;
    }

    public void setIsError(String isError) {
        this.isError = isError;
    }

    @Basic
    @Column(name = "IS_HIDDEN", nullable = true, length = 50)
    public String getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(String isHidden) {
        this.isHidden = isHidden;
    }

    @Basic
    @Column(name = "IS_OVER", nullable = true, length = 20)
    public String getIsOver() {
        return isOver;
    }

    public void setIsOver(String isOver) {
        this.isOver = isOver;
    }

    @Basic
    @Column(name = "IS_REMIND", nullable = true, length = 20)
    public String getIsRemind() {
        return isRemind;
    }

    public void setIsRemind(String isRemind) {
        this.isRemind = isRemind;
    }

    @Basic
    @Column(name = "IS_SUPERVISE", nullable = true, length = 20)
    public String getIsSupervise() {
        return isSupervise;
    }

    public void setIsSupervise(String isSupervise) {
        this.isSupervise = isSupervise;
    }

    @Basic
    @Column(name = "IS_VISIBLE", nullable = true, length = 20)
    public String getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(String isVisible) {
        this.isVisible = isVisible;
    }

    @Basic
    @Column(name = "IS_VISIT", nullable = true, length = 20)
    public String getIsVisit() {
        return isVisit;
    }

    public void setIsVisit(String isVisit) {
        this.isVisit = isVisit;
    }

    @Basic
    @Column(name = "URGENCY_GRADE", nullable = true, length = 20)
    public String getUrgencyGrade() {
        return urgencyGrade;
    }

    public void setUrgencyGrade(String urgencyGrade) {
        this.urgencyGrade = urgencyGrade;
    }

    @Basic
    @Column(name = "DISPATCH_DEPT", nullable = true, length = 50)
    public String getDispatchDept() {
        return dispatchDept;
    }

    public void setDispatchDept(String dispatchDept) {
        this.dispatchDept = dispatchDept;
    }

    @Basic
    @Column(name = "RECORD_NUMBER", nullable = true, length = 50)
    public String getRecordNumber() {
        return recordNumber;
    }

    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }

    @Basic
    @Column(name = "COORD_X", nullable = true, length = 100)
    public String getCoordX() {
        return coordX;
    }

    public void setCoordX(String coordX) {
        this.coordX = coordX;
    }

    @Basic
    @Column(name = "COORD_Y", nullable = true, length = 100)
    public String getCoordY() {
        return coordY;
    }

    public void setCoordY(String coordY) {
        this.coordY = coordY;
    }

    @Basic
    @Column(name = "COORD_Z", nullable = true, length = 100)
    public String getCoordZ() {
        return coordZ;
    }

    public void setCoordZ(String coordZ) {
        this.coordZ = coordZ;
    }

    @Basic
    @Column(name = "DISPATCH_ID", nullable = true, length = 20)
    public String getDispatchId() {
        return dispatchId;
    }

    public void setDispatchId(String dispatchId) {
        this.dispatchId = dispatchId;
    }

    @Basic
    @Column(name = "OVER_ID", nullable = true, length = 20)
    public String getOverId() {
        return overId;
    }

    public void setOverId(String overId) {
        this.overId = overId;
    }

    @Basic
    @Column(name = "PROCESS_ID", nullable = true, length = 20)
    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    @Basic
    @Column(name = "REVIEW_ID", nullable = true, length = 20)
    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId;
    }

    @Basic
    @Column(name = "CITYGRIDCODE", nullable = true, length = 50)
    public String getCitygridcode() {
        return citygridcode;
    }

    public void setCitygridcode(String citygridcode) {
        this.citygridcode = citygridcode;
    }

    @Basic
    @Column(name = "COMMUNITY_NAME", nullable = true, length = 500)
    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    @Basic
    @Column(name = "SOCIOLOGYGRIDCODE", nullable = true, length = 50)
    public String getSociologygridcode() {
        return sociologygridcode;
    }

    public void setSociologygridcode(String sociologygridcode) {
        this.sociologygridcode = sociologygridcode;
    }

    @Basic
    @Column(name = "STREET_NAME", nullable = true, length = 500)
    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    @Basic
    @Column(name = "DEPT_NAME", nullable = true, length = 50)
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Basic
    @Column(name = "FEED_ID", nullable = true, length = 20)
    public String getFeedId() {
        return feedId;
    }

    public void setFeedId(String feedId) {
        this.feedId = feedId;
    }

    @Basic
    @Column(name = "ADDRESSNAME", nullable = true, length = 400)
    public String getAddressname() {
        return addressname;
    }

    public void setAddressname(String addressname) {
        this.addressname = addressname;
    }

    @Basic
    @Column(name = "CLASS_LINK_ID", nullable = true, length = 100)
    public String getClassLinkId() {
        return classLinkId;
    }

    public void setClassLinkId(String classLinkId) {
        this.classLinkId = classLinkId;
    }

    @Basic
    @Column(name = "INFO_GATHERING_ID", nullable = true, length = 50)
    public String getInfoGatheringId() {
        return infoGatheringId;
    }

    public void setInfoGatheringId(String infoGatheringId) {
        this.infoGatheringId = infoGatheringId;
    }

    @Basic
    @Column(name = "DISPARCH_ID", nullable = true, length = 255)
    public String getDisparchId() {
        return disparchId;
    }

    public void setDisparchId(String disparchId) {
        this.disparchId = disparchId;
    }

    @Basic
    @Column(name = "COMPONENT_CENTRE_ID", nullable = true, length = 50)
    public String getComponentCentreId() {
        return componentCentreId;
    }

    public void setComponentCentreId(String componentCentreId) {
        this.componentCentreId = componentCentreId;
    }

    @Basic
    @Column(name = "HANDLING_SUGGESTION", nullable = true, length = 2000)
    public String getHandlingSuggestion() {
        return handlingSuggestion;
    }

    public void setHandlingSuggestion(String handlingSuggestion) {
        this.handlingSuggestion = handlingSuggestion;
    }

    @Basic
    @Column(name = "NOW_COMPONENT_CENTRE", nullable = true, length = 255)
    public String getNowComponentCentre() {
        return nowComponentCentre;
    }

    public void setNowComponentCentre(String nowComponentCentre) {
        this.nowComponentCentre = nowComponentCentre;
    }

    @Basic
    @Column(name = "ASSIGNEE_NAME", nullable = true, length = 255)
    public String getAssigneeName() {
        return assigneeName;
    }

    public void setAssigneeName(String assigneeName) {
        this.assigneeName = assigneeName;
    }

    @Basic
    @Column(name = "ORDER_TYPE", nullable = true, length = 2000)
    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    @Basic
    @Column(name = "INFO_ID", nullable = true, length = 20)
    public String getInfoId() {
        return infoId;
    }

    public void setInfoId(String infoId) {
        this.infoId = infoId;
    }

    @Basic
    @Column(name = "LIMIT_TIME", nullable = true, length = 20)
    public String getLimitTime() {
        return limitTime;
    }

    public void setLimitTime(String limitTime) {
        this.limitTime = limitTime;
    }

    @Basic
    @Column(name = "TEMPSUGGESTION", nullable = true, length = 4000)
    public String getTempsuggestion() {
        return tempsuggestion;
    }

    public void setTempsuggestion(String tempsuggestion) {
        this.tempsuggestion = tempsuggestion;
    }

    @Basic
    @Column(name = "DEAD_LINE_TIME", nullable = true, length = 100)
    public Date getDeadLineTime() {
        return deadLineTime;
    }

    public void setDeadLineTime(Date deadLineTime) {
        this.deadLineTime = deadLineTime;
    }

    @Basic
    @Column(name = "YESSW_ORDER_ID", nullable = true, length = 100)
    public String getYesswOrderId() {
        return yesswOrderId;
    }

    public void setYesswOrderId(String yesswOrderId) {
        this.yesswOrderId = yesswOrderId;
    }

    @Basic
    @Column(name = "YESSW_ORDER_STATE", nullable = true, length = 100)
    public String getYesswOrderState() {
        return yesswOrderState;
    }

    public void setYesswOrderState(String yesswOrderState) {
        this.yesswOrderState = yesswOrderState;
    }

    @Basic
    @Column(name = "YESSW_CLAIM_USER", nullable = true, length = 100)
    public String getYesswClaimUser() {
        return yesswClaimUser;
    }

    public void setYesswClaimUser(String yesswClaimUser) {
        this.yesswClaimUser = yesswClaimUser;
    }

    @Basic
    @Column(name = "CJSL_CLAIM_USER", nullable = true, length = 100)
    public String getCjslClaimUser() {
        return cjslClaimUser;
    }

    public void setCjslClaimUser(String cjslClaimUser) {
        this.cjslClaimUser = cjslClaimUser;
    }

    @Basic
    @Column(name = "ZFHF_LET_TITLE", nullable = true, length = 200)
    public String getZfhfLetTitle() {
        return zfhfLetTitle;
    }

    public void setZfhfLetTitle(String zfhfLetTitle) {
        this.zfhfLetTitle = zfhfLetTitle;
    }

    @Basic
    @Column(name = "YESSW_BO_HUI_CLAIM_USER_ID", nullable = true, length = 255)
    public String getYesswBoHuiClaimUserId() {
        return yesswBoHuiClaimUserId;
    }

    public void setYesswBoHuiClaimUserId(String yesswBoHuiClaimUserId) {
        this.yesswBoHuiClaimUserId = yesswBoHuiClaimUserId;
    }

    @Basic
    @Column(name = "CONTACT_INFO", nullable = true, length = 255)
    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    @Basic
    @Column(name = "PROB_DESC", nullable = true)
    public String getProbDesc() {
        return probDesc;
    }

    public void setProbDesc(String probDesc) {
        this.probDesc = probDesc;
    }

    @Basic
    @Column(name = "LANE_PHONE", nullable = true, length = 255)
    public String getLanePhone() {
        return lanePhone;
    }

    public void setLanePhone(String lanePhone) {
        this.lanePhone = lanePhone;
    }

    @Basic
    @Column(name = "UPLANE", nullable = true, length = 255)
    public String getUplane() {
        return uplane;
    }

    public void setUplane(String uplane) {
        this.uplane = uplane;
    }

    @Basic
    @Column(name = "LANE_CODE", nullable = true, length = 255)
    public String getLaneCode() {
        return laneCode;
    }

    public void setLaneCode(String laneCode) {
        this.laneCode = laneCode;
    }

    @Basic
    @Column(name = "HUITUI_CONTENT", nullable = true, length = 255)
    public String getHuituiContent() {
        return huituiContent;
    }

    public void setHuituiContent(String huituiContent) {
        this.huituiContent = huituiContent;
    }

    @Basic
    @Column(name = "YESSW_BO_HUI_REASON", nullable = true, length = 255)
    public String getYesswBoHuiReason() {
        return yesswBoHuiReason;
    }

    public void setYesswBoHuiReason(String yesswBoHuiReason) {
        this.yesswBoHuiReason = yesswBoHuiReason;
    }

    @Basic
    @Column(name = "IS_COMPLAIN", nullable = true, length = 255)
    public String getIsComplain() {
        return isComplain;
    }

    public void setIsComplain(String isComplain) {
        this.isComplain = isComplain;
    }

    @Basic
    @Column(name = "PUSH_TIME", nullable = true)
    public Time getPushTime() {
        return pushTime;
    }

    public void setPushTime(Time pushTime) {
        this.pushTime = pushTime;
    }

    @Basic
    @Column(name = "SEND_STATUS", nullable = true, length = 20)
    public String getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(String sendStatus) {
        this.sendStatus = sendStatus;
    }

    @Basic
    @Column(name = "PROCESS_PERSON", nullable = true, length = 255)
    public String getProcessPerson() {
        return processPerson;
    }

    public void setProcessPerson(String processPerson) {
        this.processPerson = processPerson;
    }

    @Basic
    @Column(name = "APP_TYPE_ID", nullable = true, length = 20)
    public String getAppTypeId() {
        return appTypeId;
    }

    public void setAppTypeId(String appTypeId) {
        this.appTypeId = appTypeId;
    }

    @Basic
    @Column(name = "CELL_NAME", nullable = true, length = 64)
    public String getCellName() {
        return cellName;
    }

    public void setCellName(String cellName) {
        this.cellName = cellName;
    }

    @Basic
    @Column(name = "LA_TITUDE", nullable = true, length = 64)
    public String getLaTitude() {
        return laTitude;
    }

    public void setLaTitude(String laTitude) {
        this.laTitude = laTitude;
    }

    @Basic
    @Column(name = "LONG_TITUDE", nullable = true, length = 64)
    public String getLongTitude() {
        return longTitude;
    }

    public void setLongTitude(String longTitude) {
        this.longTitude = longTitude;
    }

    @Basic
    @Column(name = "PUBLIC_OPINION_CONTENT", nullable = true, length = 1000)
    public String getPublicOpinionContent() {
        return publicOpinionContent;
    }

    public void setPublicOpinionContent(String publicOpinionContent) {
        this.publicOpinionContent = publicOpinionContent;
    }

    @Basic
    @Column(name = "UBLIC_OPINION_CONTENT", nullable = true, length = 1000)
    public String getUblicOpinionContent() {
        return ublicOpinionContent;
    }

    public void setUblicOpinionContent(String ublicOpinionContent) {
        this.ublicOpinionContent = ublicOpinionContent;
    }

    @Basic
    @Column(name = "PROB_SORT", nullable = true, length = 1000)
    public String getProbSort() {
        return probSort;
    }

    public void setProbSort(String probSort) {
        this.probSort = probSort;
    }

    @Basic
    @Column(name = "IS_WEB_SEND", nullable = true, length = 1)
    public String getIsWebSend() {
        return isWebSend;
    }

    public void setIsWebSend(String isWebSend) {
        this.isWebSend = isWebSend;
    }

    @Basic
    @Column(name = "DISPATCH_UNIT", nullable = true, length = 100)
    public String getDispatchUnit() {
        return dispatchUnit;
    }

    public void setDispatchUnit(String dispatchUnit) {
        this.dispatchUnit = dispatchUnit;
    }

    @Basic
    @Column(name = "ORDER_UNITID", nullable = true, length = 255)
    public String getOrderUnitid() {
        return orderUnitid;
    }

    public void setOrderUnitid(String orderUnitid) {
        this.orderUnitid = orderUnitid;
    }

    @Basic
    @Column(name = "ORDERUNITID", nullable = true, length = 100)
    public String getOrderunitid() {
        return orderunitid;
    }

    public void setOrderunitid(String orderunitid) {
        this.orderunitid = orderunitid;
    }

    @Basic
    @Column(name = "DISPATCH_UNIT_NAME", nullable = true, length = 100)
    public String getDispatchUnitName() {
        return dispatchUnitName;
    }

    public void setDispatchUnitName(String dispatchUnitName) {
        this.dispatchUnitName = dispatchUnitName;
    }

    @Basic
    @Column(name = "YESS_START_TIME", nullable = true, length = 100)
    public String getYessStartTime() {
        return yessStartTime;
    }

    public void setYessStartTime(String yessStartTime) {
        this.yessStartTime = yessStartTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CapBusiRecord that = (CapBusiRecord) o;
        return Objects.equals(recordId, that.recordId) &&
                Objects.equals(serviceId, that.serviceId) &&
                Objects.equals(callid, that.callid) &&
                Objects.equals(customerName, that.customerName) &&
                Objects.equals(fax, that.fax) &&
                Objects.equals(telephone, that.telephone) &&
                Objects.equals(email, that.email) &&
                Objects.equals(customerAddress, that.customerAddress) &&
                Objects.equals(region, that.region) &&
                Objects.equals(address, that.address) &&
                Objects.equals(classCode, that.classCode) &&
                Objects.equals(smallclass1, that.smallclass1) &&
                Objects.equals(smallclass2, that.smallclass2) &&
                Objects.equals(smallclass3, that.smallclass3) &&
                Objects.equals(smallclass4, that.smallclass4) &&
                Objects.equals(smallclass5, that.smallclass5) &&
                Objects.equals(individaulAtt1, that.individaulAtt1) &&
                Objects.equals(individaulAtt2, that.individaulAtt2) &&
                Objects.equals(individaulAtt3, that.individaulAtt3) &&
                Objects.equals(individaulAtt4, that.individaulAtt4) &&
                Objects.equals(individaulAtt5, that.individaulAtt5) &&
                Objects.equals(overTime, that.overTime) &&
                Objects.equals(miGridding, that.miGridding) &&
                Objects.equals(huGridding, that.huGridding) &&
                Objects.equals(callPhone, that.callPhone) &&
                Objects.equals(community, that.community) &&
                Objects.equals(gatheringTime, that.gatheringTime) &&
                Objects.equals(handlePlatform, that.handlePlatform) &&
                Objects.equals(happenDate, that.happenDate) &&
                Objects.equals(infoGathering, that.infoGathering) &&
                Objects.equals(sourceMethods, that.sourceMethods) &&
                Objects.equals(street, that.street) &&
                Objects.equals(agentDn, that.agentDn) &&
                Objects.equals(processInstanceId, that.processInstanceId) &&
                Objects.equals(caseNumber, that.caseNumber) &&
                Objects.equals(gridcode, that.gridcode) &&
                Objects.equals(griddingPerson, that.griddingPerson) &&
                Objects.equals(nowState, that.nowState) &&
                Objects.equals(taskId, that.taskId) &&
                Objects.equals(taskStatus, that.taskStatus) &&
                Objects.equals(called, that.called) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(recordType, that.recordType) &&
                Objects.equals(sourceType, that.sourceType) &&
                Objects.equals(answerType, that.answerType) &&
                Objects.equals(customerSex, that.customerSex) &&
                Objects.equals(isAnswer, that.isAnswer) &&
                Objects.equals(isError, that.isError) &&
                Objects.equals(isHidden, that.isHidden) &&
                Objects.equals(isOver, that.isOver) &&
                Objects.equals(isRemind, that.isRemind) &&
                Objects.equals(isSupervise, that.isSupervise) &&
                Objects.equals(isVisible, that.isVisible) &&
                Objects.equals(isVisit, that.isVisit) &&
                Objects.equals(urgencyGrade, that.urgencyGrade) &&
                Objects.equals(dispatchDept, that.dispatchDept) &&
                Objects.equals(recordNumber, that.recordNumber) &&
                Objects.equals(coordX, that.coordX) &&
                Objects.equals(coordY, that.coordY) &&
                Objects.equals(coordZ, that.coordZ) &&
                Objects.equals(dispatchId, that.dispatchId) &&
                Objects.equals(overId, that.overId) &&
                Objects.equals(processId, that.processId) &&
                Objects.equals(reviewId, that.reviewId) &&
                Objects.equals(citygridcode, that.citygridcode) &&
                Objects.equals(communityName, that.communityName) &&
                Objects.equals(sociologygridcode, that.sociologygridcode) &&
                Objects.equals(streetName, that.streetName) &&
                Objects.equals(deptName, that.deptName) &&
                Objects.equals(feedId, that.feedId) &&
                Objects.equals(addressname, that.addressname) &&
                Objects.equals(classLinkId, that.classLinkId) &&
                Objects.equals(infoGatheringId, that.infoGatheringId) &&
                Objects.equals(disparchId, that.disparchId) &&
                Objects.equals(componentCentreId, that.componentCentreId) &&
                Objects.equals(handlingSuggestion, that.handlingSuggestion) &&
                Objects.equals(nowComponentCentre, that.nowComponentCentre) &&
                Objects.equals(assigneeName, that.assigneeName) &&
                Objects.equals(orderType, that.orderType) &&
                Objects.equals(infoId, that.infoId) &&
                Objects.equals(limitTime, that.limitTime) &&
                Objects.equals(tempsuggestion, that.tempsuggestion) &&
                Objects.equals(deadLineTime, that.deadLineTime) &&
                Objects.equals(yesswOrderId, that.yesswOrderId) &&
                Objects.equals(yesswOrderState, that.yesswOrderState) &&
                Objects.equals(yesswClaimUser, that.yesswClaimUser) &&
                Objects.equals(cjslClaimUser, that.cjslClaimUser) &&
                Objects.equals(zfhfLetTitle, that.zfhfLetTitle) &&
                Objects.equals(yesswBoHuiClaimUserId, that.yesswBoHuiClaimUserId) &&
                Objects.equals(contactInfo, that.contactInfo) &&
                Objects.equals(probDesc, that.probDesc) &&
                Objects.equals(lanePhone, that.lanePhone) &&
                Objects.equals(uplane, that.uplane) &&
                Objects.equals(laneCode, that.laneCode) &&
                Objects.equals(huituiContent, that.huituiContent) &&
                Objects.equals(yesswBoHuiReason, that.yesswBoHuiReason) &&
                Objects.equals(isComplain, that.isComplain) &&
                Objects.equals(pushTime, that.pushTime) &&
                Objects.equals(sendStatus, that.sendStatus) &&
                Objects.equals(processPerson, that.processPerson) &&
                Objects.equals(appTypeId, that.appTypeId) &&
                Objects.equals(cellName, that.cellName) &&
                Objects.equals(laTitude, that.laTitude) &&
                Objects.equals(longTitude, that.longTitude) &&
                Objects.equals(publicOpinionContent, that.publicOpinionContent) &&
                Objects.equals(ublicOpinionContent, that.ublicOpinionContent) &&
                Objects.equals(probSort, that.probSort) &&
                Objects.equals(isWebSend, that.isWebSend) &&
                Objects.equals(dispatchUnit, that.dispatchUnit) &&
                Objects.equals(orderUnitid, that.orderUnitid) &&
                Objects.equals(orderunitid, that.orderunitid) &&
                Objects.equals(dispatchUnitName, that.dispatchUnitName) &&
                Objects.equals(yessStartTime, that.yessStartTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(recordId, serviceId, callid, customerName, fax, telephone, email, customerAddress, region, address, classCode, smallclass1, smallclass2, smallclass3, smallclass4, smallclass5, individaulAtt1, individaulAtt2, individaulAtt3, individaulAtt4, individaulAtt5, overTime, miGridding, huGridding, callPhone, community, gatheringTime, handlePlatform, happenDate, infoGathering, sourceMethods, street, agentDn, processInstanceId, caseNumber, gridcode, griddingPerson, nowState, taskId, taskStatus, called, userId, recordType, sourceType, answerType, customerSex, isAnswer, isError, isHidden, isOver, isRemind, isSupervise, isVisible, isVisit, urgencyGrade, dispatchDept, recordNumber, coordX, coordY, coordZ, dispatchId, overId, processId, reviewId, citygridcode, communityName, sociologygridcode, streetName, deptName, feedId, addressname, classLinkId, infoGatheringId, disparchId, componentCentreId, handlingSuggestion, nowComponentCentre, assigneeName, orderType, infoId, limitTime, tempsuggestion, deadLineTime, yesswOrderId, yesswOrderState, yesswClaimUser, cjslClaimUser, zfhfLetTitle, yesswBoHuiClaimUserId, contactInfo, probDesc, lanePhone, uplane, laneCode, huituiContent, yesswBoHuiReason, isComplain, pushTime, sendStatus, processPerson, appTypeId, cellName, laTitude, longTitude, publicOpinionContent, ublicOpinionContent, probSort, isWebSend, dispatchUnit, orderUnitid, orderunitid, dispatchUnitName, yessStartTime);
    }
}
