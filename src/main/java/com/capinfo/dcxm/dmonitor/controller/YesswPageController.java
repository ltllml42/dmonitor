package com.capinfo.dcxm.dmonitor.controller;


import com.capinfo.dcxm.dmonitor.client.YerSsWClient;
import com.capinfo.dcxm.dmonitor.dao.CapBusiRecordDao;
import com.capinfo.dcxm.dmonitor.dao.YesswCaseInfoDao;
import com.capinfo.dcxm.dmonitor.entity.CapBusiRecord;
import com.capinfo.dcxm.dmonitor.entity.StreetEntity;
import com.capinfo.dcxm.dmonitor.entity.YesswCaseInfo;
import com.capinfo.dcxm.dmonitor.enums.NoticeInfoTypeEnum;
import com.capinfo.dcxm.dmonitor.enums.StreeAccountEnum;
import com.capinfo.dcxm.dmonitor.factory.YerssClientFactory;
import com.capinfo.dcxm.dmonitor.service.CaseCountService;
import com.capinfo.dcxm.dmonitor.utils.CaseCount;
import com.capinfo.dcxm.dmonitor.utils.Constant;
import com.capinfo.dcxm.dmonitor.yerss.A5Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequestMapping(value = "case")
@Controller
public class YesswPageController {

    @Autowired
    private YesswCaseInfoDao yesswCaseInfoDao;
    @Autowired
    private CaseCountService caseCountService;
    @Autowired
    private CapBusiRecordDao capBusiRecordDao;

    /**
     * 查看详情
     * @param request
     * @param model
     * @return
     */
    @RequestMapping(value = "detailPage")
    public String detailPage(HttpServletRequest request, Model model) {
        String id = request.getParameter("id");
        //YesswCaseInfo caseInfo = yesswCaseInfoDao.getOne(id);
        Optional<YesswCaseInfo> info = yesswCaseInfoDao.findById(id);
        YesswCaseInfo yesswCaseInfo = info.get();
        model.addAttribute("yesswCaseInfo", yesswCaseInfo);
        return "detailsGrasp";
    }

    /**
     * 查看反查数据时候跳的页面。查出一个对应数量的list
     * @param request
     * @param model
     * @return
     */
    @RequestMapping(value = "checkDetialList")
    public String checkDetialList(HttpServletRequest request, Model model) {
        String type = request.getParameter("type");
        CaseCount count = caseCountService.getCount(type, "check");
        //如果是   12345已经结案，未发通知  的，再在数据库里查一遍时间和状态方便反查
        if (Constant.TYPE_YESSWFINISH_NOTICE.equals(type) || Constant.TYPE_YESSWHUITUI_EXCEPTION.equals(type)) {
            List<YesswCaseInfo> caseList = new ArrayList<YesswCaseInfo>();
            List<String> yesswNumberList = new ArrayList<String>();
            for (YesswCaseInfo yesswCaseInfo : count.getCaseList()) {
                yesswNumberList.add(yesswCaseInfo.getYesswNumber());
            }
            List<CapBusiRecord> byYesswOrderIdIn = capBusiRecordDao.findByYesswOrderIdIn(yesswNumberList);
            if (Constant.TYPE_YESSWFINISH_NOTICE.equals(type)) {
                for (CapBusiRecord capBusiRecord : byYesswOrderIdIn) {
                    YesswCaseInfo yessw = new YesswCaseInfo();
                    yessw.setYesswNumber(capBusiRecord.getYesswOrderId());
                    yessw.setYesswCreatetime(capBusiRecord.getYessStartTime());
                    yessw.setRecordNumber(capBusiRecord.getRecordNumber());
                    yessw.setRecordStatus(capBusiRecord.getNowState());
                    yessw.setRecordTaskStatus(capBusiRecord.getTaskStatus());
                    yessw.setCityNumber(capBusiRecord.getIndividaulAtt5());
                    caseList.add(yessw);
                }
            } else if (Constant.TYPE_YESSWHUITUI_EXCEPTION.equals(type)) {
                for (YesswCaseInfo yesswCaseInfo : count.getCaseList()) {
                    for (CapBusiRecord capBusiRecord : byYesswOrderIdIn) {
                        if (yesswCaseInfo.getYesswNumber().equals(capBusiRecord.getYesswOrderId())) {
                            yesswCaseInfo.setYesswCreatetime(capBusiRecord.getYessStartTime());
                            yesswCaseInfo.setRecordNumber(capBusiRecord.getRecordNumber());
                            yesswCaseInfo.setRecordStatus(capBusiRecord.getNowState());
                            yesswCaseInfo.setRecordTaskStatus(capBusiRecord.getTaskStatus());
                            yesswCaseInfo.setCityNumber(capBusiRecord.getIndividaulAtt5());
                            caseList.add(yesswCaseInfo);
                            break;
                        }
                    }
                }
            }
            model.addAttribute("caseList", caseList);
        } else {
            model.addAttribute("caseList", count.getCaseList());
        }
        model.addAttribute("count", count.getCount());
        return "checkDetialList";
    }


    @RequestMapping(value = "getCaseByStreet")
    public String getCaseByStreet(HttpServletRequest request, Model model) {

        String duallist = request.getParameter("duallist");
        String[] dualLists = duallist.split(",");
        List<StreetEntity> streetList = new ArrayList<StreetEntity>();
        for (String str : dualLists) {
            for (StreeAccountEnum streeAccountEnum : StreeAccountEnum.values()) {
                if (str.equals(streeAccountEnum.getDispatchUnit())) {
                    StreetEntity street = new StreetEntity();
                    street.setName(streeAccountEnum.getName());
                    street.setAgentID(streeAccountEnum.getAgentID());
                    street.setDelegateUUID(streeAccountEnum.getDelegateUUID());
                    street.setOrderUnitID(streeAccountEnum.getOrderUnitID());
                    street.setDispatchUnit(streeAccountEnum.getDispatchUnit());
                    streetList.add(street);
                    break;
                }
            }
        }

        List<A5Notice> allA5Notice= new ArrayList<A5Notice>();
        for (StreetEntity streetEntity : streetList) {
            YerSsWClient yerSsWClient=YerssClientFactory.getClient(streetEntity.getDelegateUUID(), streetEntity.getAgentID(), streetEntity.getOrderUnitID());

            try {
                List<A5Notice> listA5Notice = yerSsWClient.queryNotices();
                for (A5Notice a5Notice : listA5Notice) {
                    for (NoticeInfoTypeEnum noticeInfoTypeEnum : NoticeInfoTypeEnum.values()) {
                        if (a5Notice.getNoticeInfoType().equals(noticeInfoTypeEnum.getNoticeInfoType())) {
                            a5Notice.setNoticeInfoType(noticeInfoTypeEnum.getRemarks());
                            break;
                        }
                    }
                    allA5Notice.add(a5Notice);
                }
            } catch (Exception e) {
                e.printStackTrace();
                continue;
            }
        }
        model.addAttribute("allA5Notice", allA5Notice);
        model.addAttribute("count", allA5Notice.size());
        return "a5Notice";
    }


}
