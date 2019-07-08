package com.capinfo.dcxm.dmonitor.dao;

import com.capinfo.dcxm.dmonitor.entity.YesswCaseInfo;
import org.hibernate.SQLQuery;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class QueryDaoImpl {

    public static final String noticeQueryStr = "select a.yessw_order_id as \"yesswNumber\",\n" +
            "       a.record_number as \"recordNumber\",\n" +
            "       a.individaul_att5 as \"cityNumber\" \n" +
            "  from (select cbr.yessw_order_id,\n" +
            "               cbr.record_number,\n" +
            "               cbr.record_id,\n" +
            "               cbr.individaul_att5,\n" +
            "               cbr.dispatch_unit\n" +
            "          from cap_busi_record cbr\n" +
            "         where cbr.now_state = '核实结案'\n" +
            "           and cbr.task_status = '已结案'\n" +
            "           and cbr.happen_date >= to_date('2019-05-20', 'yyyy-MM-dd')\n" +
            "           and cbr.source_type = '0000000000000152'\n" +
            "           and cbr.dispatch_unit != '0') a\n" +
            "\n" +
            "  left join (\n" +
            "             \n" +
            "             select distinct cny.record_id as bid\n" +
            "               from cap_notice_yerssw cny\n" +
            "              where cny.record_id in\n" +
            "                    (select cbr.record_id\n" +
            "                       from cap_busi_record cbr\n" +
            "                      where cbr.now_state = '核实结案'\n" +
            "                        and cbr.task_status = '已结案'\n" +
            "                        and cbr.happen_date >=\n" +
            "                            to_date('2019-05-20', 'yyyy-MM-dd')\n" +
            "                        and cbr.source_type = '0000000000000152'\n" +
            "                     \n" +
            "                     )\n" +
            "                and (cny.A5_Notice_Info_Type_Id = 'NA5-1' or\n" +
            "                    cny.A5_Notice_Info_Type_Id = 'NA5-2')\n" +
            "             \n" +
            "             ) b\n" +
            "    on a.record_id = b.bid\n" +
            " where b.bid is null";


    public static final String yesswHtuituiExceptionQueryStr = "select a.yessw_record_number as \"yesswNumber\",\n" +
            "        a.yessw_record_status as \"yesswStatus\",\n" +
            "        a.dead_line_time as \"recordDeadtime\"\n" +
            "  from cap_web_yessw_record a \n" +
            " where yessw_cur_status='失败'";



    @PersistenceContext
    private EntityManager entityManager;


    public List<YesswCaseInfo> executeNoticeQuery(String queryStr) {
        Query query = entityManager.createNativeQuery(queryStr);
        List<Object[]> resultList = query.getResultList();
        //return resultList;
        List<YesswCaseInfo> list = new ArrayList<YesswCaseInfo>();
        for (Object[] objects : resultList) {
            YesswCaseInfo info = new YesswCaseInfo();
            info.setYesswNumber(objects[0].toString());
            info.setRecordNumber(objects[1].toString());
            info.setCityNumber(objects[2].toString());
            list.add(info);
        }
        return list;
    }


    public List<YesswCaseInfo> executeHuituiExceptionQuery(String queryStr) {
        Query query = entityManager.createNativeQuery(queryStr);
        List<Object[]> resultList = query.getResultList();
        //return resultList;
        List<YesswCaseInfo> list = new ArrayList<YesswCaseInfo>();
        for (Object[] objects : resultList) {
            YesswCaseInfo info = new YesswCaseInfo();
            info.setYesswNumber(objects[0]!=null?objects[0].toString():"");
            info.setYesswStatus(objects[1]!=null?objects[1].toString():"");
            info.setCreateTime(objects[2]!=null?objects[2].toString():"");
            list.add(info);
        }
        return list;
    }


}
