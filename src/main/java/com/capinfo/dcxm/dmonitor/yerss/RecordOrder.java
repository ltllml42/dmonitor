
package com.capinfo.dcxm.dmonitor.yerss;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>recordOrder complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取a1HandleResult属性的值。
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
     * 设置a1HandleResult属性的值。
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
     * 获取callProcessTypeID属性的值。
     * 
     */
    public int getCallProcessTypeID() {
        return callProcessTypeID;
    }

    /**
     * 设置callProcessTypeID属性的值。
     * 
     */
    public void setCallProcessTypeID(int value) {
        this.callProcessTypeID = value;
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
     * 获取centerCallProcessTypeID属性的值。
     * 
     */
    public int getCenterCallProcessTypeID() {
        return centerCallProcessTypeID;
    }

    /**
     * 设置centerCallProcessTypeID属性的值。
     * 
     */
    public void setCenterCallProcessTypeID(int value) {
        this.centerCallProcessTypeID = value;
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
     * 获取dispachDeadLine属性的值。
     * 
     */
    public int getDispachDeadLine() {
        return dispachDeadLine;
    }

    /**
     * 设置dispachDeadLine属性的值。
     * 
     */
    public void setDispachDeadLine(int value) {
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
     * 获取hotTypeID属性的值。
     * 
     */
    public int getHotTypeID() {
        return hotTypeID;
    }

    /**
     * 设置hotTypeID属性的值。
     * 
     */
    public void setHotTypeID(int value) {
        this.hotTypeID = value;
    }

    /**
     * 获取id属性的值。
     * 
     */
    public int getID() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     */
    public void setID(int value) {
        this.id = value;
    }

    /**
     * 获取isAccident属性的值。
     * 
     */
    public boolean isIsAccident() {
        return isAccident;
    }

    /**
     * 设置isAccident属性的值。
     * 
     */
    public void setIsAccident(boolean value) {
        this.isAccident = value;
    }

    /**
     * 获取isHighPriority属性的值。
     * 
     */
    public boolean isIsHighPriority() {
        return isHighPriority;
    }

    /**
     * 设置isHighPriority属性的值。
     * 
     */
    public void setIsHighPriority(boolean value) {
        this.isHighPriority = value;
    }

    /**
     * 获取isInstable属性的值。
     * 
     */
    public boolean isIsInstable() {
        return isInstable;
    }

    /**
     * 设置isInstable属性的值。
     * 
     */
    public void setIsInstable(boolean value) {
        this.isInstable = value;
    }

    /**
     * 获取isReduplicate属性的值。
     * 
     */
    public boolean isIsReduplicate() {
        return isReduplicate;
    }

    /**
     * 设置isReduplicate属性的值。
     * 
     */
    public void setIsReduplicate(boolean value) {
        this.isReduplicate = value;
    }

    /**
     * 获取isValuable属性的值。
     * 
     */
    public boolean isIsValuable() {
        return isValuable;
    }

    /**
     * 设置isValuable属性的值。
     * 
     */
    public void setIsValuable(boolean value) {
        this.isValuable = value;
    }

    /**
     * 获取knotty属性的值。
     * 
     */
    public boolean isKnotty() {
        return knotty;
    }

    /**
     * 设置knotty属性的值。
     * 
     */
    public void setKnotty(boolean value) {
        this.knotty = value;
    }

    /**
     * 获取level属性的值。
     * 
     */
    public int getLevel() {
        return level;
    }

    /**
     * 设置level属性的值。
     * 
     */
    public void setLevel(int value) {
        this.level = value;
    }

    /**
     * 获取needReply属性的值。
     * 
     */
    public boolean isNeedReply() {
        return needReply;
    }

    /**
     * 设置needReply属性的值。
     * 
     */
    public void setNeedReply(boolean value) {
        this.needReply = value;
    }

    /**
     * 获取needVisit属性的值。
     * 
     */
    public boolean isNeedVisit() {
        return needVisit;
    }

    /**
     * 设置needVisit属性的值。
     * 
     */
    public void setNeedVisit(boolean value) {
        this.needVisit = value;
    }

    /**
     * 获取orderMarkID属性的值。
     * 
     */
    public int getOrderMarkID() {
        return orderMarkID;
    }

    /**
     * 设置orderMarkID属性的值。
     * 
     */
    public void setOrderMarkID(int value) {
        this.orderMarkID = value;
    }

    /**
     * 获取orderTypeID属性的值。
     * 
     */
    public int getOrderTypeID() {
        return orderTypeID;
    }

    /**
     * 设置orderTypeID属性的值。
     * 
     */
    public void setOrderTypeID(int value) {
        this.orderTypeID = value;
    }

    /**
     * 获取orderUnitintID属性的值。
     * 
     */
    public int getOrderUnitintID() {
        return orderUnitintID;
    }

    /**
     * 设置orderUnitintID属性的值。
     * 
     */
    public void setOrderUnitintID(int value) {
        this.orderUnitintID = value;
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
     * 获取otherTypeID属性的值。
     * 
     */
    public int getOtherTypeID() {
        return otherTypeID;
    }

    /**
     * 设置otherTypeID属性的值。
     * 
     */
    public void setOtherTypeID(int value) {
        this.otherTypeID = value;
    }

    /**
     * 获取recordCustomer属性的值。
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
     * 设置recordCustomer属性的值。
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
     * 获取requestDistrictID属性的值。
     * 
     */
    public int getRequestDistrictID() {
        return requestDistrictID;
    }

    /**
     * 设置requestDistrictID属性的值。
     * 
     */
    public void setRequestDistrictID(int value) {
        this.requestDistrictID = value;
    }

    /**
     * 获取requestStreetID属性的值。
     * 
     */
    public int getRequestStreetID() {
        return requestStreetID;
    }

    /**
     * 设置requestStreetID属性的值。
     * 
     */
    public void setRequestStreetID(int value) {
        this.requestStreetID = value;
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
     * 获取requestTypeID属性的值。
     * 
     */
    public int getRequestTypeID() {
        return requestTypeID;
    }

    /**
     * 设置requestTypeID属性的值。
     * 
     */
    public void setRequestTypeID(int value) {
        this.requestTypeID = value;
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
