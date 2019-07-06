package com.capinfo.dcxm.dmonitor.yersstest;

import com.capinfo.dcxm.dmonitor.client.YerSsWClient;
import com.capinfo.dcxm.dmonitor.yerss.A5ProcessInfo;
import org.junit.Test;


public class YerSsTest {
	//W25300000	a9c72dd3db9542cc9a199f8286b554d3	253
	//W25400000	a2ca9def96264e4bb078d74bd6fae587	254
	//W26800000	56eb93276bc14058be764f384494fb04	268
	
	//W25400000	a2ca9def96264e4bb078d74bd6fae587	254	108
	//W26700000	f0eea9148341482e9d3959afc6f73b7d	267	110
	//W26600000	1f9d212b8f9e4569b4f99176d55385b6	266	112
	//W26500000	9bdd0e78a5974f4bb42806f4789bed83	265	117
	//W26400000	148e49923448406285f1d6b867ec6258	264	107
	//W26300000	f112b808098240b9bd4a341102dfbe37	263	116
	//W26200000	1cdf550e28d34726987b6cd1f82c02f1	262	103
	//W26100000	f4ad88995b9141ddaeec6f75825cc4b6	261	115
	//W26000000	bca297d9f3464580ace417b7a1d04a61	260	111
	//W25900000	09fd4ab12a194b6ca43a629cf4fd8d7c	259	113
	//W25400000	a2ca9def96264e4bb078d74bd6fae587	254	108
	//W25500000	bd3df2dd3a2643c8bfe3f3f1d1a8dea6	255	104
	//QM("W25300000","a9c72dd3db9542cc9a199f8286b554d3","253","东城区前门街道","114"),
	//LT("W25900000","09fd4ab12a194b6ca43a629cf4fd8d7c","259","东城区龙潭街道接口账号","113"),
//	HPL("W25200000","8c17442074034c0e95296d2d9c02d109","252","东城区和平里街道","109"),
//	WBJ("W101000","354bc37017284983bac0704d5fa7f90f","1","东城区","0"),
//	TYG("W26100000","f4ad88995b9141ddaeec6f75825cc4b6","261","东城区体育馆路街道接口账号","115"),
//	HPL("W25200000","8c17442074034c0e95296d2d9c02d109","252","东城区和平里街道","109"),
//	WBJ("W101000","354bc37017284983bac0704d5fa7f90f","1","东城区","0"),
//	QM("W25300000","a9c72dd3db9542cc9a199f8286b554d3","253","东城区前门街道","114"),
//	DZM("W25400000","a2ca9def96264e4bb078d74bd6fae587","254","东城区东直门街道接口账号","108"),
//	CWM("W25500000","bd3df2dd3a2643c8bfe3f3f1d1a8dea6","255","东城区崇文门外街道接口账号","104"),
//	ADM("W25600000","50cc1342df8d4e57be072df0bee693fc","256","东城区安定门街道接口账号","101"),
//	DHS("W25700000","eefd4b89bcc54956a8947e4ea62982b9","257","东城区东花市街道接口账号","105"),
//	BXQ("W25800000","39f03e5b4dc441b5b7de14ed632291a3","258","东城区北新桥街道接口账号","102"),
//	LT("W25900000","09fd4ab12a194b6ca43a629cf4fd8d7c","259","东城区龙潭街道接口账号","113"),
//	JDK("W26000000","bca297d9f3464580ace417b7a1d04a61","260","东城区交道口街道接口账号","111"),
//	TYG("W26100000","f4ad88995b9141ddaeec6f75825cc4b6","261","东城区体育馆路街道接口账号","115"),
//	CYM("W26200000","1cdf550e28d34726987b6cd1f82c02f1","262","东城区朝阳门街道接口账号","103"),
//	TT("W26300000","f112b808098240b9bd4a341102dfbe37","263","东城区天坛街道接口账号","116"),
//	DS("W26400000","148e49923448406285f1d6b867ec6258","264","东城区东四街道接口账号","107"),
//	YDM("W26500000","9bdd0e78a5974f4bb42806f4789bed83","265","东城区永定门外街道接口账号","117"),
//	JS("W26600000","1f9d212b8f9e4569b4f99176d55385b6","266","东城区景山街道接口账号","112"),
//	JGM("W26700000","f0eea9148341482e9d3959afc6f73b7d","267","东城区建国门街道接口账号","110"),
//	DHM("W26800000","56eb93276bc14058be764f384494fb04","268","东城区东华门街道","106");
	
	private String agentID="W26700000";
	private String delegateUUID="f0eea9148341482e9d3959afc6f73b7d";
	private String orderUnitID="267";
	/**
	 * 模拟结案
	 */
	@Test
	public void testendCase(){
		YerSsWClient yerSsWClient=new YerSsWClient();
		yerSsWClient.setAgentID(agentID);
		yerSsWClient.setDelegateUUID(delegateUUID);
		yerSsWClient.setOrderUnitID(orderUnitID);
		A5ProcessInfo a5ProcessInfo=new A5ProcessInfo();
		a5ProcessInfo.setHandleResult("根据匿名先生举报的居民反映赵堂子胡同10号楼违法出租的问题，6月27日，建国门街道流管办林杨、张天慧、赵家楼社区的网格助理员龚荣仅、社区流管员孙廷国一起对赵堂子胡同10号楼此情况进行了走访调查。发现赵堂子10号楼门口传达室的房屋的实有产权为“中国科技中心”的产权房。房屋的面积有7平米左右，居住在此房屋的人员，是产权方的工作人员徐加东，库房的产权也是属于产权方的。所以产权方将库房清理干净后，用于了徐加东与家人居住使用，徐加东在此负责赵堂子胡同10号楼的物业管理问题，是产权单位安排的物业管理人员，不存在违法出租情况。赵家楼社区不拥有房屋的产权，没有将房屋出租的权力。关于举报人反映有男的和女的光着膀子坐在门口的现象，赵家楼社区的网格助理员龚荣仅、社区流管员孙廷国去居住在赵堂子10号楼巡查并向周围居民李谦、张俊英、王维均询问了是否有此种现象，居民李谦、张俊英、王维均反应未出现此种情况。自行车车棚设置了铁栅栏（私有化）的问题，赵家楼社区的网格助理员龚荣仅同样也进行了核实，通过常住居民李谦、张俊英的讲解，自行车车棚是在建楼时就同步建成的施设，是为大家提供存放自行车的公共用地，不存在私有化的现象。每个居民都可以在自行车棚内对自己的电动车进行充电。举报人举报私有化不属实。举报人反映无人打扫卫生的问题，是由于居民长期不交纳卫生费，所以此楼的卫生一直无专人打扫，楼道卫生问题待居民交齐所欠多年卫生费后，派专人打扫，物业已张贴交费通知。网格员连续三天拨打匿名先生的电话均无人接听，已短信答复举报人");
		a5ProcessInfo.setA5ProcessorState(0);
		a5ProcessInfo.setID("23030621");
		a5ProcessInfo.setOrderUnitID(orderUnitID);
		boolean flag=yerSsWClient.A5ReplyResult(a5ProcessInfo);
		System.out.println("reply----"+flag);
	}

	@Test
	public void test1(){
		System.out.println(1);
	}


	
}
