
package com.capinfo.dcxm.dmonitor.yerss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>a3ReUrgeInfoData complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="a3ReUrgeInfoData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reUrgeInfo" type="{http://webservice/}a3ReUrgeInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a3ReUrgeInfoData", propOrder = {
    "errorNum",
    "reUrgeInfo"
})
public class A3ReUrgeInfoData {

    protected String errorNum;
    protected A3ReUrgeInfo reUrgeInfo;

    /**
     * 获取errorNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorNum() {
        return errorNum;
    }

    /**
     * 设置errorNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorNum(String value) {
        this.errorNum = value;
    }

    /**
     * 获取reUrgeInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link A3ReUrgeInfo }
     *     
     */
    public A3ReUrgeInfo getReUrgeInfo() {
        return reUrgeInfo;
    }

    /**
     * 设置reUrgeInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link A3ReUrgeInfo }
     *     
     */
    public void setReUrgeInfo(A3ReUrgeInfo value) {
        this.reUrgeInfo = value;
    }

}
