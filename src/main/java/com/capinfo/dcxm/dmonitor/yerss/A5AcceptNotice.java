
package com.capinfo.dcxm.dmonitor.yerss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>A5AcceptNotice complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="A5AcceptNotice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://webservice/}a5DelegateInfo" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://webservice/}a5Notice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "A5AcceptNotice", propOrder = {
    "arg0",
    "arg1"
})
public class A5AcceptNotice {

    protected A5DelegateInfo arg0;
    protected A5Notice arg1;

    /**
     * ��ȡarg0���Ե�ֵ��
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
     * ����arg0���Ե�ֵ��
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
     * ��ȡarg1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link A5Notice }
     *     
     */
    public A5Notice getArg1() {
        return arg1;
    }

    /**
     * ����arg1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link A5Notice }
     *     
     */
    public void setArg1(A5Notice value) {
        this.arg1 = value;
    }

}
