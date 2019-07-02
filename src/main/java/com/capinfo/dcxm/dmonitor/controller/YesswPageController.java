package com.capinfo.dcxm.dmonitor.controller;


import com.capinfo.dcxm.dmonitor.dao.YesswCaseInfoDao;
import com.capinfo.dcxm.dmonitor.entity.YesswCaseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@RequestMapping(value = "case")
public class YesswPageController {

    @Autowired
    private YesswCaseInfoDao yesswCaseInfoDao;

    @RequestMapping(value = "detailPage")
    public String detailPage(HttpServletRequest request, Model model) {
        String id = request.getParameter("id");
        //YesswCaseInfo caseInfo = yesswCaseInfoDao.getOne(id);
        Optional<YesswCaseInfo> info = yesswCaseInfoDao.findById(id);
        YesswCaseInfo yesswCaseInfo = info.get();
        model.addAttribute("yesswCaseInfo", yesswCaseInfo);
        return "detailsGrasp";
    }

}
