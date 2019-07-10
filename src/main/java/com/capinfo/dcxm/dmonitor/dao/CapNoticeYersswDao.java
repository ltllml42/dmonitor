package com.capinfo.dcxm.dmonitor.dao;

import com.capinfo.dcxm.dmonitor.entity.CapBusiRecord;
import com.capinfo.dcxm.dmonitor.entity.CapNoticeYerssw;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CapNoticeYersswDao extends JpaRepository<CapNoticeYerssw, String> {
    List<CapNoticeYerssw> findByRecordIdAndA5NoticeInfoTypeId(String recordId,String a5NoticeInfoTypeId);


}
