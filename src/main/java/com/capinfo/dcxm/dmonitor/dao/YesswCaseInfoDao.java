package com.capinfo.dcxm.dmonitor.dao;

import com.capinfo.dcxm.dmonitor.entity.YesswCaseInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface YesswCaseInfoDao extends JpaRepository<YesswCaseInfo, String> {

    List<YesswCaseInfo> findByYesswCreatetimeAfterAndYesswCreatetimeBefore(String yesswCreatetimeBegin, String yesswCreatetimeEnd);

    Page<YesswCaseInfo> findFirst20ByYesswCreatetimeAfterAndYesswCreatetimeBefore(String yesswCreatetimeBegin, String yesswCreatetimeEnd, Pageable pageable);

    Page<YesswCaseInfo> findByYesswNumber(String yesswNumber, Pageable pageable);

    List<YesswCaseInfo> findByYesswCreatetimeAfter(String beginCreatetime);

    List<YesswCaseInfo> findByYesswStatus(String yesswStatus);

    List<YesswCaseInfo> findByYesswStatusNot(String yesswStatus);

}
