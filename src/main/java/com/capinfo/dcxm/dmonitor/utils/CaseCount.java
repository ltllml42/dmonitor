package com.capinfo.dcxm.dmonitor.utils;

import com.capinfo.dcxm.dmonitor.entity.YesswCaseInfo;
import lombok.Data;

import java.util.List;

@Data
public class CaseCount {


    private String type;

    private String count;

    private String info;

    private List<YesswCaseInfo> caseList;

}
