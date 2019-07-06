package com.capinfo.dcxm.dmonitor.client;

import com.capinfo.dcxm.dmonitor.utils.BeanUtils;
import com.capinfo.dcxm.dmonitor.utils.JsonUtil;
import com.capinfo.dcxm.dmonitor.yerss.*;

import java.lang.reflect.InvocationTargetException;
import java.util.List;


public class YerSsWClient {
	
	private String delegateUUID;
	private String agentID;
	private String orderUnitID;
	
	public String getOrderUnitID() {
		return orderUnitID;
	}
	public void setOrderUnitID(String orderUnitID) {
		this.orderUnitID = orderUnitID;
	}
	public String getDelegateUUID() {
		return delegateUUID;
	}
	public void setDelegateUUID(String delegateUUID) {
		this.delegateUUID = delegateUUID;
	}
	public String getAgentID() {
		return agentID;
	}
	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}
	
	/**
	 * 查询最新工单
	 * 
	 * A5DelegateInfo： WebService 代理类，以下同理。
		maxCount ：最大获取数，当超过 100 时，只返回 100 个 TicketInfo 对象。
		ignoreCount：忽略对象个数,如：参数（delegate，100,50），返回 51-150 记录的 Ticket。
		备注：获取 A5ProcessInfo 对象前，需先获取 TicketInfo 内的 A5ProcessInfoID。
	 * @return
	 */
	public List<TicketInfo> queryNewOrder(int maxCount, int ignoreCount){
		A5DelegateInfo a5Delegate = getA5DelegateInfo();
		A5ServerSoapService soapService=new A5ServerSoapService();
		System.out.println(soapService.getWSDLDocumentLocation());
		A5ServerSoapDelegate delegate=soapService.getA5ServerSoapPort();
		return delegate.a5QueryNewOrder(a5Delegate, maxCount, ignoreCount);
	}
	
		
	public static void main(String[] args) {
		YerSsWClient ysw = new YerSsWClient();
		ysw.setAgentID("W101000");
		ysw.setDelegateUUID("354bc37017284983bac0704d5fa7f90f");
		ysw.setOrderUnitID("1");
		List<TicketInfo> taskInfo = ysw.queryNewOrder(100, 0);
		for (TicketInfo ticketInfo : taskInfo) {
			System.out.println(ticketInfo.getUserObjectsID());
		}
	}
	
	/**
	 * 获取详情信息
	 * 
	 * a5ProcessInfoID：根据 TicketInfo 内的 userObjectsID 的进行获取，
		userObjectsID 的存储方式为对象类名与对象 ID 值用逗号进行分割。
		返回值：A5OrderQueryResult(OrderInfo，A3DispatchInfo，A5ProcessInfo)。
		备注：通过 a5ProcessInfoID 获取 A5ProcessInfo 详细信息。
	 * @return
	 */
	public A5OrderQueryResult queryOrderDetail(String a5ProcessInfoID){
		A5DelegateInfo a5Delegate = getA5DelegateInfo();
		A5ServerSoapService soapService=new A5ServerSoapService();
		A5ServerSoapDelegate delegate=soapService.getA5ServerSoapPort();
		return delegate.a5QueryOrder(a5Delegate,a5ProcessInfoID);
	}

	
	/**
	 * 签收工单
	 * 
	 * 解释：A5ProcessInfo：主要提交数据为 A5ProcessInfo(ID,OrderUnitID)，返回 boolean
			值。
			更新字段：A5ProcessInfo（A5ProcessorState）。
			备注：处理工单前，首先要进行签收工单，然后进入待处理的队列。
	 */
	public boolean  signInOrder(String a5ProcessInfoID){
		A5DelegateInfo a5Delegate=getA5DelegateInfo();
		A5ServerSoapService soapService=new A5ServerSoapService();
		A5ServerSoapDelegate delegate=soapService.getA5ServerSoapPort();
		A5ProcessInfo info = null;
		info = getA5ProcessInfo(a5ProcessInfoID);
		return delegate.a5SignOrder(a5Delegate,info);
	}
	
	
	/**
	 *  退回工单
	 * 
	 * 解释：A5ProcessInfo ：主要提交数据为 A5ProcessInfo(Reason,ID,
		OrderUnitID)，返回 boolean 值.
		更新字段：A5ProcessInfo（Reason，A5ProcessorState）。
		备注：若工单不属于本分中心的业务范围内，可退回工单。
	 */
	public boolean rejectOrder(A5ProcessInfo a5ProcessInfo){
		A5DelegateInfo a5Delegate=getA5DelegateInfo();
		A5ServerSoapService soapService=new A5ServerSoapService();
		A5ServerSoapDelegate delegate=soapService.getA5ServerSoapPort();
		A5ProcessInfo info=getA5ProcessInfo(a5ProcessInfo.getID());
		try {
			BeanUtils.copyNotNullProperties(info, a5ProcessInfo);
			return delegate.a5RejectOrder(a5Delegate,info);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	/**
	 *  签收后退回工单
	 * 
	 * 解释：A5ProcessInfo ：主要提交数据为 A5ProcessInfo(Reason,ID,
		OrderUnitID)，返回 boolean 值.
		更新字段：A5ProcessInfo（Reason，A5ProcessorState）。
		备注：若工单不属于本分中心的业务范围内，可退回工单。
	 */
	public boolean rejectSignOrder(A5ProcessInfo a5ProcessInfo){
		A5DelegateInfo a5Delegate=getA5DelegateInfo();
		A5ServerSoapService soapService=new A5ServerSoapService();
		A5ServerSoapDelegate delegate=soapService.getA5ServerSoapPort();
		A5ProcessInfo info=getA5ProcessInfo(a5ProcessInfo.getID());
		try {
			BeanUtils.copyNotNullProperties(info, a5ProcessInfo);
			return delegate.a5RejectSignOrder(a5Delegate,info);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	/**
	 *  推送工单
	 * 
	 * 解释：A5ProcessInfo ：主要提交数据为 A5ProcessInfo(HandleResult,ID, OrderUnitID)，返回 boolean 值.
		更新字段：A5ProcessInfo（HandleResult，A5ProcessorState）。
	 */
	public boolean A5ReplyResult(A5ProcessInfo a5ProcessInfo){
		A5DelegateInfo a5Delegate=getA5DelegateInfo();
		A5ProcessInfo info=getA5ProcessInfo(a5ProcessInfo.getID());
		A5ServerSoapService soapService=new A5ServerSoapService();
		A5ServerSoapDelegate delegate=soapService.getA5ServerSoapPort();
		try {
			BeanUtils.copyNotNullProperties(info, a5ProcessInfo);
			System.out.println("a5Delegate"+ JsonUtil.objectToJsonStr(a5Delegate));
			System.out.println("info"+JsonUtil.objectToJsonStr(info));
			return delegate.a5ReplyResult(a5Delegate,info);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	/**
	 * 申请延期
	 * @param process
	 * @return
	 */
	public boolean a5RequestDelay(A5ProcessInfo process){
		A5DelegateInfo a5Delegate=getA5DelegateInfo();
		A5ProcessInfo info=getA5ProcessInfo(process.getID());
		
		A5ServerSoapService soapService=new A5ServerSoapService();
		A5ServerSoapDelegate delegate=soapService.getA5ServerSoapPort();
		try {
			BeanUtils.copyNotNullProperties(info, process);
			return delegate.a5RequestDelay(a5Delegate, info);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	
	
	/**
	 * 获取通知详情
	 */
	public List<A5Notice> queryNotices(){
		A5DelegateInfo a5Delegate=getA5DelegateInfo();
		A5ServerSoapService soapService=new A5ServerSoapService();
		A5ServerSoapDelegate delegate=soapService.getA5ServerSoapPort();
		List<A5Notice> notices=delegate.a5QueryNewNotice(a5Delegate, 10, 0);
		return notices;
	}

	
	/**
	 * 用于
	 * @param a5Notice
	 */
	public boolean acceptNotice(A5Notice a5Notice){
		A5DelegateInfo a5Delegate=getA5DelegateInfo();
		A5ServerSoapService soapService=new A5ServerSoapService();
		A5ServerSoapDelegate delegate=soapService.getA5ServerSoapPort();
		return delegate.a5AcceptNotice(a5Delegate, a5Notice);
		
	}
	
	
	
	private A5ProcessInfo getA5ProcessInfo(String id) {
		A5ProcessInfo info=new A5ProcessInfo();
		info.setID(id);
		info.setOrderUnitID(orderUnitID);
		return info;
	}
	
	private A5DelegateInfo getA5DelegateInfo() {
		A5DelegateInfo a5Delegate =new A5DelegateInfo();
		a5Delegate.setDelegateUUID(delegateUUID);
		a5Delegate.setAgentID(agentID);
		return a5Delegate;
	}
	
	
	
	
	
}
