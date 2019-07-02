
package com.capinfo.dcxm.dmonitor.yerss;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>attachFileInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="attachFileInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="a5ProcessorInfoID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="axType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="base64Infos" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderInfoID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="packageCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="realName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attachFileInfo", propOrder = {
    "a5ProcessorInfoID",
    "axType",
    "base64Infos",
    "fileName",
    "filePath",
    "id",
    "orderInfoID",
    "packageCount",
    "realName",
    "uuid"
})
public class AttachFileInfo {

    protected String a5ProcessorInfoID;
    protected String axType;
    @XmlElement(nillable = true)
    protected List<String> base64Infos;
    protected String fileName;
    protected String filePath;
    @XmlElement(name = "ID")
    protected String id;
    protected String orderInfoID;
    protected int packageCount;
    protected String realName;
    @XmlElement(name = "UUID")
    protected String uuid;

    /**
     * 获取a5ProcessorInfoID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getA5ProcessorInfoID() {
        return a5ProcessorInfoID;
    }

    /**
     * 设置a5ProcessorInfoID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setA5ProcessorInfoID(String value) {
        this.a5ProcessorInfoID = value;
    }

    /**
     * 获取axType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAxType() {
        return axType;
    }

    /**
     * 设置axType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAxType(String value) {
        this.axType = value;
    }

    /**
     * Gets the value of the base64Infos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the base64Infos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBase64Infos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBase64Infos() {
        if (base64Infos == null) {
            base64Infos = new ArrayList<String>();
        }
        return this.base64Infos;
    }

    /**
     * 获取fileName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * 设置fileName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * 获取filePath属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * 设置filePath属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilePath(String value) {
        this.filePath = value;
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
     * 获取orderInfoID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderInfoID() {
        return orderInfoID;
    }

    /**
     * 设置orderInfoID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderInfoID(String value) {
        this.orderInfoID = value;
    }

    /**
     * 获取packageCount属性的值。
     * 
     */
    public int getPackageCount() {
        return packageCount;
    }

    /**
     * 设置packageCount属性的值。
     * 
     */
    public void setPackageCount(int value) {
        this.packageCount = value;
    }

    /**
     * 获取realName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置realName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRealName(String value) {
        this.realName = value;
    }

    /**
     * 获取uuid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * 设置uuid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(String value) {
        this.uuid = value;
    }

}
