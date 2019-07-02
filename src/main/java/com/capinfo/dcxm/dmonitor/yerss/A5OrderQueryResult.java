
package com.capinfo.dcxm.dmonitor.yerss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>a5OrderQueryResult complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="a5OrderQueryResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dispatchInfo" type="{http://webservice/}a3DispatchInfo" minOccurs="0"/>
 *         &lt;element name="errorNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderInfo" type="{http://webservice/}orderInfo" minOccurs="0"/>
 *         &lt;element name="processInfo" type="{http://webservice/}a5ProcessInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a5OrderQueryResult", propOrder = {
    "dispatchInfo",
    "errorNum",
    "orderInfo",
    "processInfo"
})
public class A5OrderQueryResult {

    protected A3DispatchInfo dispatchInfo;
    protected String errorNum;
    protected OrderInfo orderInfo;
    protected A5ProcessInfo processInfo;

    /**
     * ��ȡdispatchInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link A3DispatchInfo }
     *     
     */
    public A3DispatchInfo getDispatchInfo() {
        return dispatchInfo;
    }

    /**
     * ����dispatchInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link A3DispatchInfo }
     *     
     */
    public void setDispatchInfo(A3DispatchInfo value) {
        this.dispatchInfo = value;
    }

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
     * ��ȡorderInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OrderInfo }
     *     
     */
    public OrderInfo getOrderInfo() {
        return orderInfo;
    }

    /**
     * ����orderInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OrderInfo }
     *     
     */
    public void setOrderInfo(OrderInfo value) {
        this.orderInfo = value;
    }

    /**
     * ��ȡprocessInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link A5ProcessInfo }
     *     
     */
    public A5ProcessInfo getProcessInfo() {
        return processInfo;
    }

    /**
     * ����processInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link A5ProcessInfo }
     *     
     */
    public void setProcessInfo(A5ProcessInfo value) {
        this.processInfo = value;
    }

}
