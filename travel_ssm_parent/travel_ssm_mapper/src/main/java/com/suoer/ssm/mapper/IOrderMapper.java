package com.suoer.ssm.mapper;

import com.suoer.ssm.domain.Orders;

import java.util.List;

public interface IOrderMapper {

    public List<Orders> findOrdersAll();

    public List<Orders> findAllByPage();

}