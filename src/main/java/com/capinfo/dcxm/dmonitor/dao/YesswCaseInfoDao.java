package com.capinfo.dcxm.dmonitor.dao;

import com.capinfo.dcxm.dmonitor.entity.YesswCaseInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface YesswCaseInfoDao extends JpaRepository<YesswCaseInfo, String> {

    List<YesswCaseInfo> findByYesswCreatetimeAfterAndYesswCreatetimeBefore(String yesswCreatetimeBegin, String yesswCreatetimeEnd);

    List<YesswCaseInfo> findByYesswCreatetimeAfter(String beginCreatetime);

    List<YesswCaseInfo> findByYesswStatus(String yesswStatus);

}
