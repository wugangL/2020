package com.qf.springbootmybatis.service.impl;

import com.qf.springbootmybatis.dao.ProductDao;
import com.qf.springbootmybatis.entity.Product;
import com.qf.springbootmybatis.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: 吴
 * @Date: 2020/5/3 14:00
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    ProductDao productDao;
    @Override
    public Product getById(Long id) {
        System.out.println(id);
        return productDao.selectByPrimaryKey(id);
    }
}
