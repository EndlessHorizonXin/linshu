package com.suoer.ssm.service;

import com.suoer.ssm.domain.Product;

import java.util.List;

public interface IProductService {

    public List<Product> findProductAll();

    public void save(Product product);

}
