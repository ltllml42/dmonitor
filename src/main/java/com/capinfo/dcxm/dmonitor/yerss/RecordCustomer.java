
package com.capinfo.dcxm.dmonitor.yerss;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>recordCustomer complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="recordCustomer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="districtID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="genderID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ISOldCustomer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isSecret" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provinceID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="recordContacts" type="{http://webservice/}recordContact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="specialTypeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recordCustomer", propOrder = {
    "addressDetail",
    "countryID",
    "createTime",
    "districtID",
    "genderID",
    "id",
    "isOldCustomer",
    "isSecret",
    "name",
    "provinceID",
    "recordContacts",
    "specialTypeID"
})
public class RecordCustomer {

    protected String addressDetail;
    protected int countryID;
    protected String createTime;
    protected int districtID;
    protected int genderID;
    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "ISOldCustomer")
    protected boolean isOldCustomer;
    protected boolean isSecret;
    protected String name;
    protected int provinceID;
    @XmlElement(nillable = true)
    protected List<RecordContact> recordContacts;
    protected int specialTypeID;

    /**
     * 获取addressDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressDetail() {
        return addressDetail;
    }

    /**
     * 设置addressDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressDetail(String value) {
        this.addressDetail = value;
    }

    /**
     * 获取countryID属性的值。
     * 
     */
    public int getCountryID() {
        return countryID;
    }

    /**
     * 设置countryID属性的值。
     * 
     */
    public void setCountryID(int value) {
        this.countryID = value;
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
     * 获取districtID属性的值。
     * 
     */
    public int getDistrictID() {
        return districtID;
    }

    /**
     * 设置districtID属性的值。
     * 
     */
    public void setDistrictID(int value) {
        this.districtID = value;
    }

    /**
     * 获取genderID属性的值。
     * 
     */
    public int getGenderID() {
        return genderID;
    }

    /**
     * 设置genderID属性的值。
     * 
     */
    public void setGenderID(int value) {
        this.genderID = value;
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
     * 获取isOldCustomer属性的值。
     * 
     */
    public boolean isISOldCustomer() {
        return isOldCustomer;
    }

    /**
     * 设置isOldCustomer属性的值。
     * 
     */
    public void setISOldCustomer(boolean value) {
        this.isOldCustomer = value;
    }

    /**
     * 获取isSecret属性的值。
     * 
     */
    public boolean isIsSecret() {
        return isSecret;
    }

    /**
     * 设置isSecret属性的值。
     * 
     */
    public void setIsSecret(boolean value) {
        this.isSecret = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取provinceID属性的值。
     * 
     */
    public int getProvinceID() {
        return provinceID;
    }

    /**
     * 设置provinceID属性的值。
     * 
     */
    public void setProvinceID(int value) {
        this.provinceID = value;
    }

    /**
     * Gets the value of the recordContacts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordContacts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordContacts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecordContact }
     * 
     * 
     */
    public List<RecordContact> getRecordContacts() {
        if (recordContacts == null) {
            recordContacts = new ArrayList<RecordContact>();
        }
        return this.recordContacts;
    }

    /**
     * 获取specialTypeID属性的值。
     * 
     */
    public int getSpecialTypeID() {
        return specialTypeID;
    }

    /**
     * 设置specialTypeID属性的值。
     * 
     */
    public void setSpecialTypeID(int value) {
        this.specialTypeID = value;
    }

}
