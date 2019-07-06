package com.capinfo.dcxm.dmonitor.dao;

import com.capinfo.dcxm.dmonitor.entity.CapObtainRecord;
import com.capinfo.dcxm.dmonitor.entity.YesswCaseInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Date;
import java.util.List;

public interface CapObtainRecordDao extends JpaRepository<CapObtainRecord, String>, JpaSpecificationExecutor<CapObtainRecord> {

    List<CapObtainRecord> findByObtainTimeAfter(Date date);


}
