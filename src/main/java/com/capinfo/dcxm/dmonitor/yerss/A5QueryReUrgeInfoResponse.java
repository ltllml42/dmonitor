
package com.capinfo.dcxm.dmonitor.yerss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>A5QueryReUrgeInfoResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="A5QueryReUrgeInfoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://webservice/}a3ReUrgeInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "A5QueryReUrgeInfoResponse", propOrder = {
    "_return"
})
public class A5QueryReUrgeInfoResponse {

    @XmlElement(name = "return")
    protected A3ReUrgeInfo _return;

    /**
     * 获取return属性的值。
     * 
     * @return
     *     possible object is
     *     {@link A3ReUrgeInfo }
     *     
     */
    public A3ReUrgeInfo getReturn() {
        return _return;
    }

    /**
     * 设置return属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link A3ReUrgeInfo }
     *     
     */
    public void setReturn(A3ReUrgeInfo value) {
        this._return = value;
    }

}
