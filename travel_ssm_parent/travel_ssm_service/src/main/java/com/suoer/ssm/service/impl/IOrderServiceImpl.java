package com.suoer.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.suoer.ssm.domain.Orders;
import com.suoer.ssm.mapper.IOrderMapper;
import com.suoer.ssm.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IOrderServiceImpl implements IOrderService {

    @Autowired
    private IOrderMapper iOrderMapper;

    public List<Orders> findOrdersAll() {
        return iOrderMapper.findOrdersAll();
    }

    public List<Orders> findAllByPage(int pageNum, int size) {
        PageHelper.startPage(pageNum,size);
        return iOrderMapper.findAllByPage();
    }

}
