
package com.capinfo.dcxm.dmonitor.yerss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>a3ReUrgeInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="a3ReUrgeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="centerAdvice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manageInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middleWriteAdvice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reUrgeDetailInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reUrgeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reUrgeLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reUrgeMan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reUrgeMatter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reUrgeReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reUrgeTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a3ReUrgeInfo", propOrder = {
    "centerAdvice",
    "contact",
    "contactName",
    "id",
    "manageInfo",
    "middleWriteAdvice",
    "orderID",
    "orderUnitName",
    "reUrgeDetailInfo",
    "reUrgeID",
    "reUrgeLimit",
    "reUrgeMan",
    "reUrgeMatter",
    "reUrgeReason",
    "reUrgeTime"
})
public class A3ReUrgeInfo {

    protected String centerAdvice;
    protected String contact;
    protected String contactName;
    @XmlElement(name = "ID")
    protected String id;
    protected String manageInfo;
    protected String middleWriteAdvice;
    protected String orderID;
    protected String orderUnitName;
    protected String reUrgeDetailInfo;
    protected String reUrgeID;
    protected String reUrgeLimit;
    protected String reUrgeMan;
    protected String reUrgeMatter;
    protected String reUrgeReason;
    protected String reUrgeTime;

    /**
     * 获取centerAdvice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCenterAdvice() {
        return centerAdvice;
    }

    /**
     * 设置centerAdvice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCenterAdvice(String value) {
        this.centerAdvice = value;
    }

    /**
     * 获取contact属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact() {
        return contact;
    }

    /**
     * 设置contact属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact(String value) {
        this.contact = value;
    }

    /**
     * 获取contactName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * 设置contactName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
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
     * 获取manageInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManageInfo() {
        return manageInfo;
    }

    /**
     * 设置manageInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManageInfo(String value) {
        this.manageInfo = value;
    }

    /**
     * 获取middleWriteAdvice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleWriteAdvice() {
        return middleWriteAdvice;
    }

    /**
     * 设置middleWriteAdvice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleWriteAdvice(String value) {
        this.middleWriteAdvice = value;
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
     * 获取orderUnitName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderUnitName() {
        return orderUnitName;
    }

    /**
     * 设置orderUnitName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderUnitName(String value) {
        this.orderUnitName = value;
    }

    /**
     * 获取reUrgeDetailInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReUrgeDetailInfo() {
        return reUrgeDetailInfo;
    }

    /**
     * 设置reUrgeDetailInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReUrgeDetailInfo(String value) {
        this.reUrgeDetailInfo = value;
    }

    /**
     * 获取reUrgeID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReUrgeID() {
        return reUrgeID;
    }

    /**
     * 设置reUrgeID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReUrgeID(String value) {
        this.reUrgeID = value;
    }

    /**
     * 获取reUrgeLimit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReUrgeLimit() {
        return reUrgeLimit;
    }

    /**
     * 设置reUrgeLimit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReUrgeLimit(String value) {
        this.reUrgeLimit = value;
    }

    /**
     * 获取reUrgeMan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReUrgeMan() {
        return reUrgeMan;
    }

    /**
     * 设置reUrgeMan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReUrgeMan(String value) {
        this.reUrgeMan = value;
    }

    /**
     * 获取reUrgeMatter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReUrgeMatter() {
        return reUrgeMatter;
    }

    /**
     * 设置reUrgeMatter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReUrgeMatter(String value) {
        this.reUrgeMatter = value;
    }

    /**
     * 获取reUrgeReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReUrgeReason() {
        return reUrgeReason;
    }

    /**
     * 设置reUrgeReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReUrgeReason(String value) {
        this.reUrgeReason = value;
    }

    /**
     * 获取reUrgeTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReUrgeTime() {
        return reUrgeTime;
    }

    /**
     * 设置reUrgeTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReUrgeTime(String value) {
        this.reUrgeTime = value;
    }

}
