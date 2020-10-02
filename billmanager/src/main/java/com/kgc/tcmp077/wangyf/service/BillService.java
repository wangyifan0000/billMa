package com.kgc.tcmp077.wangyf.service;

import com.github.pagehelper.PageInfo;
import com.kgc.tcmp077.wangyf.entity.Bills;

import java.util.Date;

/**
 * @author wangyf
 * @create 2020-10-02 8:48
 */
public interface BillService {
    PageInfo<Bills> selectByTypeAndDate(int type, Date datestart,Date dateend,int pageNum);
    int addBill(Bills bills);
}
