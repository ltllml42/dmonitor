
package com.capinfo.dcxm.dmonitor.yerss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>A5QueryNewUrge complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="A5QueryNewUrge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://webservice/}a5DelegateInfo" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arg2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "A5QueryNewUrge", propOrder = {
    "arg0",
    "arg1",
    "arg2"
})
public class A5QueryNewUrge {

    protected A5DelegateInfo arg0;
    protected int arg1;
    protected int arg2;

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
     */
    public int getArg1() {
        return arg1;
    }

    /**
     * ����arg1���Ե�ֵ��
     * 
     */
    public void setArg1(int value) {
        this.arg1 = value;
    }

    /**
     * ��ȡarg2���Ե�ֵ��
     * 
     */
    public int getArg2() {
        return arg2;
    }

    /**
     * ����arg2���Ե�ֵ��
     * 
     */
    public void setArg2(int value) {
        this.arg2 = value;
    }

}
