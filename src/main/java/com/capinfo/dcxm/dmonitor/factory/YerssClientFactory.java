package com.capinfo.dcxm.dmonitor.factory;


import com.capinfo.dcxm.dmonitor.client.YerSsWClient;

public class YerssClientFactory {
	public static YerSsWClient getClient(String delegateUUID,
										 String agentID, String orderUnitID){
		
		YerSsWClient y=new YerSsWClient();
		y.setDelegateUUID(delegateUUID);
		y.setAgentID(agentID);
		y.setOrderUnitID(orderUnitID);
		return y;
	}

}
