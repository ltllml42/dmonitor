
package com.capinfo.dcxm.dmonitor.yerss;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "A5ServerSoapDelegate", targetNamespace = "http://webservice/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface A5ServerSoapDelegate {


    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<com.capinfo.dcxm.dmonitor.yerss.TicketInfo>
     */
    @WebMethod(operationName = "A5QueryNewOrder")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "A5QueryNewOrder", targetNamespace = "http://webservice/", className = "com.capinfo.dcxm.dmonitor.yerss.A5QueryNewOrder")
    @ResponseWrapper(localName = "A5QueryNewOrderResponse", targetNamespace = "http://webservice/", className = "com.capinfo.dcxm.dmonitor.yerss.A5QueryNewOrderResponse")
    public List<TicketInfo> a5QueryNewOrder(
            @WebParam(name = "arg0", targetNamespace = "")
                    A5DelegateInfo arg0,
            @WebParam(name = "arg1", targetNamespace = "")
                    int arg1,
            @WebParam(name = "arg2", targetNamespace = "")
                    int arg2);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns com.capinfo.dcxm.dmonitor.yerss.A5OrderQueryResult
     */
    @WebMethod(operationName = "A5QueryOrder")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "A5QueryOrder", targetNamespace = "http://webservice/", className = "com.capinfo.dcxm.dmonitor.yerss.A5QueryOrder")
    @ResponseWrapper(localName = "A5QueryOrderResponse", targetNamespace = "http://webservice/", className = "com.capinfo.dcxm.dmonitor.yerss.A5QueryOrderResponse")
    public A5OrderQueryResult a5QueryOrder(
            @WebParam(name = "arg0", targetNamespace = "")
                    A5DelegateInfo arg0,
            @WebParam(name = "arg1", targetNamespace = "")
                    String arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "A5SignOrder")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "A5SignOrder", targetNamespace = "http://webservice/", className = "com.capinfo.dcxm.dmonitor.yerss.A5SignOrder")
    @ResponseWrapper(localName = "A5SignOrderResponse", targetNamespace = "http://webservice/", className = "com.capinfo.dcxm.dmonitor.yerss.A5SignOrderResponse")
    public boolean a5SignOrder(
            @WebParam(name = "arg0", targetNamespace = "")
                    A5DelegateInfo arg0,
            @WebParam(name = "arg1", targetNamespace = "")
                    A5ProcessInfo arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "A5ReplyResult")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "A5ReplyResult", targetNamespace = "http://webservice/", className = "com.capinfo.dcxm.dmonitor.yerss.A5ReplyResult")
    @ResponseWrapper(localName = "A5ReplyResultResponse", targetNamespace = "http://webservice/", className = "com.capinfo.dcxm.dmonitor.yerss.A5ReplyResultResponse")
    public boolean a5ReplyResult(
            @WebParam(name = "arg0", targetNamespace = "")
                    A5DelegateInfo arg0,
            @WebParam(name = "arg1", targetNamespace = "")
                    A5ProcessInfo arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "A5RejectOrder")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "A5RejectOrder", targetNamespace = "http://webservice/", className = "com.capinfo.dcxm.dmonitor.yerss.A5RejectOrder")
    @ResponseWrapper(localName = "A5RejectOrderResponse", targetNamespace = "http://webservice/", className = "com.capinfo.dcxm.dmonitor.yerss.A5RejectOrderResponse")
    public boolean a5RejectOrder(
            @WebParam(name = "arg0", targetNamespace = "")
                    A5DelegateInfo arg0,
            @WebParam(name = "arg1", targetNamespace = "")
                    A5ProcessInfo arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "A5RequestDelay")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "A5RequestDelay", targetNamespace = "http://webservice/", className = "com.capinfo.dcxm.dmonitor.yerss.A5RequestDelay")
    @ResponseWrapper(localName = "A5RequestDelayResponse", targetNamespace = "http://webservice/", className = "com.capinfo.dcxm.dmonitor.yerss.A5RequestDelayResponse")
    public boolean a5RequestDelay(
            @WebParam(name = "arg0", targetNamespace = "")
                    A5DelegateInfo arg0,
            @WebParam(name = "arg1", targetNamespace = "")
                    A5ProcessInfo arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "A5RejectSignOrder")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "A5RejectSignOrder", targetNamespace = "http://webservice/", className = "com.capinfo.dcxm.dmonitor.yerss.A5RejectSignOrder")
    @ResponseWrapper(localName = "A5RejectSignOrderResponse", targetNamespace = "http://webservice/", className = "com.capinfo.dcxm.dmonitor.yerss.A5RejectSignOrderResponse")
    public boolean a5RejectSignOrder(
            @WebParam(name = "arg0", targetNamespace = "")
                    A5DelegateInfo arg0,
            @WebParam(name = "arg1", targetNamespace = "")
                    A5ProcessInfo arg1);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<com.capinfo.dcxm.dmonitor.yerss.TicketInfo>
     */
    @WebMethod(operationName = "A5QueryNewUrge")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "A5QueryNewUrge", targetNamespace = "http://webservice/", className = "com.capinfo.dcxm.dmonitor.yerss.A5QueryNewUrge")
    @ResponseWrapper(localName = "A5QueryNewUrgeResponse", targetNamespace = "http://webservice/", className = "com.capinfo.dcxm.dmonitor.yerss.A5QueryNewUrgeResponse")
    public List<TicketInfo> a5QueryNewUrge(
            @WebParam(name = "arg0", targetNamespace = "")
                    A5DelegateInfo arg0,
            @WebParam(name = "arg1", targetNamespace = "")
                    int arg1,
            @WebParam(name = "arg2", targetNamespace = "")
                    int arg2);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns com.capinfo.dcxm.dmonitor.yerss.A3UrgeInfoData
     */
    @WebMethod(operationName = "A5QueryNewUrgeInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "A5QueryNewUrgeInfo", targetNamespace = "http://webservice/", className = "com.capinfo.dcxm.dmonitor.yerss.A5QueryNewUrgeInfo")
    @ResponseWrapper(localName = "A5QueryNewUrgeInfoResponse", targetNamespace = "http://webservice/", className = "com.capinfo.dcxm.dmonitor.yerss.A5QueryNewUrgeInfoResponse")
    public A3UrgeInfoData a5QueryNewUrgeInfo(
            @WebParam(name = "arg0", targetNamespace = "")
                    A5DelegateInfo arg0,
            @WebParam(name = "arg1", targetNamespace = "")
                    String arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns com.capinfo.dcxm.dmonitor.yerss.A3UrgeInfo
     */
    @WebMethod(operationName = "A5QueryUrgeInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "A5QueryUrgeInfo", targetNamespace = "http://webservice/", className = "com.capinfo.dcxm.dmonitor.yerss.A5QueryUrgeInfo")
    @ResponseWrapper(localName = "A5QueryUrgeInfoResponse", targetNamespace = "http://webservice/", className = "com.capinfo.dcxm.dmonitor.yerss.A5QueryUrgeInfoResponse")
    public A3UrgeInfo a5QueryUrgeInfo(
            @WebParam(name = "arg0", targetNamespace = "")
                    A5DelegateInfo arg0,
            @WebParam(name = "arg1", targetNamespace = "")
                    String arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "A5SignOrderUrge")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "A5SignOrderUrge", targetNamespace = "http://webservice/", className = "com.capinfo.dcxm.dmonitor.yerss.A5SignOrderUrge")
    @ResponseWrapper(localName = "A5SignOrderUrgeResponse", targetNamespace = "http://webservice/", className = "com.capinfo.dcxm.dmonitor.yerss.A5SignOrderUrgeResponse")
    public boolean a5SignOrderUrge(
            @WebParam(name = "arg0", targetNamespace = "")
                    A5DelegateInfo arg0,
            @WebParam(name = "arg1", targetNamespace = "")
                    A3UrgeInfo arg1);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<com.capinfo.dcxm.dmonitor.yerss.TicketInfo>
     */
    @WebMethod(operationName = "A5QueryNewReUrge")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "A5QueryNewReUrge", targetNamespace = "http://webservice/", className = "com.capinfo.dcxm.dmonitor.yerss.A5QueryNewReUrge")
    @ResponseWrapper(localName = "A5QueryNewReUrgeResponse", targetNamespace = "http://webservice/", className = "com.capinfo.dcxm.dmonitor.yerss.A5QueryNewReUrgeResponse")
    public List<TicketInfo> a5QueryNewReUrge(
            @WebParam(name = "arg0", targetNamespace = "")
                    A5DelegateInfo arg0,
            @WebParam(name = "arg1", targetNamespace = "")
                    int arg1,
            @WebParam(name = "arg2", targetNamespace = "")
                    int arg2);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns com.capinfo.dcxm.dmonitor.yerss.A3ReUrgeInfoData
     */
    @WebMethod(operationName = "A5QueryNewReUrgeInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "A5QueryNewReUrgeInfo", targetNamespace = "http://webservice/", className = "com.capinfo.dcxm.dmonitor.yerss.A5QueryNewReUrgeInfo")
    @ResponseWrapper(localName = "A5QueryNewReUrgeInfoResponse", targetNamespace = "http://webservice/", className = "com.capinfo.dcxm.dmonitor.yerss.A5QueryNewReUrgeInfoResponse")
    public A3ReUrgeInfoData a5QueryNewReUrgeInfo(
            @WebParam(name = "arg0", targetNamespace = "")
                    A5DelegateInfo arg0,
            @WebParam(name = "arg1", targetNamespace = "")
                    String arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns com.capinfo.dcxm.dmonitor.yerss.A3ReUrgeInfo
     */
    @WebMethod(operationName = "A5QueryReUrgeInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "A5QueryReUrgeInfo", targetNamespace = "http://webservice/", className = "com.capinfo.dcxm.dmonitor.yerss.A5QueryReUrgeInfo")
    @ResponseWrapper(localName = "A5QueryReUrgeInfoResponse", targetNamespace = "http://webservice/", className = "com.capinfo.dcxm.dmonitor.yerss.A5QueryReUrgeInfoResponse")
    public A3ReUrgeInfo a5QueryReUrgeInfo(
            @WebParam(name = "arg0", targetNamespace = "")
                    A5DelegateInfo arg0,
            @WebParam(name = "arg1", targetNamespace = "")
                    String arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "A5SignOrderReUrge")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "A5SignOrderReUrge", targetNamespace = "http://webservice/", className = "com.capinfo.dcxm.dmonitor.yerss.A5SignOrderReUrge")
    @ResponseWrapper(localName = "A5SignOrderReUrgeResponse", targetNamespace = "http://webservice/", className = "com.capinfo.dcxm.dmonitor.yerss.A5SignOrderReUrgeResponse")
    public boolean a5SignOrderReUrge(
            @WebParam(name = "arg0", targetNamespace = "")
                    A5DelegateInfo arg0,
            @WebParam(name = "arg1", targetNamespace = "")
                    A3ReUrgeInfo arg1);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns com.capinfo.dcxm.dmonitor.yerss.OrderInfo
     */
    @WebMethod(operationName = "A5SubmitOrder")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "A5SubmitOrder", targetNamespace = "http://webservice/", className = "com.capinfo.dcxm.dmonitor.yerss.A5SubmitOrder")
    @ResponseWrapper(localName = "A5SubmitOrderResponse", targetNamespace = "http://webservice/", className = "com.capinfo.dcxm.dmonitor.yerss.A5SubmitOrderResponse")
    public OrderInfo a5SubmitOrder(
            @WebParam(name = "arg0", targetNamespace = "")
                    A5DelegateInfo arg0,
            @WebParam(name = "arg1", targetNamespace = "")
                    RecordOrder arg1,
            @WebParam(name = "arg2", targetNamespace = "")
                    boolean arg2);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<com.capinfo.dcxm.dmonitor.yerss.A5Notice>
     */
    @WebMethod(operationName = "A5QueryNewNotice")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "A5QueryNewNotice", targetNamespace = "http://webservice/", className = "com.capinfo.dcxm.dmonitor.yerss.A5QueryNewNotice")
    @ResponseWrapper(localName = "A5QueryNewNoticeResponse", targetNamespace = "http://webservice/", className = "com.capinfo.dcxm.dmonitor.yerss.A5QueryNewNoticeResponse")
    public List<A5Notice> a5QueryNewNotice(
            @WebParam(name = "arg0", targetNamespace = "")
                    A5DelegateInfo arg0,
            @WebParam(name = "arg1", targetNamespace = "")
                    int arg1,
            @WebParam(name = "arg2", targetNamespace = "")
                    int arg2);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "A5AcceptNotice")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "A5AcceptNotice", targetNamespace = "http://webservice/", className = "com.capinfo.dcxm.dmonitor.yerss.A5AcceptNotice")
    @ResponseWrapper(localName = "A5AcceptNoticeResponse", targetNamespace = "http://webservice/", className = "com.capinfo.dcxm.dmonitor.yerss.A5AcceptNoticeResponse")
    public boolean a5AcceptNotice(
            @WebParam(name = "arg0", targetNamespace = "")
                    A5DelegateInfo arg0,
            @WebParam(name = "arg1", targetNamespace = "")
                    A5Notice arg1);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns com.capinfo.dcxm.dmonitor.yerss.AttachFileInfo
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "downloadAttachFile", targetNamespace = "http://webservice/", className = "com.capinfo.dcxm.dmonitor.yerss.DownloadAttachFile")
    @ResponseWrapper(localName = "downloadAttachFileResponse", targetNamespace = "http://webservice/", className = "com.capinfo.dcxm.dmonitor.yerss.DownloadAttachFileResponse")
    public AttachFileInfo downloadAttachFile(
            @WebParam(name = "arg0", targetNamespace = "")
                    A5DelegateInfo arg0,
            @WebParam(name = "arg1", targetNamespace = "")
                    AttachFileInfo arg1,
            @WebParam(name = "arg2", targetNamespace = "")
                    int arg2);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns com.capinfo.dcxm.dmonitor.yerss.AttachFileInfo
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "uploadAttachFile", targetNamespace = "http://webservice/", className = "com.capinfo.dcxm.dmonitor.yerss.UploadAttachFile")
    @ResponseWrapper(localName = "uploadAttachFileResponse", targetNamespace = "http://webservice/", className = "com.capinfo.dcxm.dmonitor.yerss.UploadAttachFileResponse")
    public AttachFileInfo uploadAttachFile(
            @WebParam(name = "arg0", targetNamespace = "")
                    A5DelegateInfo arg0,
            @WebParam(name = "arg1", targetNamespace = "")
                    String arg1,
            @WebParam(name = "arg2", targetNamespace = "")
                    AttachFileInfo arg2,
            @WebParam(name = "arg3", targetNamespace = "")
                    int arg3);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<com.capinfo.dcxm.dmonitor.yerss.PoolInfo>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPoolBuffer", targetNamespace = "http://webservice/", className = "com.capinfo.dcxm.dmonitor.yerss.GetPoolBuffer")
    @ResponseWrapper(localName = "getPoolBufferResponse", targetNamespace = "http://webservice/", className = "com.capinfo.dcxm.dmonitor.yerss.GetPoolBufferResponse")
    public List<PoolInfo> getPoolBuffer(
            @WebParam(name = "arg0", targetNamespace = "")
                    A5DelegateInfo arg0);

}
