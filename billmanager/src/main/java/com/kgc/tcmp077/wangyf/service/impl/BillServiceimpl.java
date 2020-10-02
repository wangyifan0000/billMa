package com.kgc.tcmp077.wangyf.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.tcmp077.wangyf.entity.Bills;
import com.kgc.tcmp077.wangyf.entity.BillsExample;
import com.kgc.tcmp077.wangyf.entity.Type;
import com.kgc.tcmp077.wangyf.mapper.BillsMapper;
import com.kgc.tcmp077.wangyf.service.BillService;
import com.kgc.tcmp077.wangyf.service.TypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author wangyf
 * @create 2020-10-02 8:49
 */
@Service("BillService")
public class BillServiceimpl implements BillService {
    @Resource
    BillsMapper billsMapper;
    @Resource
    TypeService typeService;
    @Override
    public PageInfo<Bills> selectByTypeAndDate(int type, Date datestart, Date dateend, int pageNum) {
        BillsExample billsExample = new BillsExample();
        BillsExample.Criteria criteria = billsExample.createCriteria();
        if (type != 0) {
            criteria.andTypeIdEqualTo(type);
        }
        if (datestart != null) {
            criteria.andBibleTimeBetween(datestart, null);
        } else if (datestart != null && dateend != null) {
            criteria.andBibleTimeBetween(datestart, dateend);
        }
        int pageSize = 5;
        PageHelper.orderBy("bibleTime desc");
        PageHelper.startPage(pageNum, pageSize);
        List<Bills> bills = billsMapper.selectByExample(billsExample);
        PageInfo<Bills> pageInfo = new PageInfo(bills);
        return pageInfo;
    }

    @Override
    public int addBill(Bills bills) {
        int i = billsMapper.insertSelective(bills);
        return i;
    }
}
