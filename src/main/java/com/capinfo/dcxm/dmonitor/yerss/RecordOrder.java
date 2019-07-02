
package com.capinfo.dcxm.dmonitor.yerss;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>recordOrder complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="recordOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="a1HandleResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callProcessTypeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="calledNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="centerCallProcessTypeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dispachDeadLine" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="employeeDepartmentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employeeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotTypeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="isAccident" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isHighPriority" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isInstable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isReduplicate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isValuable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="knotty" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="needReply" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="needVisit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="orderMarkID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="orderTypeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="orderUnitintID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="organizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherTypeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="recordCustomer" type="{http://webservice/}recordCustomer" minOccurs="0"/>
 *         &lt;element name="recordFiles" type="{http://webservice/}recordFile" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="requestAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestDistrictID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="requestStreetID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="requestTarget" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestTargetPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestTypeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "recordOrder", propOrder = {
    "a1HandleResult",
    "callDate",
    "callProcessTypeID",
    "calledNumber",
    "callerNumber",
    "centerCallProcessTypeID",
    "content",
    "dispachDeadLine",
    "employeeDepartmentName",
    "employeeName",
    "hotTypeID",
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
    "orderMarkID",
    "orderTypeID",
    "orderUnitintID",
    "organizationName",
    "otherTypeID",
    "recordCustomer",
    "recordFiles",
    "requestAddress",
    "requestDistrictID",
    "requestStreetID",
    "requestTarget",
    "requestTargetPhoneNumber",
    "requestTypeID",
    "title",
    "workID"
})
public class RecordOrder {

    protected String a1HandleResult;
    protected String callDate;
    protected int callProcessTypeID;
    protected String calledNumber;
    protected String callerNumber;
    protected int centerCallProcessTypeID;
    protected String content;
    protected int dispachDeadLine;
    protected String employeeDepartmentName;
    protected String employeeName;
    protected int hotTypeID;
    @XmlElement(name = "ID")
    protected int id;
    protected boolean isAccident;
    protected boolean isHighPriority;
    protected boolean isInstable;
    protected boolean isReduplicate;
    protected boolean isValuable;
    protected boolean knotty;
    protected int level;
    protected boolean needReply;
    protected boolean needVisit;
    protected int orderMarkID;
    protected int orderTypeID;
    protected int orderUnitintID;
    protected String organizationName;
    protected int otherTypeID;
    protected RecordCustomer recordCustomer;
    @XmlElement(nillable = true)
    protected List<RecordFile> recordFiles;
    protected String requestAddress;
    protected int requestDistrictID;
    protected int requestStreetID;
    protected String requestTarget;
    protected String requestTargetPhoneNumber;
    protected int requestTypeID;
    protected String title;
    protected String workID;

    /**
     * ��ȡa1HandleResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getA1HandleResult() {
        return a1HandleResult;
    }

    /**
     * ����a1HandleResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setA1HandleResult(String value) {
        this.a1HandleResult = value;
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
     * ��ȡcallProcessTypeID���Ե�ֵ��
     * 
     */
    public int getCallProcessTypeID() {
        return callProcessTypeID;
    }

    /**
     * ����callProcessTypeID���Ե�ֵ��
     * 
     */
    public void setCallProcessTypeID(int value) {
        this.callProcessTypeID = value;
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
     * ��ȡcenterCallProcessTypeID���Ե�ֵ��
     * 
     */
    public int getCenterCallProcessTypeID() {
        return centerCallProcessTypeID;
    }

    /**
     * ����centerCallProcessTypeID���Ե�ֵ��
     * 
     */
    public void setCenterCallProcessTypeID(int value) {
        this.centerCallProcessTypeID = value;
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
     * ��ȡdispachDeadLine���Ե�ֵ��
     * 
     */
    public int getDispachDeadLine() {
        return dispachDeadLine;
    }

    /**
     * ����dispachDeadLine���Ե�ֵ��
     * 
     */
    public void setDispachDeadLine(int value) {
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
     * ��ȡhotTypeID���Ե�ֵ��
     * 
     */
    public int getHotTypeID() {
        return hotTypeID;
    }

    /**
     * ����hotTypeID���Ե�ֵ��
     * 
     */
    public void setHotTypeID(int value) {
        this.hotTypeID = value;
    }

    /**
     * ��ȡid���Ե�ֵ��
     * 
     */
    public int getID() {
        return id;
    }

    /**
     * ����id���Ե�ֵ��
     * 
     */
    public void setID(int value) {
        this.id = value;
    }

    /**
     * ��ȡisAccident���Ե�ֵ��
     * 
     */
    public boolean isIsAccident() {
        return isAccident;
    }

    /**
     * ����isAccident���Ե�ֵ��
     * 
     */
    public void setIsAccident(boolean value) {
        this.isAccident = value;
    }

    /**
     * ��ȡisHighPriority���Ե�ֵ��
     * 
     */
    public boolean isIsHighPriority() {
        return isHighPriority;
    }

    /**
     * ����isHighPriority���Ե�ֵ��
     * 
     */
    public void setIsHighPriority(boolean value) {
        this.isHighPriority = value;
    }

    /**
     * ��ȡisInstable���Ե�ֵ��
     * 
     */
    public boolean isIsInstable() {
        return isInstable;
    }

    /**
     * ����isInstable���Ե�ֵ��
     * 
     */
    public void setIsInstable(boolean value) {
        this.isInstable = value;
    }

    /**
     * ��ȡisReduplicate���Ե�ֵ��
     * 
     */
    public boolean isIsReduplicate() {
        return isReduplicate;
    }

    /**
     * ����isReduplicate���Ե�ֵ��
     * 
     */
    public void setIsReduplicate(boolean value) {
        this.isReduplicate = value;
    }

    /**
     * ��ȡisValuable���Ե�ֵ��
     * 
     */
    public boolean isIsValuable() {
        return isValuable;
    }

    /**
     * ����isValuable���Ե�ֵ��
     * 
     */
    public void setIsValuable(boolean value) {
        this.isValuable = value;
    }

    /**
     * ��ȡknotty���Ե�ֵ��
     * 
     */
    public boolean isKnotty() {
        return knotty;
    }

    /**
     * ����knotty���Ե�ֵ��
     * 
     */
    public void setKnotty(boolean value) {
        this.knotty = value;
    }

    /**
     * ��ȡlevel���Ե�ֵ��
     * 
     */
    public int getLevel() {
        return level;
    }

    /**
     * ����level���Ե�ֵ��
     * 
     */
    public void setLevel(int value) {
        this.level = value;
    }

    /**
     * ��ȡneedReply���Ե�ֵ��
     * 
     */
    public boolean isNeedReply() {
        return needReply;
    }

    /**
     * ����needReply���Ե�ֵ��
     * 
     */
    public void setNeedReply(boolean value) {
        this.needReply = value;
    }

    /**
     * ��ȡneedVisit���Ե�ֵ��
     * 
     */
    public boolean isNeedVisit() {
        return needVisit;
    }

    /**
     * ����needVisit���Ե�ֵ��
     * 
     */
    public void setNeedVisit(boolean value) {
        this.needVisit = value;
    }

    /**
     * ��ȡorderMarkID���Ե�ֵ��
     * 
     */
    public int getOrderMarkID() {
        return orderMarkID;
    }

    /**
     * ����orderMarkID���Ե�ֵ��
     * 
     */
    public void setOrderMarkID(int value) {
        this.orderMarkID = value;
    }

    /**
     * ��ȡorderTypeID���Ե�ֵ��
     * 
     */
    public int getOrderTypeID() {
        return orderTypeID;
    }

    /**
     * ����orderTypeID���Ե�ֵ��
     * 
     */
    public void setOrderTypeID(int value) {
        this.orderTypeID = value;
    }

    /**
     * ��ȡorderUnitintID���Ե�ֵ��
     * 
     */
    public int getOrderUnitintID() {
        return orderUnitintID;
    }

    /**
     * ����orderUnitintID���Ե�ֵ��
     * 
     */
    public void setOrderUnitintID(int value) {
        this.orderUnitintID = value;
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
     * ��ȡotherTypeID���Ե�ֵ��
     * 
     */
    public int getOtherTypeID() {
        return otherTypeID;
    }

    /**
     * ����otherTypeID���Ե�ֵ��
     * 
     */
    public void setOtherTypeID(int value) {
        this.otherTypeID = value;
    }

    /**
     * ��ȡrecordCustomer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordCustomer }
     *     
     */
    public RecordCustomer getRecordCustomer() {
        return recordCustomer;
    }

    /**
     * ����recordCustomer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordCustomer }
     *     
     */
    public void setRecordCustomer(RecordCustomer value) {
        this.recordCustomer = value;
    }

    /**
     * Gets the value of the recordFiles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordFiles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordFiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecordFile }
     * 
     * 
     */
    public List<RecordFile> getRecordFiles() {
        if (recordFiles == null) {
            recordFiles = new ArrayList<RecordFile>();
        }
        return this.recordFiles;
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
     * ��ȡrequestDistrictID���Ե�ֵ��
     * 
     */
    public int getRequestDistrictID() {
        return requestDistrictID;
    }

    /**
     * ����requestDistrictID���Ե�ֵ��
     * 
     */
    public void setRequestDistrictID(int value) {
        this.requestDistrictID = value;
    }

    /**
     * ��ȡrequestStreetID���Ե�ֵ��
     * 
     */
    public int getRequestStreetID() {
        return requestStreetID;
    }

    /**
     * ����requestStreetID���Ե�ֵ��
     * 
     */
    public void setRequestStreetID(int value) {
        this.requestStreetID = value;
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
     * ��ȡrequestTypeID���Ե�ֵ��
     * 
     */
    public int getRequestTypeID() {
        return requestTypeID;
    }

    /**
     * ����requestTypeID���Ե�ֵ��
     * 
     */
    public void setRequestTypeID(int value) {
        this.requestTypeID = value;
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
