package com.capinfo.dcxm.dmonitor.dao;

import com.capinfo.dcxm.dmonitor.entity.YesswCaseInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface YesswCaseInfoDao extends JpaRepository<YesswCaseInfo, String>, JpaSpecificationExecutor<YesswCaseInfo> {

    /**
     * 查询条件中12345派单时间区间的数据
     * @param yesswCreatetimeBegin
     * @param yesswCreatetimeEnd
     * @return
     */
    List<YesswCaseInfo> findByYesswCreatetimeAfterAndYesswCreatetimeBefore(String yesswCreatetimeBegin, String yesswCreatetimeEnd);

    List<YesswCaseInfo> findByYesswCreatetimeAfter(String beginCreatetime);

    /**
     * 按12345案件状态查询
     * @param yesswStatus
     * @return
     */
    List<YesswCaseInfo> findByYesswStatus(String yesswStatus);

    /**
     * 按12345状态不等于结案的查询
     * @param yesswStatus
     * @return
     */
    List<YesswCaseInfo> findByYesswStatusNot(String yesswStatus);

    /**
     * 推送城管系统后未能获取到城管案件编号   96010案件状态   案件任务状态
     * @param recordStatus
     * @param recordTaskStatus
     * @return
     */
    List<YesswCaseInfo> findByRecordStatusAndRecordTaskStatusAndCityNumberNull(String recordStatus, String recordTaskStatus);

    /**
     * 和案件截止日期差2天以内的数据。传入当天时间+2天的值，如果截止日期字段在传入的日期之前就查出来
     * @param deadtimeQuery
     * @return
     */
    List<YesswCaseInfo> findByRecordDeadtimeBefore(String deadtimeQuery);


    //void batchSave(Iterable<YesswCaseInfo> var1);



}
