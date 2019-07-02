package com.capinfo.dcxm.dmonitor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DmonitorApplicationTests {

    /*@Autowired
    private CapYesswCaseDao capYesswCaseDao;

    @Autowired
    private A15Dao a15Dao;*/


    @Test
    public void contextLoads() {

        /*List<CapYesswCase> byYesswNumber = capYesswCaseDao.findByYesswNumber("[电]20194353453");
        for (CapYesswCase capYesswCase : byYesswNumber) {
            System.out.println(capYesswCase.getYesswNumber());
        }*/
        /*CapYesswCase capYesswCase = new CapYesswCase();
        capYesswCase.setId(UUID.randomUUID().toString().replaceAll("-",""));
        capYesswCase.setYesswNumber("[电]20190628");
        capYesswCaseDao.save(capYesswCase);*/


        //A15 a15 = a15Dao.getOne("01db87e1247aeb8f2f714e700446d60fc");
        //System.out.println(a15.getId());

    }





}
