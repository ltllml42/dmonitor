
package com.capinfo.dcxm.dmonitor.yerss;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>recordCustomer complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡaddressDetail���Ե�ֵ��
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
     * ����addressDetail���Ե�ֵ��
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
     * ��ȡcountryID���Ե�ֵ��
     * 
     */
    public int getCountryID() {
        return countryID;
    }

    /**
     * ����countryID���Ե�ֵ��
     * 
     */
    public void setCountryID(int value) {
        this.countryID = value;
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
     * ��ȡdistrictID���Ե�ֵ��
     * 
     */
    public int getDistrictID() {
        return districtID;
    }

    /**
     * ����districtID���Ե�ֵ��
     * 
     */
    public void setDistrictID(int value) {
        this.districtID = value;
    }

    /**
     * ��ȡgenderID���Ե�ֵ��
     * 
     */
    public int getGenderID() {
        return genderID;
    }

    /**
     * ����genderID���Ե�ֵ��
     * 
     */
    public void setGenderID(int value) {
        this.genderID = value;
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
     * ��ȡisOldCustomer���Ե�ֵ��
     * 
     */
    public boolean isISOldCustomer() {
        return isOldCustomer;
    }

    /**
     * ����isOldCustomer���Ե�ֵ��
     * 
     */
    public void setISOldCustomer(boolean value) {
        this.isOldCustomer = value;
    }

    /**
     * ��ȡisSecret���Ե�ֵ��
     * 
     */
    public boolean isIsSecret() {
        return isSecret;
    }

    /**
     * ����isSecret���Ե�ֵ��
     * 
     */
    public void setIsSecret(boolean value) {
        this.isSecret = value;
    }

    /**
     * ��ȡname���Ե�ֵ��
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
     * ����name���Ե�ֵ��
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
     * ��ȡprovinceID���Ե�ֵ��
     * 
     */
    public int getProvinceID() {
        return provinceID;
    }

    /**
     * ����provinceID���Ե�ֵ��
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
     * ��ȡspecialTypeID���Ե�ֵ��
     * 
     */
    public int getSpecialTypeID() {
        return specialTypeID;
    }

    /**
     * ����specialTypeID���Ե�ֵ��
     * 
     */
    public void setSpecialTypeID(int value) {
        this.specialTypeID = value;
    }

}
