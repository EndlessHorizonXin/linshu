package com.suoer.ssm.service.impl;

import com.suoer.ssm.domain.Product;
import com.suoer.ssm.mapper.IProductMapper;
import com.suoer.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("iProductMapper")
public class IProductServiceImpl implements IProductService {

    @Autowired
    private IProductMapper iProductMapper;

    public List<Product> findProductAll() {
        return iProductMapper.findProductAll();
    }

    public void save(Product product) {
        iProductMapper.save(product);
    }
}
