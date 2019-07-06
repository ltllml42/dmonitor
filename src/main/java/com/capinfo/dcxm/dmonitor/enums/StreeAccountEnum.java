package com.capinfo.dcxm.dmonitor.enums;


public enum StreeAccountEnum {
	HPL("W25200000","8c17442074034c0e95296d2d9c02d109","252","东城区和平里街道","109"),
	WBJ("W101000","354bc37017284983bac0704d5fa7f90f","1","东城区","0"),
	QM("W25300000","a9c72dd3db9542cc9a199f8286b554d3","253","东城区前门街道","114"),
	DZM("W25400000","a2ca9def96264e4bb078d74bd6fae587","254","东城区东直门街道接口账号","108"),
	CWM("W25500000","bd3df2dd3a2643c8bfe3f3f1d1a8dea6","255","东城区崇文门外街道接口账号","104"),
	ADM("W25600000","50cc1342df8d4e57be072df0bee693fc","256","东城区安定门街道接口账号","101"),
	DHS("W25700000","eefd4b89bcc54956a8947e4ea62982b9","257","东城区东花市街道接口账号","105"),
	BXQ("W25800000","39f03e5b4dc441b5b7de14ed632291a3","258","东城区北新桥街道接口账号","102"),
	LT("W25900000","09fd4ab12a194b6ca43a629cf4fd8d7c","259","东城区龙潭街道接口账号","113"),
	JDK("W26000000","bca297d9f3464580ace417b7a1d04a61","260","东城区交道口街道接口账号","111"),
	TYG("W26100000","f4ad88995b9141ddaeec6f75825cc4b6","261","东城区体育馆路街道接口账号","115"),
	CYM("W26200000","1cdf550e28d34726987b6cd1f82c02f1","262","东城区朝阳门街道接口账号","103"),
	TT("W26300000","f112b808098240b9bd4a341102dfbe37","263","东城区天坛街道接口账号","116"),
	DS("W26400000","148e49923448406285f1d6b867ec6258","264","东城区东四街道接口账号","107"),
	YDM("W26500000","9bdd0e78a5974f4bb42806f4789bed83","265","东城区永定门外街道接口账号","117"),
	JS("W26600000","1f9d212b8f9e4569b4f99176d55385b6","266","东城区景山街道接口账号","112"),
	JGM("W26700000","f0eea9148341482e9d3959afc6f73b7d","267","东城区建国门街道接口账号","110"),
	DHM("W26800000","56eb93276bc14058be764f384494fb04","268","东城区东华门街道","106");
	
	private StreeAccountEnum(String agentID, String delegateUUID,
			String orderUnitID, String name,String dispatchUnit) {
		this.agentID = agentID;
		this.delegateUUID = delegateUUID;
		this.orderUnitID = orderUnitID;
		this.name = name;
		this.dispatchUnit = dispatchUnit;
	}
	private String agentID;
	private String delegateUUID;
	private String orderUnitID;
	private String name;
	private String dispatchUnit;
	
	
	
	
	
	public String getDispatchUnit() {
		return dispatchUnit;
	}



	public void setDispatchUnit(String dispatchUnit) {
		this.dispatchUnit = dispatchUnit;
	}



	public String getAgentID() {
		return agentID;
	}



	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}



	public String getDelegateUUID() {
		return delegateUUID;
	}



	public void setDelegateUUID(String delegateUUID) {
		this.delegateUUID = delegateUUID;
	}



	public String getOrderUnitID() {
		return orderUnitID;
	}



	public void setOrderUnitID(String orderUnitID) {
		this.orderUnitID = orderUnitID;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public static StreeAccountEnum getByAgentId(String agentID){
		for(StreeAccountEnum s:StreeAccountEnum.values()){
			if(s.getAgentID().equals(agentID)){
				return s;
			}
		}
		return null;
		
	}
	
	public static StreeAccountEnum getByUnitId(String unitID){
		for(StreeAccountEnum s:StreeAccountEnum.values()){
			if(s.getDispatchUnit().equals(unitID)){
				return s;
			}
		}
		return null;
		
	}

}
