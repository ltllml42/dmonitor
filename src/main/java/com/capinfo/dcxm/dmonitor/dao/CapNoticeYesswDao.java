package com.capinfo.dcxm.dmonitor.dao;

import com.capinfo.dcxm.dmonitor.entity.CapNoticeYerssw;
import com.capinfo.dcxm.dmonitor.entity.YesswCaseInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CapNoticeYesswDao extends JpaRepository<CapNoticeYerssw, String>, JpaSpecificationExecutor<CapNoticeYerssw> {



}
