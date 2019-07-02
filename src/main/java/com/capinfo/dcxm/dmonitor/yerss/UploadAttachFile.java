
package com.capinfo.dcxm.dmonitor.yerss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>uploadAttachFile complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="uploadAttachFile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://webservice/}a5DelegateInfo" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arg2" type="{http://webservice/}attachFileInfo" minOccurs="0"/>
 *         &lt;element name="arg3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadAttachFile", propOrder = {
    "arg0",
    "arg1",
    "arg2",
    "arg3"
})
public class UploadAttachFile {

    protected A5DelegateInfo arg0;
    protected String arg1;
    protected AttachFileInfo arg2;
    protected int arg3;

    /**
     * 获取arg0属性的值。
     * 
     * @return
     *     possible object is
     *     {@link A5DelegateInfo }
     *     
     */
    public A5DelegateInfo getArg0() {
        return arg0;
    }

    /**
     * 设置arg0属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link A5DelegateInfo }
     *     
     */
    public void setArg0(A5DelegateInfo value) {
        this.arg0 = value;
    }

    /**
     * 获取arg1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArg1() {
        return arg1;
    }

    /**
     * 设置arg1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArg1(String value) {
        this.arg1 = value;
    }

    /**
     * 获取arg2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AttachFileInfo }
     *     
     */
    public AttachFileInfo getArg2() {
        return arg2;
    }

    /**
     * 设置arg2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AttachFileInfo }
     *     
     */
    public void setArg2(AttachFileInfo value) {
        this.arg2 = value;
    }

    /**
     * 获取arg3属性的值。
     * 
     */
    public int getArg3() {
        return arg3;
    }

    /**
     * 设置arg3属性的值。
     * 
     */
    public void setArg3(int value) {
        this.arg3 = value;
    }

}
