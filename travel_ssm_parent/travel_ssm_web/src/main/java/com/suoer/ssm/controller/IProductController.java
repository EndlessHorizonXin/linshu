package com.suoer.ssm.controller;

import com.suoer.ssm.domain.Product;
import com.suoer.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class IProductController {

    @Autowired
    private IProductService iProductService;

    @RequestMapping("/findAll")
    public ModelAndView findProductAll(){
        ModelAndView mv = new ModelAndView();
        List<Product> productAll = iProductService.findProductAll();
        mv.addObject("productList",productAll);
        mv.setViewName("product-list1");
        return mv;
    }

    @RequestMapping("/save")
    public String save(Product product){
        iProductService.save(product);
        return "redirect:findAll";
    }
}
