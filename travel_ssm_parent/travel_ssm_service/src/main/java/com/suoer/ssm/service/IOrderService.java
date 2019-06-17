package com.suoer.ssm.service;

import com.suoer.ssm.domain.Orders;

import java.util.List;

public interface IOrderService {

    public List<Orders> findOrdersAll();

    public List<Orders> findAllByPage(int pageNum,int size);
}
