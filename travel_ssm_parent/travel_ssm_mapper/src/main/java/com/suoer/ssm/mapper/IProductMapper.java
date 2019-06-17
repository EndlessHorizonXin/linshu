package com.suoer.ssm.mapper;

import com.suoer.ssm.domain.Product;

import java.util.List;

public interface IProductMapper {

    public List<Product> findProductAll();

    public void save(Product product);

}
