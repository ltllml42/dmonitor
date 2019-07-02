
package com.capinfo.dcxm.dmonitor.yerss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ticketInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ticketInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lidID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="st" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ticketID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ticketName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userObjectsID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ticketInfo", propOrder = {
    "caseID",
    "entryID",
    "lidID",
    "st",
    "ticketID",
    "ticketName",
    "userObjectsID"
})
public class TicketInfo {

    protected String caseID;
    protected String entryID;
    protected String lidID;
    protected String st;
    protected String ticketID;
    protected String ticketName;
    protected String userObjectsID;

    /**
     * ��ȡcaseID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseID() {
        return caseID;
    }

    /**
     * ����caseID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseID(String value) {
        this.caseID = value;
    }

    /**
     * ��ȡentryID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryID() {
        return entryID;
    }

    /**
     * ����entryID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryID(String value) {
        this.entryID = value;
    }

    /**
     * ��ȡlidID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLidID() {
        return lidID;
    }

    /**
     * ����lidID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLidID(String value) {
        this.lidID = value;
    }

    /**
     * ��ȡst���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSt() {
        return st;
    }

    /**
     * ����st���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSt(String value) {
        this.st = value;
    }

    /**
     * ��ȡticketID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketID() {
        return ticketID;
    }

    /**
     * ����ticketID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketID(String value) {
        this.ticketID = value;
    }

    /**
     * ��ȡticketName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketName() {
        return ticketName;
    }

    /**
     * ����ticketName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketName(String value) {
        this.ticketName = value;
    }

    /**
     * ��ȡuserObjectsID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserObjectsID() {
        return userObjectsID;
    }

    /**
     * ����userObjectsID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserObjectsID(String value) {
        this.userObjectsID = value;
    }

}
