
package com.capinfo.dcxm.dmonitor.yerss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>a3ReUrgeInfoData complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡerrorNum���Ե�ֵ��
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
     * ����errorNum���Ե�ֵ��
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
     * ��ȡreUrgeInfo���Ե�ֵ��
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
     * ����reUrgeInfo���Ե�ֵ��
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
