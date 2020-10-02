package com.kgc.tcmp077.wangyf.controller;

import com.github.pagehelper.PageInfo;
import com.kgc.tcmp077.wangyf.entity.Bills;
import com.kgc.tcmp077.wangyf.service.impl.BillServiceimpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.management.modelmbean.ModelMBeanOperationInfo;
import java.util.Date;

/**
 * @author wangyf
 * @create 2020-10-02 9:10
 */
@Controller
public class BillController {
    @Resource
    BillServiceimpl billServiceimpl;
    @RequestMapping("/")
    public String toselect(int type, Date datestart, Date dateend, int pageNum, Model model){
        PageInfo<Bills> billsPageInfo = billServiceimpl.selectByTypeAndDate(type, datestart, dateend, pageNum);
        model.addAttribute("pageInfo",billsPageInfo);
        return "main";
    }
    @RequestMapping("/insertBill")
    public String toaddBill(int type,String title,Date date,int price,String explian){
        Bills bills=new Bills();
        bills.setId(null);
        bills.setTitle(title);
        bills.setTypeId(type);
        bills.setBibleTime(date);
        bills.setExplian(explian);
        bills.setPrice(price);
        int i = billServiceimpl.addBill(bills);
        return "redirect:/";
    }
}
