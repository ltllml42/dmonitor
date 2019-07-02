
package com.capinfo.dcxm.dmonitor.yerss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>a3ReUrgeInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡcenterAdvice���Ե�ֵ��
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
     * ����centerAdvice���Ե�ֵ��
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
     * ��ȡcontact���Ե�ֵ��
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
     * ����contact���Ե�ֵ��
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
     * ��ȡcontactName���Ե�ֵ��
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
     * ����contactName���Ե�ֵ��
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
     * ��ȡmanageInfo���Ե�ֵ��
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
     * ����manageInfo���Ե�ֵ��
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
     * ��ȡmiddleWriteAdvice���Ե�ֵ��
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
     * ����middleWriteAdvice���Ե�ֵ��
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
     * ��ȡorderUnitName���Ե�ֵ��
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
     * ����orderUnitName���Ե�ֵ��
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
     * ��ȡreUrgeDetailInfo���Ե�ֵ��
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
     * ����reUrgeDetailInfo���Ե�ֵ��
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
     * ��ȡreUrgeID���Ե�ֵ��
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
     * ����reUrgeID���Ե�ֵ��
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
     * ��ȡreUrgeLimit���Ե�ֵ��
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
     * ����reUrgeLimit���Ե�ֵ��
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
     * ��ȡreUrgeMan���Ե�ֵ��
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
     * ����reUrgeMan���Ե�ֵ��
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
     * ��ȡreUrgeMatter���Ե�ֵ��
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
     * ����reUrgeMatter���Ե�ֵ��
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
     * ��ȡreUrgeReason���Ե�ֵ��
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
     * ����reUrgeReason���Ե�ֵ��
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
     * ��ȡreUrgeTime���Ե�ֵ��
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
     * ����reUrgeTime���Ե�ֵ��
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
