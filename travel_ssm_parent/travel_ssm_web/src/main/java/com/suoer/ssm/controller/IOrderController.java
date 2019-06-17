package com.suoer.ssm.controller;

import com.github.pagehelper.PageInfo;
import com.suoer.ssm.domain.Orders;
import com.suoer.ssm.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class IOrderController {

    @Autowired
    private IOrderService iOrderService;

    @RequestMapping("/findAll")
    public ModelAndView findOrderAll(){
        ModelAndView mv = new ModelAndView();
        List<Orders> ordersAll = iOrderService.findOrdersAll();
        mv.addObject("ordersList",ordersAll);
        mv.setViewName("orders-list");
        return mv;
    }

    @RequestMapping("/findAllByPage")
    ModelAndView findAllByPage(@RequestParam(name="pageNum",required = true,defaultValue = "1") int pageNum,@RequestParam(name = "size",required = true,defaultValue = "4") int size) {
        ModelAndView mv = new ModelAndView();
        List<Orders> ordersByPage = iOrderService.findAllByPage(pageNum,size);
        PageInfo pageInfo = new PageInfo(ordersByPage);
        mv.addObject("pageInfo", pageInfo);
        mv.setViewName("orders-page-list");
        return mv;
    }
}
