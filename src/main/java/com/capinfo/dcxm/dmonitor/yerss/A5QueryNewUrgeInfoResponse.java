
package com.capinfo.dcxm.dmonitor.yerss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>A5QueryNewUrgeInfoResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="A5QueryNewUrgeInfoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://webservice/}a3UrgeInfoData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "A5QueryNewUrgeInfoResponse", propOrder = {
    "_return"
})
public class A5QueryNewUrgeInfoResponse {

    @XmlElement(name = "return")
    protected A3UrgeInfoData _return;

    /**
     * 获取return属性的值。
     * 
     * @return
     *     possible object is
     *     {@link A3UrgeInfoData }
     *     
     */
    public A3UrgeInfoData getReturn() {
        return _return;
    }

    /**
     * 设置return属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link A3UrgeInfoData }
     *     
     */
    public void setReturn(A3UrgeInfoData value) {
        this._return = value;
    }

}
