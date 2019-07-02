
package com.capinfo.dcxm.dmonitor.yerss;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>orderInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="orderInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="atttachFiles" type="{http://webservice/}attachFileInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="callDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callProcessType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calledNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="centerCallProcessType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customer_AddressDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customer_ContactInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customer_Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customer_District" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customer_Gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customer_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customer_ISOldCustomer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customer_IsSecret" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customer_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customer_Province" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customer_SpecialType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dispachDeadLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employeeDepartmentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employeeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isAccident" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isHighPriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isInstable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isReduplicate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isValuable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="knotty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="needReply" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="needVisit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderState" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="orderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="organizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestTarget" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestTargetPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestTypeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STRP1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STRP2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STRP3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STRP4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STRP5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STRP6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orderInfo", propOrder = {
    "atttachFiles",
    "callDate",
    "callProcessType",
    "calledNumber",
    "callerNumber",
    "centerCallProcessType",
    "content",
    "createTime",
    "customerAddressDetail",
    "customerContactInfo",
    "customerCountry",
    "customerDistrict",
    "customerGender",
    "customerID",
    "customerISOldCustomer",
    "customerIsSecret",
    "customerName",
    "customerProvince",
    "customerSpecialType",
    "dispachDeadLine",
    "employeeDepartmentName",
    "employeeName",
    "hotType",
    "id",
    "isAccident",
    "isHighPriority",
    "isInstable",
    "isReduplicate",
    "isValuable",
    "knotty",
    "level",
    "needReply",
    "needVisit",
    "orderID",
    "orderState",
    "orderType",
    "orderUnit",
    "organizationName",
    "otherType",
    "requestAddress",
    "requestDistrict",
    "requestStreet",
    "requestTarget",
    "requestTargetPhoneNumber",
    "requestType",
    "requestTypeID",
    "strp1",
    "strp2",
    "strp3",
    "strp4",
    "strp5",
    "strp6",
    "serviceTypeName",
    "title",
    "workID"
})
public class OrderInfo {

    @XmlElement(nillable = true)
    protected List<AttachFileInfo> atttachFiles;
    protected String callDate;
    protected String callProcessType;
    protected String calledNumber;
    protected String callerNumber;
    protected String centerCallProcessType;
    protected String content;
    protected String createTime;
    @XmlElement(name = "customer_AddressDetail")
    protected String customerAddressDetail;
    @XmlElement(name = "customer_ContactInfo")
    protected String customerContactInfo;
    @XmlElement(name = "customer_Country")
    protected String customerCountry;
    @XmlElement(name = "customer_District")
    protected String customerDistrict;
    @XmlElement(name = "customer_Gender")
    protected String customerGender;
    @XmlElement(name = "customer_ID")
    protected String customerID;
    @XmlElement(name = "customer_ISOldCustomer")
    protected String customerISOldCustomer;
    @XmlElement(name = "customer_IsSecret")
    protected String customerIsSecret;
    @XmlElement(name = "customer_Name")
    protected String customerName;
    @XmlElement(name = "customer_Province")
    protected String customerProvince;
    @XmlElement(name = "customer_SpecialType")
    protected String customerSpecialType;
    protected String dispachDeadLine;
    protected String employeeDepartmentName;
    protected String employeeName;
    protected String hotType;
    @XmlElement(name = "ID")
    protected String id;
    protected String isAccident;
    protected String isHighPriority;
    protected String isInstable;
    protected String isReduplicate;
    protected String isValuable;
    protected String knotty;
    protected String level;
    protected String needReply;
    protected String needVisit;
    protected String orderID;
    protected int orderState;
    protected String orderType;
    protected String orderUnit;
    protected String organizationName;
    protected String otherType;
    protected String requestAddress;
    protected String requestDistrict;
    protected String requestStreet;
    protected String requestTarget;
    protected String requestTargetPhoneNumber;
    protected String requestType;
    protected String requestTypeID;
    @XmlElement(name = "STRP1")
    protected String strp1;
    @XmlElement(name = "STRP2")
    protected String strp2;
    @XmlElement(name = "STRP3")
    protected String strp3;
    @XmlElement(name = "STRP4")
    protected String strp4;
    @XmlElement(name = "STRP5")
    protected String strp5;
    @XmlElement(name = "STRP6")
    protected String strp6;
    protected String serviceTypeName;
    protected String title;
    protected String workID;

    /**
     * Gets the value of the atttachFiles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the atttachFiles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAtttachFiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachFileInfo }
     * 
     * 
     */
    public List<AttachFileInfo> getAtttachFiles() {
        if (atttachFiles == null) {
            atttachFiles = new ArrayList<AttachFileInfo>();
        }
        return this.atttachFiles;
    }

    /**
     * 获取callDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallDate() {
        return callDate;
    }

    /**
     * 设置callDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallDate(String value) {
        this.callDate = value;
    }

    /**
     * 获取callProcessType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallProcessType() {
        return callProcessType;
    }

    /**
     * 设置callProcessType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallProcessType(String value) {
        this.callProcessType = value;
    }

    /**
     * 获取calledNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledNumber() {
        return calledNumber;
    }

    /**
     * 设置calledNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledNumber(String value) {
        this.calledNumber = value;
    }

    /**
     * 获取callerNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallerNumber() {
        return callerNumber;
    }

    /**
     * 设置callerNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallerNumber(String value) {
        this.callerNumber = value;
    }

    /**
     * 获取centerCallProcessType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCenterCallProcessType() {
        return centerCallProcessType;
    }

    /**
     * 设置centerCallProcessType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCenterCallProcessType(String value) {
        this.centerCallProcessType = value;
    }

    /**
     * 获取content属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置content属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * 获取createTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置createTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateTime(String value) {
        this.createTime = value;
    }

    /**
     * 获取customerAddressDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAddressDetail() {
        return customerAddressDetail;
    }

    /**
     * 设置customerAddressDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAddressDetail(String value) {
        this.customerAddressDetail = value;
    }

    /**
     * 获取customerContactInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerContactInfo() {
        return customerContactInfo;
    }

    /**
     * 设置customerContactInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerContactInfo(String value) {
        this.customerContactInfo = value;
    }

    /**
     * 获取customerCountry属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCountry() {
        return customerCountry;
    }

    /**
     * 设置customerCountry属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCountry(String value) {
        this.customerCountry = value;
    }

    /**
     * 获取customerDistrict属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerDistrict() {
        return customerDistrict;
    }

    /**
     * 设置customerDistrict属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerDistrict(String value) {
        this.customerDistrict = value;
    }

    /**
     * 获取customerGender属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerGender() {
        return customerGender;
    }

    /**
     * 设置customerGender属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerGender(String value) {
        this.customerGender = value;
    }

    /**
     * 获取customerID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * 设置customerID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerID(String value) {
        this.customerID = value;
    }

    /**
     * 获取customerISOldCustomer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerISOldCustomer() {
        return customerISOldCustomer;
    }

    /**
     * 设置customerISOldCustomer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerISOldCustomer(String value) {
        this.customerISOldCustomer = value;
    }

    /**
     * 获取customerIsSecret属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerIsSecret() {
        return customerIsSecret;
    }

    /**
     * 设置customerIsSecret属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerIsSecret(String value) {
        this.customerIsSecret = value;
    }

    /**
     * 获取customerName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * 设置customerName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * 获取customerProvince属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerProvince() {
        return customerProvince;
    }

    /**
     * 设置customerProvince属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerProvince(String value) {
        this.customerProvince = value;
    }

    /**
     * 获取customerSpecialType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerSpecialType() {
        return customerSpecialType;
    }

    /**
     * 设置customerSpecialType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerSpecialType(String value) {
        this.customerSpecialType = value;
    }

    /**
     * 获取dispachDeadLine属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispachDeadLine() {
        return dispachDeadLine;
    }

    /**
     * 设置dispachDeadLine属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispachDeadLine(String value) {
        this.dispachDeadLine = value;
    }

    /**
     * 获取employeeDepartmentName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeDepartmentName() {
        return employeeDepartmentName;
    }

    /**
     * 设置employeeDepartmentName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeDepartmentName(String value) {
        this.employeeDepartmentName = value;
    }

    /**
     * 获取employeeName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * 设置employeeName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeName(String value) {
        this.employeeName = value;
    }

    /**
     * 获取hotType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotType() {
        return hotType;
    }

    /**
     * 设置hotType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotType(String value) {
        this.hotType = value;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * 获取isAccident属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsAccident() {
        return isAccident;
    }

    /**
     * 设置isAccident属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsAccident(String value) {
        this.isAccident = value;
    }

    /**
     * 获取isHighPriority属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsHighPriority() {
        return isHighPriority;
    }

    /**
     * 设置isHighPriority属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsHighPriority(String value) {
        this.isHighPriority = value;
    }

    /**
     * 获取isInstable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsInstable() {
        return isInstable;
    }

    /**
     * 设置isInstable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsInstable(String value) {
        this.isInstable = value;
    }

    /**
     * 获取isReduplicate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsReduplicate() {
        return isReduplicate;
    }

    /**
     * 设置isReduplicate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsReduplicate(String value) {
        this.isReduplicate = value;
    }

    /**
     * 获取isValuable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsValuable() {
        return isValuable;
    }

    /**
     * 设置isValuable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsValuable(String value) {
        this.isValuable = value;
    }

    /**
     * 获取knotty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKnotty() {
        return knotty;
    }

    /**
     * 设置knotty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKnotty(String value) {
        this.knotty = value;
    }

    /**
     * 获取level属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel() {
        return level;
    }

    /**
     * 设置level属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel(String value) {
        this.level = value;
    }

    /**
     * 获取needReply属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeedReply() {
        return needReply;
    }

    /**
     * 设置needReply属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeedReply(String value) {
        this.needReply = value;
    }

    /**
     * 获取needVisit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeedVisit() {
        return needVisit;
    }

    /**
     * 设置needVisit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeedVisit(String value) {
        this.needVisit = value;
    }

    /**
     * 获取orderID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * 设置orderID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderID(String value) {
        this.orderID = value;
    }

    /**
     * 获取orderState属性的值。
     * 
     */
    public int getOrderState() {
        return orderState;
    }

    /**
     * 设置orderState属性的值。
     * 
     */
    public void setOrderState(int value) {
        this.orderState = value;
    }

    /**
     * 获取orderType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * 设置orderType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderType(String value) {
        this.orderType = value;
    }

    /**
     * 获取orderUnit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderUnit() {
        return orderUnit;
    }

    /**
     * 设置orderUnit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderUnit(String value) {
        this.orderUnit = value;
    }

    /**
     * 获取organizationName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * 设置organizationName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationName(String value) {
        this.organizationName = value;
    }

    /**
     * 获取otherType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherType() {
        return otherType;
    }

    /**
     * 设置otherType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherType(String value) {
        this.otherType = value;
    }

    /**
     * 获取requestAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestAddress() {
        return requestAddress;
    }

    /**
     * 设置requestAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestAddress(String value) {
        this.requestAddress = value;
    }

    /**
     * 获取requestDistrict属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestDistrict() {
        return requestDistrict;
    }

    /**
     * 设置requestDistrict属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestDistrict(String value) {
        this.requestDistrict = value;
    }

    /**
     * 获取requestStreet属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestStreet() {
        return requestStreet;
    }

    /**
     * 设置requestStreet属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestStreet(String value) {
        this.requestStreet = value;
    }

    /**
     * 获取requestTarget属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestTarget() {
        return requestTarget;
    }

    /**
     * 设置requestTarget属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestTarget(String value) {
        this.requestTarget = value;
    }

    /**
     * 获取requestTargetPhoneNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestTargetPhoneNumber() {
        return requestTargetPhoneNumber;
    }

    /**
     * 设置requestTargetPhoneNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestTargetPhoneNumber(String value) {
        this.requestTargetPhoneNumber = value;
    }

    /**
     * 获取requestType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestType() {
        return requestType;
    }

    /**
     * 设置requestType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestType(String value) {
        this.requestType = value;
    }

    /**
     * 获取requestTypeID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestTypeID() {
        return requestTypeID;
    }

    /**
     * 设置requestTypeID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestTypeID(String value) {
        this.requestTypeID = value;
    }

    /**
     * 获取strp1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTRP1() {
        return strp1;
    }

    /**
     * 设置strp1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTRP1(String value) {
        this.strp1 = value;
    }

    /**
     * 获取strp2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTRP2() {
        return strp2;
    }

    /**
     * 设置strp2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTRP2(String value) {
        this.strp2 = value;
    }

    /**
     * 获取strp3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTRP3() {
        return strp3;
    }

    /**
     * 设置strp3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTRP3(String value) {
        this.strp3 = value;
    }

    /**
     * 获取strp4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTRP4() {
        return strp4;
    }

    /**
     * 设置strp4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTRP4(String value) {
        this.strp4 = value;
    }

    /**
     * 获取strp5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTRP5() {
        return strp5;
    }

    /**
     * 设置strp5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTRP5(String value) {
        this.strp5 = value;
    }

    /**
     * 获取strp6属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTRP6() {
        return strp6;
    }

    /**
     * 设置strp6属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTRP6(String value) {
        this.strp6 = value;
    }

    /**
     * 获取serviceTypeName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceTypeName() {
        return serviceTypeName;
    }

    /**
     * 设置serviceTypeName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceTypeName(String value) {
        this.serviceTypeName = value;
    }

    /**
     * 获取title属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置title属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * 获取workID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkID() {
        return workID;
    }

    /**
     * 设置workID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkID(String value) {
        this.workID = value;
    }

}
