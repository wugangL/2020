package com.qf.springbootmybatis.controller;

import com.qf.springbootmybatis.entity.Product;
import com.qf.springbootmybatis.service.ProductService;
import com.qf.springbootmybatis.service.impl.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: 吴
 * @Date: 2020/5/3 14:09
 */

@Controller
public class MyController {
    @Resource
    ProductService productService;
    @RequestMapping("/get_product/{id}")
    @ResponseBody
   public Product getProduct(@PathVariable Long id){

        return productService.getById(id);
    }

}
