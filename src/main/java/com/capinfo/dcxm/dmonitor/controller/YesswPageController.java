package com.capinfo.dcxm.dmonitor.controller;


import com.capinfo.dcxm.dmonitor.dao.YesswCaseInfoDao;
import com.capinfo.dcxm.dmonitor.entity.YesswCaseInfo;
import com.capinfo.dcxm.dmonitor.service.CaseCountService;
import com.capinfo.dcxm.dmonitor.utils.CaseCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@RequestMapping(value = "case")
@Controller
public class YesswPageController {

    @Autowired
    private YesswCaseInfoDao yesswCaseInfoDao;
    @Autowired
    private CaseCountService caseCountService;

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
        model.addAttribute("caseList", count.getCaseList());
        model.addAttribute("count", count.getCount());
        return "checkDetialList";
    }




}
