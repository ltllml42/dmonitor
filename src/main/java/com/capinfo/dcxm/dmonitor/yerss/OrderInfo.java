
package com.capinfo.dcxm.dmonitor.yerss;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>orderInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡcallDate���Ե�ֵ��
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
     * ����callDate���Ե�ֵ��
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
     * ��ȡcallProcessType���Ե�ֵ��
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
     * ����callProcessType���Ե�ֵ��
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
     * ��ȡcalledNumber���Ե�ֵ��
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
     * ����calledNumber���Ե�ֵ��
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
     * ��ȡcallerNumber���Ե�ֵ��
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
     * ����callerNumber���Ե�ֵ��
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
     * ��ȡcenterCallProcessType���Ե�ֵ��
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
     * ����centerCallProcessType���Ե�ֵ��
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
     * ��ȡcontent���Ե�ֵ��
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
     * ����content���Ե�ֵ��
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
     * ��ȡcreateTime���Ե�ֵ��
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
     * ����createTime���Ե�ֵ��
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
     * ��ȡcustomerAddressDetail���Ե�ֵ��
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
     * ����customerAddressDetail���Ե�ֵ��
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
     * ��ȡcustomerContactInfo���Ե�ֵ��
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
     * ����customerContactInfo���Ե�ֵ��
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
     * ��ȡcustomerCountry���Ե�ֵ��
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
     * ����customerCountry���Ե�ֵ��
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
     * ��ȡcustomerDistrict���Ե�ֵ��
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
     * ����customerDistrict���Ե�ֵ��
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
     * ��ȡcustomerGender���Ե�ֵ��
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
     * ����customerGender���Ե�ֵ��
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
     * ��ȡcustomerID���Ե�ֵ��
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
     * ����customerID���Ե�ֵ��
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
     * ��ȡcustomerISOldCustomer���Ե�ֵ��
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
     * ����customerISOldCustomer���Ե�ֵ��
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
     * ��ȡcustomerIsSecret���Ե�ֵ��
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
     * ����customerIsSecret���Ե�ֵ��
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
     * ��ȡcustomerName���Ե�ֵ��
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
     * ����customerName���Ե�ֵ��
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
     * ��ȡcustomerProvince���Ե�ֵ��
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
     * ����customerProvince���Ե�ֵ��
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
     * ��ȡcustomerSpecialType���Ե�ֵ��
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
     * ����customerSpecialType���Ե�ֵ��
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
     * ��ȡdispachDeadLine���Ե�ֵ��
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
     * ����dispachDeadLine���Ե�ֵ��
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
     * ��ȡemployeeDepartmentName���Ե�ֵ��
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
     * ����employeeDepartmentName���Ե�ֵ��
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
     * ��ȡemployeeName���Ե�ֵ��
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
     * ����employeeName���Ե�ֵ��
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
     * ��ȡhotType���Ե�ֵ��
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
     * ����hotType���Ե�ֵ��
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
     * ��ȡid���Ե�ֵ��
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
     * ����id���Ե�ֵ��
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
     * ��ȡisAccident���Ե�ֵ��
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
     * ����isAccident���Ե�ֵ��
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
     * ��ȡisHighPriority���Ե�ֵ��
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
     * ����isHighPriority���Ե�ֵ��
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
     * ��ȡisInstable���Ե�ֵ��
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
     * ����isInstable���Ե�ֵ��
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
     * ��ȡisReduplicate���Ե�ֵ��
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
     * ����isReduplicate���Ե�ֵ��
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
     * ��ȡisValuable���Ե�ֵ��
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
     * ����isValuable���Ե�ֵ��
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
     * ��ȡknotty���Ե�ֵ��
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
     * ����knotty���Ե�ֵ��
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
     * ��ȡlevel���Ե�ֵ��
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
     * ����level���Ե�ֵ��
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
     * ��ȡneedReply���Ե�ֵ��
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
     * ����needReply���Ե�ֵ��
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
     * ��ȡneedVisit���Ե�ֵ��
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
     * ����needVisit���Ե�ֵ��
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
     * ��ȡorderID���Ե�ֵ��
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
     * ����orderID���Ե�ֵ��
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
     * ��ȡorderState���Ե�ֵ��
     * 
     */
    public int getOrderState() {
        return orderState;
    }

    /**
     * ����orderState���Ե�ֵ��
     * 
     */
    public void setOrderState(int value) {
        this.orderState = value;
    }

    /**
     * ��ȡorderType���Ե�ֵ��
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
     * ����orderType���Ե�ֵ��
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
     * ��ȡorderUnit���Ե�ֵ��
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
     * ����orderUnit���Ե�ֵ��
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
     * ��ȡorganizationName���Ե�ֵ��
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
     * ����organizationName���Ե�ֵ��
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
     * ��ȡotherType���Ե�ֵ��
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
     * ����otherType���Ե�ֵ��
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
     * ��ȡrequestAddress���Ե�ֵ��
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
     * ����requestAddress���Ե�ֵ��
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
     * ��ȡrequestDistrict���Ե�ֵ��
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
     * ����requestDistrict���Ե�ֵ��
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
     * ��ȡrequestStreet���Ե�ֵ��
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
     * ����requestStreet���Ե�ֵ��
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
     * ��ȡrequestTarget���Ե�ֵ��
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
     * ����requestTarget���Ե�ֵ��
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
     * ��ȡrequestTargetPhoneNumber���Ե�ֵ��
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
     * ����requestTargetPhoneNumber���Ե�ֵ��
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
     * ��ȡrequestType���Ե�ֵ��
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
     * ����requestType���Ե�ֵ��
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
     * ��ȡrequestTypeID���Ե�ֵ��
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
     * ����requestTypeID���Ե�ֵ��
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
     * ��ȡstrp1���Ե�ֵ��
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
     * ����strp1���Ե�ֵ��
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
     * ��ȡstrp2���Ե�ֵ��
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
     * ����strp2���Ե�ֵ��
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
     * ��ȡstrp3���Ե�ֵ��
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
     * ����strp3���Ե�ֵ��
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
     * ��ȡstrp4���Ե�ֵ��
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
     * ����strp4���Ե�ֵ��
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
     * ��ȡstrp5���Ե�ֵ��
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
     * ����strp5���Ե�ֵ��
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
     * ��ȡstrp6���Ե�ֵ��
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
     * ����strp6���Ե�ֵ��
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
     * ��ȡserviceTypeName���Ե�ֵ��
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
     * ����serviceTypeName���Ե�ֵ��
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
     * ��ȡtitle���Ե�ֵ��
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
     * ����title���Ե�ֵ��
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
     * ��ȡworkID���Ե�ֵ��
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
     * ����workID���Ե�ֵ��
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
