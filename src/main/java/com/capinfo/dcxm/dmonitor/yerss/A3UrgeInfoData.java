
package com.capinfo.dcxm.dmonitor.yerss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>a3UrgeInfoData complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="a3UrgeInfoData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urgeInfo" type="{http://webservice/}a3UrgeInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a3UrgeInfoData", propOrder = {
    "errorNum",
    "urgeInfo"
})
public class A3UrgeInfoData {

    protected String errorNum;
    protected A3UrgeInfo urgeInfo;

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
     * ��ȡurgeInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link A3UrgeInfo }
     *     
     */
    public A3UrgeInfo getUrgeInfo() {
        return urgeInfo;
    }

    /**
     * ����urgeInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link A3UrgeInfo }
     *     
     */
    public void setUrgeInfo(A3UrgeInfo value) {
        this.urgeInfo = value;
    }

}
