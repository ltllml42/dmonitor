package com.capinfo.dcxm.dmonitor.dao;

import com.capinfo.dcxm.dmonitor.entity.CapBusiRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface CapBusiRecordDao extends JpaRepository<CapBusiRecord, String> {

    List<CapBusiRecord> findByYesswOrderId(String yesswOrderId);
    List<CapBusiRecord> findByRecordNumber(String recordNumber);

    List<CapBusiRecord> findByYesswOrderIdIn(List<String> yesswOrderIds);


}
